package com.yjs.yujiangshe.utils;

import com.yjs.yujiangshe.vo.Result;
import com.yjs.yujiangshe.vo.ResultEnum;

/**
 * @Desc 封装一个成功处理结果返回Result对象的类
 * @Author ChenFei
 * @Date 2020/7/16 17:09
 */
public class ResultUtil {
    public static Result success(Object data) {
        Result result = new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage());
        result.setData(data);
        return result;
    }
}
