package com.gupaoedu.service;

import com.gupaoedu.entity.Order;
import com.gupaoedu.mapper.OrderMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * 订单服务
 * 2020-11-11
 * */
@Service
public class OrderService {
    @Resource
    OrderMapper orderMapper;

    public static Long orderId = 1L;
    public static Long userId = 1L;

    public void insert() {
        for (int i = 1; i <= 100; i++) {
            Order order = new Order();
            order.setOrderId(i);
            order.setUserId(i);
            orderId++;
            userId++;
            orderMapper.insert(order);
        }
    }

    public Order getOrderInfoByOrderId(Integer id){
        return orderMapper.selectByPrimaryKey(id);
    }

    /**
     * 创建订单
     */
    public Order create(String userId, String commodityCode, int orderCount){
        return null;
    }

}
