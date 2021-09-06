package com.gwd.entity;

import java.util.Date;

public class AdtDocAuth {
    private Long lgcSn;

    private Long adtDocId;

    private Long adtPrjId;

    private Long adtGrpId;

    private Long authPsnId;

    private String authPsnNm;

    private Date authSttm;

    private Date authEdtm;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Date updatedTime;

    public AdtDocAuth(Long lgcSn, Long adtDocId, Long adtPrjId, Long adtGrpId, Long authPsnId, String authPsnNm, Date authSttm, Date authEdtm, Long createdBy, Date createdTime, Long updatedBy, Date updatedTime) {
        this.lgcSn = lgcSn;
        this.adtDocId = adtDocId;
        this.adtPrjId = adtPrjId;
        this.adtGrpId = adtGrpId;
        this.authPsnId = authPsnId;
        this.authPsnNm = authPsnNm;
        this.authSttm = authSttm;
        this.authEdtm = authEdtm;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public AdtDocAuth() {
        super();
    }

    public Long getLgcSn() {
        return lgcSn;
    }

    public void setLgcSn(Long lgcSn) {
        this.lgcSn = lgcSn;
    }

    public Long getAdtDocId() {
        return adtDocId;
    }

    public void setAdtDocId(Long adtDocId) {
        this.adtDocId = adtDocId;
    }

    public Long getAdtPrjId() {
        return adtPrjId;
    }

    public void setAdtPrjId(Long adtPrjId) {
        this.adtPrjId = adtPrjId;
    }

    public Long getAdtGrpId() {
        return adtGrpId;
    }

    public void setAdtGrpId(Long adtGrpId) {
        this.adtGrpId = adtGrpId;
    }

    public Long getAuthPsnId() {
        return authPsnId;
    }

    public void setAuthPsnId(Long authPsnId) {
        this.authPsnId = authPsnId;
    }

    public String getAuthPsnNm() {
        return authPsnNm;
    }

    public void setAuthPsnNm(String authPsnNm) {
        this.authPsnNm = authPsnNm == null ? null : authPsnNm.trim();
    }

    public Date getAuthSttm() {
        return authSttm;
    }

    public void setAuthSttm(Date authSttm) {
        this.authSttm = authSttm;
    }

    public Date getAuthEdtm() {
        return authEdtm;
    }

    public void setAuthEdtm(Date authEdtm) {
        this.authEdtm = authEdtm;
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