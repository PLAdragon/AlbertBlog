package com.albert.dao;

import com.albert.domain.table.Logs;

public interface LogsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Logs record);

    int insertSelective(Logs record);

    Logs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Logs record);

    int updateByPrimaryKey(Logs record);
}