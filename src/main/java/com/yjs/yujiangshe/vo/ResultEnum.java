package com.yjs.yujiangshe.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @Desc 状态码枚举类
 * @Author ChenFei
 * @Date 2020/7/16 14:46
 */

@AllArgsConstructor
public enum ResultEnum {
    //Common
    FAIL("1", "未知错误"),
    SUCCESS("200", "Success"),

    //Request
    TOKENFAIL("1001", "token验证失败"),
    PARAM_FAIL("1002", "参数为空或所传参数类型不正确"),
    REPEAT_SUBMIT("1003", "重复提交"),
    RESULT_NULL("1004", "查询对象为空或对象不存在"),

    //Exception
    EXCEPTION("301", "请求存在异常"),
    REQUEST_ERROR("401", "请求存在异常"),
    SYS_ERROR("501", "系统内部错误"),

    //User   100-199
    USER_IS_NULL("101", "用户不存在"),
    PASSWORD_FAIL("102", "您的密码错误!"),
    CAPTCH_FAIL("103", "验证码错误"),
    AUDITFAIL("104", "禁用"),
    AUDITING("105", "审核中"),
    MENU_FAIL("106", "菜单创建失败"),
    REDIS_IS_NULL("107", "redis中不存在此数据"),
    PHONE_REPEAT("108", "您的手机号已被注册"),
    PHONE_NOT("109", "您的手机号还没有注册"),
    ISBLACK("113", "已加入黑名单"),
    NOBLACK("114", "未加入黑名单"),
    DEVICES_REPEAT("701", "此设备已被注册"),

    //file
    FILEMISS("118", "文件不存在"),
    FILETOOBIG("119", "文件过大"),
    FILEUPLOADFAIL("120", "文件上传失败");

    @Getter
    @Setter
    private String code;
    @Getter
    @Setter
    private String message;
}

