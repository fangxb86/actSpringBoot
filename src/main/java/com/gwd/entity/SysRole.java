package com.gwd.entity;

import java.util.Date;

public class SysRole {
    private String roleId;

    private String roleNm;

    private Byte statInd;

    private Byte statType;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Date updatedTime;

    public SysRole(String roleId, String roleNm, Byte statInd, Byte statType, Long createdBy, Date createdTime, Long updatedBy, Date updatedTime) {
        this.roleId = roleId;
        this.roleNm = roleNm;
        this.statInd = statInd;
        this.statType = statType;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public SysRole() {
        super();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getRoleNm() {
        return roleNm;
    }

    public void setRoleNm(String roleNm) {
        this.roleNm = roleNm == null ? null : roleNm.trim();
    }

    public Byte getStatInd() {
        return statInd;
    }

    public void setStatInd(Byte statInd) {
        this.statInd = statInd;
    }

    public Byte getStatType() {
        return statType;
    }

    public void setStatType(Byte statType) {
        this.statType = statType;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}