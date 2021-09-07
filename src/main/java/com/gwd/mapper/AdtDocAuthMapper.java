package com.gwd.mapper;

import com.gwd.entity.AdtDocAuth;

public interface AdtDocAuthMapper {
    int insert(AdtDocAuth record);

    int insertSelective(AdtDocAuth record);
}