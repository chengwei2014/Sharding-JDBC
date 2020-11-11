package com.gupaoedu.dao.main;

import com.gupaoedu.entity.OrderDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderDOMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(OrderDO record);

    int insertSelective(OrderDO record);

    OrderDO selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(OrderDO record);

    int updateByPrimaryKey(OrderDO record);

    List<OrderDO> selectAll();

}