package com.yjs.yujiangshe.controller;

import com.yjs.yujiangshe.po.OrderInfo;
import com.yjs.yujiangshe.service.impl.SubmitOrderedCourseImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.Date;

@Controller
@RequestMapping(value = "/order",method = RequestMethod.GET)
public class OrderedCourse {

    @Resource
    SubmitOrderedCourseImpl submitOrderedCourseImpl;

    @RequestMapping("/submitOrderedCourse")
    @ResponseBody
    public OrderInfo submitOrderedCourse(OrderInfo orderInfo){
        System.out.println(orderInfo.toString());
        submitOrderedCourseImpl.submitOrderedCourse(orderInfo);
        return orderInfo;
    }

    @RequestMapping("/test")
    @ResponseBody
    public String getOrderedCourse(){
        System.out.println("小程序请求");
        return "小程序请求";
    }

}
