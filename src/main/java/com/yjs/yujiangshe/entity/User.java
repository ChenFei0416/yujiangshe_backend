package com.yjs.yujiangshe.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Desc 登录用户信息实体类
 * @Author ChenFei
 * @Date 2020/7/16 17:56
 */

@ApiModel("后台登录用户实体")
@Data
public class User {
    @ApiModelProperty("登录用户id")
    private String id;

    @ApiModelProperty("登录用户名")
    private String username;

    @ApiModelProperty("登录用户密码")
    private String password;

    @ApiModelProperty("登录用户token")
    private String token;

    @ApiModelProperty("登录用户的角色信息")
    private String roleId;

}
