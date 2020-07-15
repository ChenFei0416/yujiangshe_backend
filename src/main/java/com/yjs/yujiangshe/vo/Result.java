package com.yjs.yujiangshe.vo;

import lombok.Data;

/**
 * @Desc 封装一个统一返回的信息类
 * @Author ChenFei
 * @Date 2020/7/15 17:56
 */

@Data
public class Result {
    private Boolean status = true;
    private String msg;
}
