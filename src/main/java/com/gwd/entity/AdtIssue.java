package com.gwd.entity;

import java.util.Date;

public class AdtIssue {
    private Long adtIssueId;

    private Long adtIssueNm;

    private Byte issueType;

    private Byte ctrlDfctInd;

    private Byte serisDgrInd;

    private Long adtPrjId;

    private Long adtGrpId;

    private String adtAnls;

    private String adtAdvc;

    private Long hpnInstNm;

    private Date hpnDate;

    private String showForm;

    private String eftType;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Date updatedTime;

    public AdtIssue(Long adtIssueId, Long adtIssueNm, Byte issueType, Byte ctrlDfctInd, Byte serisDgrInd, Long adtPrjId, Long adtGrpId, String adtAnls, String adtAdvc, Long hpnInstNm, Date hpnDate, String showForm, String eftType, Long createdBy, Date createdTime, Long updatedBy, Date updatedTime) {
        this.adtIssueId = adtIssueId;
        this.adtIssueNm = adtIssueNm;
        this.issueType = issueType;
        this.ctrlDfctInd = ctrlDfctInd;
        this.serisDgrInd = serisDgrInd;
        this.adtPrjId = adtPrjId;
        this.adtGrpId = adtGrpId;
        this.adtAnls = adtAnls;
        this.adtAdvc = adtAdvc;
        this.hpnInstNm = hpnInstNm;
        this.hpnDate = hpnDate;
        this.showForm = showForm;
        this.eftType = eftType;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public AdtIssue() {
        super();
    }

    public Long getAdtIssueId() {
        return adtIssueId;
    }

    public void setAdtIssueId(Long adtIssueId) {
        this.adtIssueId = adtIssueId;
    }

    public Long getAdtIssueNm() {
        return adtIssueNm;
    }

    public void setAdtIssueNm(Long adtIssueNm) {
        this.adtIssueNm = adtIssueNm;
    }

    public Byte getIssueType() {
        return issueType;
    }

    public void setIssueType(Byte issueType) {
        this.issueType = issueType;
    }

    public Byte getCtrlDfctInd() {
        return ctrlDfctInd;
    }

    public void setCtrlDfctInd(Byte ctrlDfctInd) {
        this.ctrlDfctInd = ctrlDfctInd;
    }

    public Byte getSerisDgrInd() {
        return serisDgrInd;
    }

    public void setSerisDgrInd(Byte serisDgrInd) {
        this.serisDgrInd = serisDgrInd;
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

    public String getAdtAnls() {
        return adtAnls;
    }

    public void setAdtAnls(String adtAnls) {
        this.adtAnls = adtAnls == null ? null : adtAnls.trim();
    }

    public String getAdtAdvc() {
        return adtAdvc;
    }

    public void setAdtAdvc(String adtAdvc) {
        this.adtAdvc = adtAdvc == null ? null : adtAdvc.trim();
    }

    public Long getHpnInstNm() {
        return hpnInstNm;
    }

    public void setHpnInstNm(Long hpnInstNm) {
        this.hpnInstNm = hpnInstNm;
    }

    public Date getHpnDate() {
        return hpnDate;
    }

    public void setHpnDate(Date hpnDate) {
        this.hpnDate = hpnDate;
    }

    public String getShowForm() {
        return showForm;
    }

    public void setShowForm(String showForm) {
        this.showForm = showForm == null ? null : showForm.trim();
    }

    public String getEftType() {
        return eftType;
    }

    public void setEftType(String eftType) {
        this.eftType = eftType == null ? null : eftType.trim();
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