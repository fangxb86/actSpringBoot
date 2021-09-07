package com.gwd.entity;

import java.util.Date;

public class AdtPrjInst {
    private Long lgcSn;

    private Long adtPrjId;

    private Long byInstId;

    private Long execInstId;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Long updatedTime;

    public AdtPrjInst(Long lgcSn, Long adtPrjId, Long byInstId, Long execInstId, Long createdBy, Date createdTime, Long updatedBy, Long updatedTime) {
        this.lgcSn = lgcSn;
        this.adtPrjId = adtPrjId;
        this.byInstId = byInstId;
        this.execInstId = execInstId;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public AdtPrjInst() {
        super();
    }

    public Long getLgcSn() {
        return lgcSn;
    }

    public void setLgcSn(Long lgcSn) {
        this.lgcSn = lgcSn;
    }

    public Long getAdtPrjId() {
        return adtPrjId;
    }

    public void setAdtPrjId(Long adtPrjId) {
        this.adtPrjId = adtPrjId;
    }

    public Long getByInstId() {
        return byInstId;
    }

    public void setByInstId(Long byInstId) {
        this.byInstId = byInstId;
    }

    public Long getExecInstId() {
        return execInstId;
    }

    public void setExecInstId(Long execInstId) {
        this.execInstId = execInstId;
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

    public Long getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
    }
}