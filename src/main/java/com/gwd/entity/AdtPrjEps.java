package com.gwd.entity;

import java.util.Date;

public class AdtPrjEps {
    private Long lgcSn;

    private Long adtGrpId;

    private Byte epsType;

    private Byte estEmpNum;

    private Short estDayNum;

    private Short estUnitPrc;

    private Byte actEmpNum;

    private Short actDayNum;

    private Short actUnitPrc;

    private String remark;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Date updatedTime;

    public AdtPrjEps(Long lgcSn, Long adtGrpId, Byte epsType, Byte estEmpNum, Short estDayNum, Short estUnitPrc, Byte actEmpNum, Short actDayNum, Short actUnitPrc, String remark, Long createdBy, Date createdTime, Long updatedBy, Date updatedTime) {
        this.lgcSn = lgcSn;
        this.adtGrpId = adtGrpId;
        this.epsType = epsType;
        this.estEmpNum = estEmpNum;
        this.estDayNum = estDayNum;
        this.estUnitPrc = estUnitPrc;
        this.actEmpNum = actEmpNum;
        this.actDayNum = actDayNum;
        this.actUnitPrc = actUnitPrc;
        this.remark = remark;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public AdtPrjEps() {
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

    public Byte getEpsType() {
        return epsType;
    }

    public void setEpsType(Byte epsType) {
        this.epsType = epsType;
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

    public Short getEstUnitPrc() {
        return estUnitPrc;
    }

    public void setEstUnitPrc(Short estUnitPrc) {
        this.estUnitPrc = estUnitPrc;
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

    public Short getActUnitPrc() {
        return actUnitPrc;
    }

    public void setActUnitPrc(Short actUnitPrc) {
        this.actUnitPrc = actUnitPrc;
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