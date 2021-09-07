package com.gwd.entity;

import java.util.Date;

public class AdtSchm {
    private Long adtSchmId;

    private Long adtGrpId;

    private Long adtTgt;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Date updatedTime;

    public AdtSchm(Long adtSchmId, Long adtGrpId, Long adtTgt, Long createdBy, Date createdTime, Long updatedBy, Date updatedTime) {
        this.adtSchmId = adtSchmId;
        this.adtGrpId = adtGrpId;
        this.adtTgt = adtTgt;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public AdtSchm() {
        super();
    }

    public Long getAdtSchmId() {
        return adtSchmId;
    }

    public void setAdtSchmId(Long adtSchmId) {
        this.adtSchmId = adtSchmId;
    }

    public Long getAdtGrpId() {
        return adtGrpId;
    }

    public void setAdtGrpId(Long adtGrpId) {
        this.adtGrpId = adtGrpId;
    }

    public Long getAdtTgt() {
        return adtTgt;
    }

    public void setAdtTgt(Long adtTgt) {
        this.adtTgt = adtTgt;
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