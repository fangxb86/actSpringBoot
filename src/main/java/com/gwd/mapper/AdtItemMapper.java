package com.gwd.mapper;

import com.gwd.entity.AdtItem;

public interface AdtItemMapper {
    int insert(AdtItem record);

    int insertSelective(AdtItem record);
}