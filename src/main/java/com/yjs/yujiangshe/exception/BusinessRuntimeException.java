package com.yjs.yujiangshe.exception;

import com.yjs.yujiangshe.vo.ResultEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Desc 自定义业务异常类
 * @Author ChenFei
 * @Date 2020/7/16 16:00
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class BusinessRuntimeException extends RuntimeException {
        /**
         * 结果码
         */
        private String code;

        /**
         * 结果码描述
         */
        private String msg;

        /**
         * 结果码枚举
         */
        private ResultEnum resultEnum;

        public BusinessRuntimeException(ResultEnum resultEnum) {
            super(resultEnum.getMessage());
            this.code = resultEnum.getCode();
            this.msg = resultEnum.getMessage();
            this.resultEnum = resultEnum;
        }
}
