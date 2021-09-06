package com.gwd.entity;

import java.util.Date;

public class AdtDftEvt {
    private Long adtDftId;

    private Long adtEvtId;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Date updatedTime;

    public AdtDftEvt(Long adtDftId, Long adtEvtId, Long createdBy, Date createdTime, Long updatedBy, Date updatedTime) {
        this.adtDftId = adtDftId;
        this.adtEvtId = adtEvtId;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public AdtDftEvt() {
        super();
    }

    public Long getAdtDftId() {
        return adtDftId;
    }

    public void setAdtDftId(Long adtDftId) {
        this.adtDftId = adtDftId;
    }

    public Long getAdtEvtId() {
        return adtEvtId;
    }

    public void setAdtEvtId(Long adtEvtId) {
        this.adtEvtId = adtEvtId;
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