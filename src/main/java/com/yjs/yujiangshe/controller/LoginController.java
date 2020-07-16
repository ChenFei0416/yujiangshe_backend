package com.yjs.yujiangshe.controller;

import com.yjs.yujiangshe.entity.User;
import com.yjs.yujiangshe.utils.ResultUtil;
import com.yjs.yujiangshe.vo.Result;
import org.springframework.web.bind.annotation.*;

/**
 * @Desc 登录控制器
 * @Author ChenFei
 * @Date 2020/7/16 17:54
 */

@RestController
@RequestMapping(value = "/user")
@CrossOrigin
public class LoginController {

    @PostMapping(value = "/login")
    public Result login(@RequestBody User user){
        System.out.println(user.toString());
        return new ResultUtil().success(user);
    }

}
