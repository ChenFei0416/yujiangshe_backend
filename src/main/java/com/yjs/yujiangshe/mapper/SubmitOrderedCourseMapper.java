package com.yjs.yujiangshe.mapper;

import com.yjs.yujiangshe.po.OrderInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface SubmitOrderedCourseMapper {
    void submitOrderedCourseMapper(OrderInfo orderInfo);
}
