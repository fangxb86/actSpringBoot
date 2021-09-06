package com.gwd.entity;

import java.util.Date;

public class AdtGrp {
    private Long adtGrpId;

    private String atdGrpNm;

    private Byte adtGrpType;

    private Long adtPrjgrpId;

    private Long adtPrjId;

    private Long byInstId;

    private String byInstNm;

    private Long exeInstId;

    private String exeInstNm;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Date updatedTime;

    public AdtGrp(Long adtGrpId, String atdGrpNm, Byte adtGrpType, Long adtPrjgrpId, Long adtPrjId, Long byInstId, String byInstNm, Long exeInstId, String exeInstNm, Long createdBy, Date createdTime, Long updatedBy, Date updatedTime) {
        this.adtGrpId = adtGrpId;
        this.atdGrpNm = atdGrpNm;
        this.adtGrpType = adtGrpType;
        this.adtPrjgrpId = adtPrjgrpId;
        this.adtPrjId = adtPrjId;
        this.byInstId = byInstId;
        this.byInstNm = byInstNm;
        this.exeInstId = exeInstId;
        this.exeInstNm = exeInstNm;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public AdtGrp() {
        super();
    }

    public Long getAdtGrpId() {
        return adtGrpId;
    }

    public void setAdtGrpId(Long adtGrpId) {
        this.adtGrpId = adtGrpId;
    }

    public String getAtdGrpNm() {
        return atdGrpNm;
    }

    public void setAtdGrpNm(String atdGrpNm) {
        this.atdGrpNm = atdGrpNm == null ? null : atdGrpNm.trim();
    }

    public Byte getAdtGrpType() {
        return adtGrpType;
    }

    public void setAdtGrpType(Byte adtGrpType) {
        this.adtGrpType = adtGrpType;
    }

    public Long getAdtPrjgrpId() {
        return adtPrjgrpId;
    }

    public void setAdtPrjgrpId(Long adtPrjgrpId) {
        this.adtPrjgrpId = adtPrjgrpId;
    }

    public Long getAdtPrjId() {
        return adtPrjId;
    }

    public void setAdtPrjId(Long adtPrjId) {
        this.adtPrjId = adtPrjId;
    }

    public Long getByInstId() {
        return byInstId;
    }

    public void setByInstId(Long byInstId) {
        this.byInstId = byInstId;
    }

    public String getByInstNm() {
        return byInstNm;
    }

    public void setByInstNm(String byInstNm) {
        this.byInstNm = byInstNm == null ? null : byInstNm.trim();
    }

    public Long getExeInstId() {
        return exeInstId;
    }

    public void setExeInstId(Long exeInstId) {
        this.exeInstId = exeInstId;
    }

    public String getExeInstNm() {
        return exeInstNm;
    }

    public void setExeInstNm(String exeInstNm) {
        this.exeInstNm = exeInstNm == null ? null : exeInstNm.trim();
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