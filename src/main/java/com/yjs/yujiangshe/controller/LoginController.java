package com.yjs.yujiangshe.controller;

import com.yjs.yujiangshe.entity.Token;
import com.yjs.yujiangshe.entity.TokenResult;
import com.yjs.yujiangshe.entity.User;
import com.yjs.yujiangshe.entity.UserInfo;
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
    public TokenResult login(@RequestBody User user){
        System.out.println(user.toString());
        TokenResult t = new TokenResult();
        t.setCode("20000");
        t.setData(new Token());
        System.out.println(t.toString());
        return t;
    }

    @GetMapping(value = "/info")
    public TokenResult getInfo(){
        TokenResult t = new TokenResult();
        t.setCode("20000");
        t.setData(new UserInfo());
        System.out.println(t.toString());
        return t;
    }

}
