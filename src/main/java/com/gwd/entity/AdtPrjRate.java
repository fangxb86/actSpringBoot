package com.gwd.entity;

import java.util.Date;

public class AdtPrjRate {
    private Long adtPrjId;

    private Byte rate;

    private Byte score;

    private Long fileUploaderId;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Date updatedTime;

    public AdtPrjRate(Long adtPrjId, Byte rate, Byte score, Long fileUploaderId, Long createdBy, Date createdTime, Long updatedBy, Date updatedTime) {
        this.adtPrjId = adtPrjId;
        this.rate = rate;
        this.score = score;
        this.fileUploaderId = fileUploaderId;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public AdtPrjRate() {
        super();
    }

    public Long getAdtPrjId() {
        return adtPrjId;
    }

    public void setAdtPrjId(Long adtPrjId) {
        this.adtPrjId = adtPrjId;
    }

    public Byte getRate() {
        return rate;
    }

    public void setRate(Byte rate) {
        this.rate = rate;
    }

    public Byte getScore() {
        return score;
    }

    public void setScore(Byte score) {
        this.score = score;
    }

    public Long getFileUploaderId() {
        return fileUploaderId;
    }

    public void setFileUploaderId(Long fileUploaderId) {
        this.fileUploaderId = fileUploaderId;
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