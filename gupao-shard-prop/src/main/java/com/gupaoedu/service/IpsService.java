package com.gupaoedu.service;

import com.gupaoedu.entity.Ips;
import com.gupaoedu.entity.Order;
import com.gupaoedu.mapper.IpsMapper;
import com.gupaoedu.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * IpsService
 * 2020-11-11
 * */
@Service
public class IpsService {
    @Resource
    IpsMapper ipsMapper;

    public void insert() {
        Ips ips = new Ips();
        ips.setFlowTime("20200501");
        ips.setValue(1);
        ipsMapper.insert(ips);

        Ips ips1 = new Ips();
        ips1.setFlowTime("20200601");
        ips1.setValue(2);
        ipsMapper.insert(ips1);
    }

    public Order getOrderInfoByOrderId(Integer id){
//        return orderMapper.selectByPrimaryKey(id);
        return null;
    }

}
