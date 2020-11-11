package com.gupaoedu.dao.sharding;

import com.gupaoedu.entity.BroadTableDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BroadTableDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BroadTableDO record);

    int insertGenerator(BroadTableDO record);

    int insertSelective(BroadTableDO record);

    BroadTableDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BroadTableDO record);

    int updateByPrimaryKey(BroadTableDO record);
}