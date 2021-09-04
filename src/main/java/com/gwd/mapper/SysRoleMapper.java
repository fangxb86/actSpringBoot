package com.gwd.mapper;

import com.gwd.entity.SysRole;

public interface SysRoleMapper {
    int insert(SysRole record);

    int insertSelective(SysRole record);
}