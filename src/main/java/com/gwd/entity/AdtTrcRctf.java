package com.gwd.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AdtTrcRctf {
    private Long adtDftId;

    private Long adtDftNm;

    private Byte unit;

    private Byte issueNum;

    private Byte rctfNum;

    private BigDecimal issueAmt;

    private BigDecimal rctfAmt;

    private Byte rctfState;

    private Byte rctfRes;

    private Byte notRctfCus;

    private Byte issueTrkType;

    private Date rctfDate;

    private String rctfDesc;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Date updatedTime;

    public AdtTrcRctf(Long adtDftId, Long adtDftNm, Byte unit, Byte issueNum, Byte rctfNum, BigDecimal issueAmt, BigDecimal rctfAmt, Byte rctfState, Byte rctfRes, Byte notRctfCus, Byte issueTrkType, Date rctfDate, String rctfDesc, Long createdBy, Date createdTime, Long updatedBy, Date updatedTime) {
        this.adtDftId = adtDftId;
        this.adtDftNm = adtDftNm;
        this.unit = unit;
        this.issueNum = issueNum;
        this.rctfNum = rctfNum;
        this.issueAmt = issueAmt;
        this.rctfAmt = rctfAmt;
        this.rctfState = rctfState;
        this.rctfRes = rctfRes;
        this.notRctfCus = notRctfCus;
        this.issueTrkType = issueTrkType;
        this.rctfDate = rctfDate;
        this.rctfDesc = rctfDesc;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public AdtTrcRctf() {
        super();
    }

    public Long getAdtDftId() {
        return adtDftId;
    }

    public void setAdtDftId(Long adtDftId) {
        this.adtDftId = adtDftId;
    }

    public Long getAdtDftNm() {
        return adtDftNm;
    }

    public void setAdtDftNm(Long adtDftNm) {
        this.adtDftNm = adtDftNm;
    }

    public Byte getUnit() {
        return unit;
    }

    public void setUnit(Byte unit) {
        this.unit = unit;
    }

    public Byte getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(Byte issueNum) {
        this.issueNum = issueNum;
    }

    public Byte getRctfNum() {
        return rctfNum;
    }

    public void setRctfNum(Byte rctfNum) {
        this.rctfNum = rctfNum;
    }

    public BigDecimal getIssueAmt() {
        return issueAmt;
    }

    public void setIssueAmt(BigDecimal issueAmt) {
        this.issueAmt = issueAmt;
    }

    public BigDecimal getRctfAmt() {
        return rctfAmt;
    }

    public void setRctfAmt(BigDecimal rctfAmt) {
        this.rctfAmt = rctfAmt;
    }

    public Byte getRctfState() {
        return rctfState;
    }

    public void setRctfState(Byte rctfState) {
        this.rctfState = rctfState;
    }

    public Byte getRctfRes() {
        return rctfRes;
    }

    public void setRctfRes(Byte rctfRes) {
        this.rctfRes = rctfRes;
    }

    public Byte getNotRctfCus() {
        return notRctfCus;
    }

    public void setNotRctfCus(Byte notRctfCus) {
        this.notRctfCus = notRctfCus;
    }

    public Byte getIssueTrkType() {
        return issueTrkType;
    }

    public void setIssueTrkType(Byte issueTrkType) {
        this.issueTrkType = issueTrkType;
    }

    public Date getRctfDate() {
        return rctfDate;
    }

    public void setRctfDate(Date rctfDate) {
        this.rctfDate = rctfDate;
    }

    public String getRctfDesc() {
        return rctfDesc;
    }

    public void setRctfDesc(String rctfDesc) {
        this.rctfDesc = rctfDesc == null ? null : rctfDesc.trim();
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