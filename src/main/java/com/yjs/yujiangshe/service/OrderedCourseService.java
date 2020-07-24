package com.yjs.yujiangshe.service;

import com.github.pagehelper.PageInfo;
import com.yjs.yujiangshe.entity.OrderInfo;
import com.yjs.yujiangshe.vo.Result;

public interface OrderedCourseService {
    void submitOrderedCourse(OrderInfo orderInfo);
    PageInfo<OrderInfo> getOrderedCourseAll(Integer pageNum, Integer pageSize);
    Result updateOrderedCourse(OrderInfo orderInfo);
}
