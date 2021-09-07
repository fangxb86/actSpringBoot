package com.gwd.entity;

import java.util.Date;

public class AdtGrpMemb {
    private Long lgcSn;

    private Long empId;

    private String empNm;

    private Long adtGrpId;

    private String roleId;

    private Byte state;

    private Date actStdt;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Date updatedTime;

    public AdtGrpMemb(Long lgcSn, Long empId, String empNm, Long adtGrpId, String roleId, Byte state, Date actStdt, Long createdBy, Date createdTime, Long updatedBy, Date updatedTime) {
        this.lgcSn = lgcSn;
        this.empId = empId;
        this.empNm = empNm;
        this.adtGrpId = adtGrpId;
        this.roleId = roleId;
        this.state = state;
        this.actStdt = actStdt;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public AdtGrpMemb() {
        super();
    }

    public Long getLgcSn() {
        return lgcSn;
    }

    public void setLgcSn(Long lgcSn) {
        this.lgcSn = lgcSn;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpNm() {
        return empNm;
    }

    public void setEmpNm(String empNm) {
        this.empNm = empNm == null ? null : empNm.trim();
    }

    public Long getAdtGrpId() {
        return adtGrpId;
    }

    public void setAdtGrpId(Long adtGrpId) {
        this.adtGrpId = adtGrpId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Date getActStdt() {
        return actStdt;
    }

    public void setActStdt(Date actStdt) {
        this.actStdt = actStdt;
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