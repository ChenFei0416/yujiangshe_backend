package com.yjs.yujiangshe.exception;

import com.yjs.yujiangshe.vo.Result;
import com.yjs.yujiangshe.vo.ResultEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Desc 全局异常处理类
 * @Author ChenFei
 * @Date 2020/7/16 16:02
 */

@ControllerAdvice
public class GlobalExceptionResolver {

    private static final Logger LOG = LoggerFactory.getLogger(GlobalExceptionResolver.class);

    /**
     * 处理所有不可知异常
     *
     * @param e 异常
     * @return json结果
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result handleException(Exception e) {
        // 打印异常堆栈信息
        LOG.error(e.getMessage(), e);
        return Result.of(ResultEnum.FAIL);
    }

    /**
     * 处理所有业务异常
     *
     * @param e 业务异常
     * @return json结果
     */
    @ExceptionHandler(BusinessRuntimeException.class)
    @ResponseBody
    public Result handleOpdRuntimeException(BusinessRuntimeException e) {
        // 不打印异常堆栈信息
        LOG.error(e.getMsg());
        return Result.of(e.getResultEnum());
    }
}
