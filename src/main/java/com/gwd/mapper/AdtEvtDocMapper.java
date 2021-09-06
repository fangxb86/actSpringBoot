package com.gwd.mapper;

import com.gwd.entity.AdtEvtDoc;

public interface AdtEvtDocMapper {
    int insert(AdtEvtDoc record);

    int insertSelective(AdtEvtDoc record);
}