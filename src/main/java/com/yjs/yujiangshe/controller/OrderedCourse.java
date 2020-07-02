package com.yjs.yujiangshe.controller;

import com.yjs.yujiangshe.po.OrderInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/order")
public class OrderedCourse {

    @RequestMapping("/getOrderedCourse")
    @ResponseBody
    public String getOrderedCourse(@RequestBody OrderInfo orderInfo){
        System.out.println(orderInfo.toString());
        return orderInfo.toString();
    }

    @RequestMapping("/test")
    @ResponseBody
    public String getOrderedCourse(){
        System.out.println("小程序请求");
        return "小程序请求";
    }

}
