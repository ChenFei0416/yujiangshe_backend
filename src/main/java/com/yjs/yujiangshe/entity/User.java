package com.yjs.yujiangshe.entity;

import lombok.Data;

/**
 * @Desc 登录用户信息实体类
 * @Author ChenFei
 * @Date 2020/7/16 17:56
 */

@Data
public class User {
    private String id;
    private String username;
    private String password;

    public User(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
