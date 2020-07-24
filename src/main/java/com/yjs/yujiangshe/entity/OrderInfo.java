package com.yjs.yujiangshe.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@ApiModel("预定课程订单实体")
@Data
public class OrderInfo {
    @ApiModelProperty("订单编号")
    private String courseId;

    @ApiModelProperty("订单类型")
    private String type;

    @ApiModelProperty("预定时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date date;

    @ApiModelProperty("预定课程标题")
    private String title;

    @ApiModelProperty("预定用户姓名")
    private String name;

    @ApiModelProperty("预定用户电话")
    private String phone;

}
