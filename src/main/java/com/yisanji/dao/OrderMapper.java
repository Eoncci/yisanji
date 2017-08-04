package com.yisanji.dao;

import java.util.List;

import com.yisanji.pojo.Order;

public interface OrderMapper {
	int deleteByPrimaryKey(String id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
    
    List<Order> selectByStatus(String status);
}