package com.yjs.yujiangshe.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yjs.yujiangshe.dao.OrderedCourseMapper;
import com.yjs.yujiangshe.entity.OrderInfo;
import com.yjs.yujiangshe.service.OrderedCourseService;
import com.yjs.yujiangshe.utils.ResultUtil;
import com.yjs.yujiangshe.vo.Result;
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
    public PageInfo<OrderInfo> getOrderedCourseAll(Integer pageNum, Integer pageSize) {
        //PageHelper插件的静态方法，调用之后即开启分页查询
        PageHelper.startPage(pageNum, pageSize);
        //查询所有信息，封装进PageInfo
        List<OrderInfo> orderInfos = orderedCourseMapper.getOrderedCourseAll();
        return new PageInfo<>(orderInfos);
    }

    @Override
    public Result updateOrderedCourse(OrderInfo orderInfo) {
        orderedCourseMapper.updateOrderedCourse(orderInfo);
        return ResultUtil.success(orderInfo);
    }

}
