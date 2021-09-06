package com.gwd.entity;

import java.util.Date;

public class AdtNft {
    private Long adtNtfId;

    private String adtNtfTtl;

    private Long adtGrpId;

    private Long rcvInstId;

    private Long rcvEmpId;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Date updatedTime;

    public AdtNft(Long adtNtfId, String adtNtfTtl, Long adtGrpId, Long rcvInstId, Long rcvEmpId, Long createdBy, Date createdTime, Long updatedBy, Date updatedTime) {
        this.adtNtfId = adtNtfId;
        this.adtNtfTtl = adtNtfTtl;
        this.adtGrpId = adtGrpId;
        this.rcvInstId = rcvInstId;
        this.rcvEmpId = rcvEmpId;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public AdtNft() {
        super();
    }

    public Long getAdtNtfId() {
        return adtNtfId;
    }

    public void setAdtNtfId(Long adtNtfId) {
        this.adtNtfId = adtNtfId;
    }

    public String getAdtNtfTtl() {
        return adtNtfTtl;
    }

    public void setAdtNtfTtl(String adtNtfTtl) {
        this.adtNtfTtl = adtNtfTtl == null ? null : adtNtfTtl.trim();
    }

    public Long getAdtGrpId() {
        return adtGrpId;
    }

    public void setAdtGrpId(Long adtGrpId) {
        this.adtGrpId = adtGrpId;
    }

    public Long getRcvInstId() {
        return rcvInstId;
    }

    public void setRcvInstId(Long rcvInstId) {
        this.rcvInstId = rcvInstId;
    }

    public Long getRcvEmpId() {
        return rcvEmpId;
    }

    public void setRcvEmpId(Long rcvEmpId) {
        this.rcvEmpId = rcvEmpId;
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