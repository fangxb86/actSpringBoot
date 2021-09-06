package com.gwd.mapper;

import com.gwd.entity.SysInst;

public interface SysInstMapper {
    int insert(SysInst record);

    int insertSelective(SysInst record);
}