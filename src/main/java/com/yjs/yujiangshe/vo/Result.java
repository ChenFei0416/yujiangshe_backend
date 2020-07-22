package com.yjs.yujiangshe.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Desc 封装一个统一返回的信息类
 * @Author ChenFei
 * @Date 2020/7/15 17:56
 */

@ApiModel("统一返回信息实体")
@Data
public class Result<T> implements Serializable {
    @ApiModelProperty("状态码")
    private String code;
    @ApiModelProperty("消息描述")
    private String msg;
    @ApiModelProperty("返回的数据")
    private T data;

    private Result(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMessage();
    }

    /**
     * 自定义一个构造器用于ResultUtil统一返回成功调用之后的值
     */
    public Result(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 生成一个ApiResult对象, 并返回
     *
     * @param resultEnum 枚举类状态码
     * @return 统一返回Result对象
     */
    public static Result of(ResultEnum resultEnum) {
        return new Result(resultEnum);
    }

}
