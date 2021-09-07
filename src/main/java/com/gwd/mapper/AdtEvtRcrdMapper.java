package com.gwd.mapper;

import com.gwd.entity.AdtEvtRcrd;

public interface AdtEvtRcrdMapper {
    int insert(AdtEvtRcrd record);

    int insertSelective(AdtEvtRcrd record);
}