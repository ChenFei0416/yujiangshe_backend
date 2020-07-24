package com.yjs.yujiangshe.controller;

import com.github.pagehelper.PageInfo;
import com.yjs.yujiangshe.entity.OrderInfo;
import com.yjs.yujiangshe.exception.BusinessRuntimeException;
import com.yjs.yujiangshe.service.OrderedCourseService;
import com.yjs.yujiangshe.utils.ResultUtil;
import com.yjs.yujiangshe.vo.Result;
import com.yjs.yujiangshe.vo.ResultEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/order")
@CrossOrigin
@Api(tags = "预定课程控制器")
public class OrderedCourseController {

    @Autowired
    OrderedCourseService submitOrderedCourse;

    @ApiOperation("提交预定课程信息至数据库")
    @ApiImplicitParam(name = "orderInfo",value = "订单信息实体",dataType = "com.yjs.yujiangshe.entity.OrderInfo")
    @GetMapping("/submitOrderedCourse")
    public Result submitOrderedCourse(OrderInfo orderInfo){
        if(orderInfo!=null){
            submitOrderedCourse.submitOrderedCourse(orderInfo);
            return ResultUtil.success(orderInfo);
        }else {
            throw new BusinessRuntimeException(ResultEnum.RESULT_NULL);
        }
    }

    @ApiOperation("获取所有已预定课程信息，返回给前端渲染表格")
    @GetMapping("/getOrderedCourseAll")
    public Result OrderedCourse(@RequestParam(value="pageNum", defaultValue="1")Integer pageNum,
                                @RequestParam(defaultValue = "15") Integer pageSize){
        PageInfo<OrderInfo> pageInfo = submitOrderedCourse.getOrderedCourseAll(pageNum, pageSize);
        return ResultUtil.success(pageInfo);
    }

    @ApiOperation("编辑已预定课程信息")
    @PostMapping("/updateOrderedCourse")
    public Result OrderedCourse(OrderInfo orderInfo){
        System.out.println(orderInfo);
        return submitOrderedCourse.updateOrderedCourse(orderInfo);
    }
}
