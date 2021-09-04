package com.gwd.entity;

import lombok.Data;

import java.util.Date;
@Data
public class SysRole {
    private String roleId;

    private String roleNm;

    private Byte statInd;

    private Byte statType;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Date updatedTime;

}