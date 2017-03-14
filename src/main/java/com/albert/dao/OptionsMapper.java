package com.albert.dao;

import com.albert.domain.table.Options;

public interface OptionsMapper {
    int deleteByPrimaryKey(String name);

    int insert(Options record);

    int insertSelective(Options record);

    Options selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(Options record);

    int updateByPrimaryKey(Options record);
}