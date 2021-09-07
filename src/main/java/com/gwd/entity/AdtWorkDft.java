package com.gwd.entity;

import java.util.Date;

public class AdtWorkDft {
    private Long adtDftId;

    private String adtDftNm;

    private Long adtPrjId;

    private Long adtGrpId;

    private Long obtInstId;

    private Long untitled;

    private Long mjrPsnId;

    private String otrPsnIds;

    private String sttnDesc;

    private String adtAcrdto;

    private String diffDesc;

    private String causeAnls;

    private Byte state;

    private Byte issueInd;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Date updatedTime;

    public AdtWorkDft(Long adtDftId, String adtDftNm, Long adtPrjId, Long adtGrpId, Long obtInstId, Long untitled, Long mjrPsnId, String otrPsnIds, String sttnDesc, String adtAcrdto, String diffDesc, String causeAnls, Byte state, Byte issueInd, Long createdBy, Date createdTime, Long updatedBy, Date updatedTime) {
        this.adtDftId = adtDftId;
        this.adtDftNm = adtDftNm;
        this.adtPrjId = adtPrjId;
        this.adtGrpId = adtGrpId;
        this.obtInstId = obtInstId;
        this.untitled = untitled;
        this.mjrPsnId = mjrPsnId;
        this.otrPsnIds = otrPsnIds;
        this.sttnDesc = sttnDesc;
        this.adtAcrdto = adtAcrdto;
        this.diffDesc = diffDesc;
        this.causeAnls = causeAnls;
        this.state = state;
        this.issueInd = issueInd;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public AdtWorkDft() {
        super();
    }

    public Long getAdtDftId() {
        return adtDftId;
    }

    public void setAdtDftId(Long adtDftId) {
        this.adtDftId = adtDftId;
    }

    public String getAdtDftNm() {
        return adtDftNm;
    }

    public void setAdtDftNm(String adtDftNm) {
        this.adtDftNm = adtDftNm == null ? null : adtDftNm.trim();
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

    public Long getObtInstId() {
        return obtInstId;
    }

    public void setObtInstId(Long obtInstId) {
        this.obtInstId = obtInstId;
    }

    public Long getUntitled() {
        return untitled;
    }

    public void setUntitled(Long untitled) {
        this.untitled = untitled;
    }

    public Long getMjrPsnId() {
        return mjrPsnId;
    }

    public void setMjrPsnId(Long mjrPsnId) {
        this.mjrPsnId = mjrPsnId;
    }

    public String getOtrPsnIds() {
        return otrPsnIds;
    }

    public void setOtrPsnIds(String otrPsnIds) {
        this.otrPsnIds = otrPsnIds == null ? null : otrPsnIds.trim();
    }

    public String getSttnDesc() {
        return sttnDesc;
    }

    public void setSttnDesc(String sttnDesc) {
        this.sttnDesc = sttnDesc == null ? null : sttnDesc.trim();
    }

    public String getAdtAcrdto() {
        return adtAcrdto;
    }

    public void setAdtAcrdto(String adtAcrdto) {
        this.adtAcrdto = adtAcrdto == null ? null : adtAcrdto.trim();
    }

    public String getDiffDesc() {
        return diffDesc;
    }

    public void setDiffDesc(String diffDesc) {
        this.diffDesc = diffDesc == null ? null : diffDesc.trim();
    }

    public String getCauseAnls() {
        return causeAnls;
    }

    public void setCauseAnls(String causeAnls) {
        this.causeAnls = causeAnls == null ? null : causeAnls.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getIssueInd() {
        return issueInd;
    }

    public void setIssueInd(Byte issueInd) {
        this.issueInd = issueInd;
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