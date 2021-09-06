package com.gwd.mapper;

import com.gwd.entity.AdtIssue;

public interface AdtIssueMapper {
    int insert(AdtIssue record);

    int insertSelective(AdtIssue record);
}