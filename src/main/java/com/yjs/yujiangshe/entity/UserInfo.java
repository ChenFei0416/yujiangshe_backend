package com.yjs.yujiangshe.entity;

import lombok.Data;

/**
 * @Desc
 * @Author ChenFei
 * @Date 2020/7/20 17:58
 */

@Data
public class UserInfo {
    private String[] roles = {"admin"};
    private String introduction = "I am a super administrator";
    private String avatar = "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif";
    private String name = "Super Admin";
}
