package com.gwd.entity;

import java.util.Date;

public class AdtPrjMnhr {
    private Long lgcSn;

    private Long adtGrpId;

    private Byte adtStep;

    private Byte estEmpNum;

    private Short estDayNum;

    private Short estHrNum;

    private Byte actEmpNum;

    private Short actDayNum;

    private Short actHrNum;

    private String remark;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Date updatedTime;

    public AdtPrjMnhr(Long lgcSn, Long adtGrpId, Byte adtStep, Byte estEmpNum, Short estDayNum, Short estHrNum, Byte actEmpNum, Short actDayNum, Short actHrNum, String remark, Long createdBy, Date createdTime, Long updatedBy, Date updatedTime) {
        this.lgcSn = lgcSn;
        this.adtGrpId = adtGrpId;
        this.adtStep = adtStep;
        this.estEmpNum = estEmpNum;
        this.estDayNum = estDayNum;
        this.estHrNum = estHrNum;
        this.actEmpNum = actEmpNum;
        this.actDayNum = actDayNum;
        this.actHrNum = actHrNum;
        this.remark = remark;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public AdtPrjMnhr() {
        super();
    }

    public Long getLgcSn() {
        return lgcSn;
    }

    public void setLgcSn(Long lgcSn) {
        this.lgcSn = lgcSn;
    }

    public Long getAdtGrpId() {
        return adtGrpId;
    }

    public void setAdtGrpId(Long adtGrpId) {
        this.adtGrpId = adtGrpId;
    }

    public Byte getAdtStep() {
        return adtStep;
    }

    public void setAdtStep(Byte adtStep) {
        this.adtStep = adtStep;
    }

    public Byte getEstEmpNum() {
        return estEmpNum;
    }

    public void setEstEmpNum(Byte estEmpNum) {
        this.estEmpNum = estEmpNum;
    }

    public Short getEstDayNum() {
        return estDayNum;
    }

    public void setEstDayNum(Short estDayNum) {
        this.estDayNum = estDayNum;
    }

    public Short getEstHrNum() {
        return estHrNum;
    }

    public void setEstHrNum(Short estHrNum) {
        this.estHrNum = estHrNum;
    }

    public Byte getActEmpNum() {
        return actEmpNum;
    }

    public void setActEmpNum(Byte actEmpNum) {
        this.actEmpNum = actEmpNum;
    }

    public Short getActDayNum() {
        return actDayNum;
    }

    public void setActDayNum(Short actDayNum) {
        this.actDayNum = actDayNum;
    }

    public Short getActHrNum() {
        return actHrNum;
    }

    public void setActHrNum(Short actHrNum) {
        this.actHrNum = actHrNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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