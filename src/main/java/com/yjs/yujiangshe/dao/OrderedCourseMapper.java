package com.yjs.yujiangshe.dao;

import com.yjs.yujiangshe.entity.OrderInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderedCourseMapper {
    void submitOrderedCourse(OrderInfo orderInfo);
    List<OrderInfo> getOrderedCourseAll();
    void updateOrderedCourse(@Param(value = "orderInfo") OrderInfo orderInfo);
}
