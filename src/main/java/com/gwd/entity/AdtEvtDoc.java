package com.gwd.entity;

import java.util.Date;

public class AdtEvtDoc {
    private Long adtEvtId;

    private Long adtDocId;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Date updatedTime;

    public AdtEvtDoc(Long adtEvtId, Long adtDocId, Long createdBy, Date createdTime, Long updatedBy, Date updatedTime) {
        this.adtEvtId = adtEvtId;
        this.adtDocId = adtDocId;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public AdtEvtDoc() {
        super();
    }

    public Long getAdtEvtId() {
        return adtEvtId;
    }

    public void setAdtEvtId(Long adtEvtId) {
        this.adtEvtId = adtEvtId;
    }

    public Long getAdtDocId() {
        return adtDocId;
    }

    public void setAdtDocId(Long adtDocId) {
        this.adtDocId = adtDocId;
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