package com.albert.dao;

import com.albert.domain.table.Relationships;

public interface RelationShipsMapper {
    int deleteByPrimaryKey(Relationships key);

    int insert(Relationships record);

    int insertSelective(Relationships record);
}