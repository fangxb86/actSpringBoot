package com.gwd.entity;

import java.util.Date;

public class AdtRpt {
    private Long adtRptId;

    private String adtRptNm;

    private Byte rptType;

    private String rptDesc;

    private String createrNm;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Date updatedTime;

    public AdtRpt(Long adtRptId, String adtRptNm, Byte rptType, String rptDesc, String createrNm, Long createdBy, Date createdTime, Long updatedBy, Date updatedTime) {
        this.adtRptId = adtRptId;
        this.adtRptNm = adtRptNm;
        this.rptType = rptType;
        this.rptDesc = rptDesc;
        this.createrNm = createrNm;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public AdtRpt() {
        super();
    }

    public Long getAdtRptId() {
        return adtRptId;
    }

    public void setAdtRptId(Long adtRptId) {
        this.adtRptId = adtRptId;
    }

    public String getAdtRptNm() {
        return adtRptNm;
    }

    public void setAdtRptNm(String adtRptNm) {
        this.adtRptNm = adtRptNm == null ? null : adtRptNm.trim();
    }

    public Byte getRptType() {
        return rptType;
    }

    public void setRptType(Byte rptType) {
        this.rptType = rptType;
    }

    public String getRptDesc() {
        return rptDesc;
    }

    public void setRptDesc(String rptDesc) {
        this.rptDesc = rptDesc == null ? null : rptDesc.trim();
    }

    public String getCreaterNm() {
        return createrNm;
    }

    public void setCreaterNm(String createrNm) {
        this.createrNm = createrNm == null ? null : createrNm.trim();
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