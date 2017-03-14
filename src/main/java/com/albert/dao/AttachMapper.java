package com.albert.dao;

import com.albert.domain.table.Attach;

public interface AttachMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Attach record);

    int insertSelective(Attach record);

    Attach selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Attach record);

    int updateByPrimaryKey(Attach record);
}