package com.yjs.yujiangshe.service.impl;

import com.yjs.yujiangshe.dao.LoginMapper;
import com.yjs.yujiangshe.entity.User;
import com.yjs.yujiangshe.entity.UserInfo;
import com.yjs.yujiangshe.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Desc 登录实现类
 * @Author ChenFei
 * @Date 2020/7/21 10:36
 */

@Transactional
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public User getUserByUsername(String username) {
        return loginMapper.getUserByUsername(username);
    }

    @Override
    public void updateUserByToken(User user) {
        loginMapper.updateUserByToken(user);
    }

    @Override
    public UserInfo getUserInfoByToken(String token) {
        return loginMapper.getUserInfoByToken(token);
    }

}
