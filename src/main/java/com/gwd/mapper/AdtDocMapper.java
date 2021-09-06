package com.gwd.mapper;

import com.gwd.entity.AdtDoc;

public interface AdtDocMapper {
    int insert(AdtDoc record);

    int insertSelective(AdtDoc record);
}