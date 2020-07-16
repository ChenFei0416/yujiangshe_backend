package com.yjs.yujiangshe.controller;

import com.yjs.yujiangshe.entity.OrderInfo;
import com.yjs.yujiangshe.exception.BusinessRuntimeException;
import com.yjs.yujiangshe.service.SubmitOrderedCourseService;
import com.yjs.yujiangshe.utils.ResultUtil;
import com.yjs.yujiangshe.vo.Result;
import com.yjs.yujiangshe.vo.ResultEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order",method = RequestMethod.GET)
@CrossOrigin
public class OrderedCourseController {

    @Autowired
    SubmitOrderedCourseService submitOrderedCourse;

    @RequestMapping("/submitOrderedCourse")
    public Result submitOrderedCourse(OrderInfo orderInfo){
        if(orderInfo!=null){
            submitOrderedCourse.submitOrderedCourse(orderInfo);
            return ResultUtil.success(orderInfo);
        }else {
            throw new BusinessRuntimeException(ResultEnum.RESULT_NULL);
        }
    }
}
