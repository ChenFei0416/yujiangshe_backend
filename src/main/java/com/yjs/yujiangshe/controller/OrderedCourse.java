package com.yjs.yujiangshe.controller;

import com.yjs.yujiangshe.entity.OrderInfo;
import com.yjs.yujiangshe.service.SubmitOrderedCourse;
import com.yjs.yujiangshe.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/order",method = RequestMethod.GET)
@CrossOrigin
public class OrderedCourse {

    @Autowired
    SubmitOrderedCourse submitOrderedCourse;

    @RequestMapping("/submitOrderedCourse")
    public Result submitOrderedCourse(OrderInfo orderInfo){
        Result result = new Result();
        try{
            System.out.println(orderInfo.toString());
            submitOrderedCourse.submitOrderedCourse(orderInfo);
            result.setMsg("小程序预定课程信息提交成功");
        }catch (Exception e){
            e.printStackTrace();
            result.setStatus(false);
            result.setMsg("小程序预定课程信息提交失败");
        }
        return result;
    }

}
