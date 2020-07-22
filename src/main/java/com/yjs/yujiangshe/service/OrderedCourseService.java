package com.yjs.yujiangshe.service;

import com.yjs.yujiangshe.entity.OrderInfo;

import java.util.List;

public interface OrderedCourseService {

    void submitOrderedCourse(OrderInfo orderInfo);
    List<OrderInfo> getOrderedCourseAll();
}
