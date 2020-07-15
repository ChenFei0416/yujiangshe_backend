package com.yjs.yujiangshe.service.impl;

import com.yjs.yujiangshe.dao.SubmitOrderedCourseMapper;
import com.yjs.yujiangshe.entity.OrderInfo;
import com.yjs.yujiangshe.service.SubmitOrderedCourse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Service
public class SubmitOrderedCourseImpl implements SubmitOrderedCourse {

    @Resource
    SubmitOrderedCourseMapper submitOrderedCourseMapper;

    @Override
    public void submitOrderedCourse(OrderInfo orderInfo) {
        submitOrderedCourseMapper.submitOrderedCourseMapper(orderInfo);
    }
}
