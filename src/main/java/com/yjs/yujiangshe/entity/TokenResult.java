package com.yjs.yujiangshe.entity;

import lombok.Data;

/**
 * @Desc 用户第一次登陆返回一个token值
 * @Author ChenFei
 * @Date 2020/7/20 16:40
 */

@Data
public class TokenResult<T> {

    private String code;
    private T data;

}
