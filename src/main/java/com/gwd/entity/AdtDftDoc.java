package com.gwd.entity;

import java.util.Date;

public class AdtDftDoc {
    private Long adtDftId;

    private Long adtDocId;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Date updatedTime;

    public AdtDftDoc(Long adtDftId, Long adtDocId, Long createdBy, Date createdTime, Long updatedBy, Date updatedTime) {
        this.adtDftId = adtDftId;
        this.adtDocId = adtDocId;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public AdtDftDoc() {
        super();
    }

    public Long getAdtDftId() {
        return adtDftId;
    }

    public void setAdtDftId(Long adtDftId) {
        this.adtDftId = adtDftId;
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