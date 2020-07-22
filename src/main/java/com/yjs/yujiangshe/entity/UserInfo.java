package com.yjs.yujiangshe.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Desc 生成完token之后查询用户信息
 * @Author ChenFei
 * @Date 2020/7/20 17:58
 */

@ApiModel("用户详细信息实体")
@Data
public class UserInfo {
    @ApiModelProperty("用户拥有的角色集合")
    //private String[] role;  //前端示例的返回值就需要该数据类型是数组的。。。
    private String role;

    @ApiModelProperty("角色描述")
    private String introduction;

    @ApiModelProperty("角色对应的动态图标地址")
    private String avatar;

    @ApiModelProperty("角色名")
    private String name;
}
