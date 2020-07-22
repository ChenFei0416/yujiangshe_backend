package com.yjs.yujiangshe.controller;

import com.yjs.yujiangshe.entity.User;
import com.yjs.yujiangshe.entity.UserInfo;
import com.yjs.yujiangshe.exception.BusinessRuntimeException;
import com.yjs.yujiangshe.service.LoginService;
import com.yjs.yujiangshe.utils.MD5Util;
import com.yjs.yujiangshe.utils.ResultUtil;
import com.yjs.yujiangshe.vo.Result;
import com.yjs.yujiangshe.vo.ResultEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Desc 登录控制器,登录逻辑是前端进行基本的判断，传到后台的数据初步过滤
 *       根据用户名密码查数据库判断是否正确
 *       生成token存数据库同时返回给前端存入cookie
 *       同时查询userInfo返回给前端
 * @Author ChenFei
 * @Date 2020/7/16 17:54
 */

@RestController
@RequestMapping(value = "/user")
@CrossOrigin
@Api(tags = "登录控制器")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @ApiOperation("登录判断")
    @ApiImplicitParam(name = "user",value = "用户实体",dataType = "com.yjs.yujiangshe.entity.User")
    @PostMapping(value = "/login")
    public Result login(@RequestBody User user){
        try{
            final User u = loginService.getUserByUsername(user.getUsername());
            if(!user.getPassword().equals(u.getPassword())){
                throw new BusinessRuntimeException(ResultEnum.PASSWORD_FAIL);
            }
            //验证通过就根据用户名生成token
            final String token = MD5Util.encrypt(user.getUsername()+System.currentTimeMillis());
            u.setToken(token);

            //更新数据库,将token存入数据库，下次获取用户信息时就根据该token来获取
            loginService.updateUserByToken(u);
            return ResultUtil.success(u);
        }catch (NullPointerException e){
            throw new BusinessRuntimeException(ResultEnum.USER_IS_NULL);
        }
    }

    @ApiOperation("查询用户信息")
    @ApiImplicitParam(name = "token",value = "登录用户token",dataType = "String")
    @GetMapping(value = "/info")
    public Result getInfo(String token){
        try {
            UserInfo userInfo = loginService.getUserInfoByToken(token);
            System.out.println(userInfo.toString());
            return ResultUtil.success(userInfo);
        }catch (Exception e){
            throw new BusinessRuntimeException(ResultEnum.TOKENFAIL);
        }
    }

    @ApiOperation("登出")
    @PostMapping(value = "/logout")
    public Result logout(){
        return ResultUtil.success(null);
    }
}
