package com.gupaoedu.mapper;

import com.gupaoedu.entity.Ips;
import com.gupaoedu.entity.Order;

/**
 * IpsMapper
 * 2020-11-11
 * */
public interface IpsMapper {
    int insert(Ips ips);

    Order selectByPrimaryKey(Integer value);
}