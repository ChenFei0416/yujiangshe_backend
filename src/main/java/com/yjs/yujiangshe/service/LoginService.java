package com.yjs.yujiangshe.service;

import com.yjs.yujiangshe.entity.User;
import com.yjs.yujiangshe.entity.UserInfo;

/**
 * @Desc 登录service
 * @Author ChenFei
 * @Date 2020/7/21 10:35
 */
public interface LoginService {
    User getUserByUsername(String username);
    void updateUserByToken(User user);
    UserInfo getUserInfoByToken(String token);
}
