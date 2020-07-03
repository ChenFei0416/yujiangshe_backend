package com.yjs.yujiangshe.service;

import com.yjs.yujiangshe.po.OrderInfo;
import org.springframework.stereotype.Service;

@Service
public interface SubmitOrderedCourse {

    void submitOrderedCourse(OrderInfo orderInfo);

}
