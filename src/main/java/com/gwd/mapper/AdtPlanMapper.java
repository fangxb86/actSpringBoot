package com.gwd.mapper;

import com.gwd.entity.AdtPlan;

import java.util.List;

public interface AdtPlanMapper {
    List<AdtPlan> getAll();

    int insert(AdtPlan record);

    int insertSelective(AdtPlan record);
}