package com.gwd.mapper;

import com.gwd.entity.AdtPlan;

public interface AdtPlanMapper {
    int insert(AdtPlan record);

    int insertSelective(AdtPlan record);
}