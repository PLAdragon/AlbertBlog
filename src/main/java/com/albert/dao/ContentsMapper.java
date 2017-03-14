package com.albert.dao;

import com.albert.domain.table.Contents;

public interface ContentsMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Contents record);

    int insertSelective(Contents record);

    Contents selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Contents record);

    int updateByPrimaryKeyWithBLOBs(Contents record);

    int updateByPrimaryKey(Contents record);
}