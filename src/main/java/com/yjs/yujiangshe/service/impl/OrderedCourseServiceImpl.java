package com.yjs.yujiangshe.service.impl;

import com.yjs.yujiangshe.dao.OrderedCourseMapper;
import com.yjs.yujiangshe.entity.OrderInfo;
import com.yjs.yujiangshe.service.OrderedCourseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service
public class OrderedCourseServiceImpl implements OrderedCourseService {

    @Resource
    OrderedCourseMapper orderedCourseMapper;

    @Override
    public void submitOrderedCourse(OrderInfo orderInfo) {
        orderedCourseMapper.submitOrderedCourse(orderInfo);
    }

    @Override
    public List<OrderInfo> getOrderedCourseAll() {
        return orderedCourseMapper.getOrderedCourseAll();
    }
}
