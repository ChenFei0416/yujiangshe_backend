package com.yjs.yujiangshe.dao;

import com.yjs.yujiangshe.entity.User;
import com.yjs.yujiangshe.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Desc 登录dao
 * @Author ChenFei
 * @Date 2020/7/21 10:30
 */

@Repository
public interface LoginMapper {

    User getUserByUsername(@Param(value = "username") String username);

    void updateUserByToken(@Param(value = "user") User user);

    UserInfo getUserInfoByToken(@Param(value = "token")String token);

}
