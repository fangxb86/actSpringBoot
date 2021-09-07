package com.gwd.entity;

import java.util.Date;

public class AdtItem {
    private Long adtItemId;

    private String adtItemTtl;

    private Long adtGrpId;

    private Long prtNodeId;

    private String adtItemDesc;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Date updatedTime;

    public AdtItem(Long adtItemId, String adtItemTtl, Long adtGrpId, Long prtNodeId, String adtItemDesc, Long createdBy, Date createdTime, Long updatedBy, Date updatedTime) {
        this.adtItemId = adtItemId;
        this.adtItemTtl = adtItemTtl;
        this.adtGrpId = adtGrpId;
        this.prtNodeId = prtNodeId;
        this.adtItemDesc = adtItemDesc;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public AdtItem() {
        super();
    }

    public Long getAdtItemId() {
        return adtItemId;
    }

    public void setAdtItemId(Long adtItemId) {
        this.adtItemId = adtItemId;
    }

    public String getAdtItemTtl() {
        return adtItemTtl;
    }

    public void setAdtItemTtl(String adtItemTtl) {
        this.adtItemTtl = adtItemTtl == null ? null : adtItemTtl.trim();
    }

    public Long getAdtGrpId() {
        return adtGrpId;
    }

    public void setAdtGrpId(Long adtGrpId) {
        this.adtGrpId = adtGrpId;
    }

    public Long getPrtNodeId() {
        return prtNodeId;
    }

    public void setPrtNodeId(Long prtNodeId) {
        this.prtNodeId = prtNodeId;
    }

    public String getAdtItemDesc() {
        return adtItemDesc;
    }

    public void setAdtItemDesc(String adtItemDesc) {
        this.adtItemDesc = adtItemDesc == null ? null : adtItemDesc.trim();
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