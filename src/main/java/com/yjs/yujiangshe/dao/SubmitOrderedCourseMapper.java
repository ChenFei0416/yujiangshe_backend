package com.yjs.yujiangshe.dao;

import com.yjs.yujiangshe.entity.OrderInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface SubmitOrderedCourseMapper {
    void submitOrderedCourseMapper(OrderInfo orderInfo);
}
