package com.gwd.entity;

import java.util.Date;

public class AdtDoc {
    private Long adtDocId;

    private String adtDocNm;

    private Long adtGrpId;

    private Byte docType;

    private Long srcInstId;

    private Long srcDeptId;

    private String docDesc;

    private Byte state;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Date updatedTime;

    public AdtDoc(Long adtDocId, String adtDocNm, Long adtGrpId, Byte docType, Long srcInstId, Long srcDeptId, String docDesc, Byte state, Long createdBy, Date createdTime, Long updatedBy, Date updatedTime) {
        this.adtDocId = adtDocId;
        this.adtDocNm = adtDocNm;
        this.adtGrpId = adtGrpId;
        this.docType = docType;
        this.srcInstId = srcInstId;
        this.srcDeptId = srcDeptId;
        this.docDesc = docDesc;
        this.state = state;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public AdtDoc() {
        super();
    }

    public Long getAdtDocId() {
        return adtDocId;
    }

    public void setAdtDocId(Long adtDocId) {
        this.adtDocId = adtDocId;
    }

    public String getAdtDocNm() {
        return adtDocNm;
    }

    public void setAdtDocNm(String adtDocNm) {
        this.adtDocNm = adtDocNm == null ? null : adtDocNm.trim();
    }

    public Long getAdtGrpId() {
        return adtGrpId;
    }

    public void setAdtGrpId(Long adtGrpId) {
        this.adtGrpId = adtGrpId;
    }

    public Byte getDocType() {
        return docType;
    }

    public void setDocType(Byte docType) {
        this.docType = docType;
    }

    public Long getSrcInstId() {
        return srcInstId;
    }

    public void setSrcInstId(Long srcInstId) {
        this.srcInstId = srcInstId;
    }

    public Long getSrcDeptId() {
        return srcDeptId;
    }

    public void setSrcDeptId(Long srcDeptId) {
        this.srcDeptId = srcDeptId;
    }

    public String getDocDesc() {
        return docDesc;
    }

    public void setDocDesc(String docDesc) {
        this.docDesc = docDesc == null ? null : docDesc.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
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