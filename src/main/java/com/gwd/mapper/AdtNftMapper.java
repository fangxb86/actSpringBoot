package com.gwd.mapper;

import com.gwd.entity.AdtNft;

public interface AdtNftMapper {
    int insert(AdtNft record);

    int insertSelective(AdtNft record);
}