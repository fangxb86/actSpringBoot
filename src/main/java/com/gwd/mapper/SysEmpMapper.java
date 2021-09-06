package com.gwd.mapper;

import com.gwd.entity.SysEmp;

public interface SysEmpMapper {
    int insert(SysEmp record);

    int insertSelective(SysEmp record);
}