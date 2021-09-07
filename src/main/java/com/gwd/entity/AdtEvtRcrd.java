package com.gwd.entity;

import java.util.Date;

public class AdtEvtRcrd {
    private Long adtEvtId;

    private String adtEvtNm;

    private Long adtPrjId;

    private Long adtGrpId;

    private Long byInstId;

    private Long untitled6;

    private Long adtPsnId;

    private Long adtItemId;

    private String procDesc;

    private String sttnDesc;

    private Byte diffInd;

    private String diffDesc;

    private String adtAcrdto;

    private String createdDft;

    private Byte state;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Date updatedTime;

    public AdtEvtRcrd(Long adtEvtId, String adtEvtNm, Long adtPrjId, Long adtGrpId, Long byInstId, Long untitled6, Long adtPsnId, Long adtItemId, String procDesc, String sttnDesc, Byte diffInd, String diffDesc, String adtAcrdto, String createdDft, Byte state, Long createdBy, Date createdTime, Long updatedBy, Date updatedTime) {
        this.adtEvtId = adtEvtId;
        this.adtEvtNm = adtEvtNm;
        this.adtPrjId = adtPrjId;
        this.adtGrpId = adtGrpId;
        this.byInstId = byInstId;
        this.untitled6 = untitled6;
        this.adtPsnId = adtPsnId;
        this.adtItemId = adtItemId;
        this.procDesc = procDesc;
        this.sttnDesc = sttnDesc;
        this.diffInd = diffInd;
        this.diffDesc = diffDesc;
        this.adtAcrdto = adtAcrdto;
        this.createdDft = createdDft;
        this.state = state;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public AdtEvtRcrd() {
        super();
    }

    public Long getAdtEvtId() {
        return adtEvtId;
    }

    public void setAdtEvtId(Long adtEvtId) {
        this.adtEvtId = adtEvtId;
    }

    public String getAdtEvtNm() {
        return adtEvtNm;
    }

    public void setAdtEvtNm(String adtEvtNm) {
        this.adtEvtNm = adtEvtNm == null ? null : adtEvtNm.trim();
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

    public Long getByInstId() {
        return byInstId;
    }

    public void setByInstId(Long byInstId) {
        this.byInstId = byInstId;
    }

    public Long getUntitled6() {
        return untitled6;
    }

    public void setUntitled6(Long untitled6) {
        this.untitled6 = untitled6;
    }

    public Long getAdtPsnId() {
        return adtPsnId;
    }

    public void setAdtPsnId(Long adtPsnId) {
        this.adtPsnId = adtPsnId;
    }

    public Long getAdtItemId() {
        return adtItemId;
    }

    public void setAdtItemId(Long adtItemId) {
        this.adtItemId = adtItemId;
    }

    public String getProcDesc() {
        return procDesc;
    }

    public void setProcDesc(String procDesc) {
        this.procDesc = procDesc == null ? null : procDesc.trim();
    }

    public String getSttnDesc() {
        return sttnDesc;
    }

    public void setSttnDesc(String sttnDesc) {
        this.sttnDesc = sttnDesc == null ? null : sttnDesc.trim();
    }

    public Byte getDiffInd() {
        return diffInd;
    }

    public void setDiffInd(Byte diffInd) {
        this.diffInd = diffInd;
    }

    public String getDiffDesc() {
        return diffDesc;
    }

    public void setDiffDesc(String diffDesc) {
        this.diffDesc = diffDesc == null ? null : diffDesc.trim();
    }

    public String getAdtAcrdto() {
        return adtAcrdto;
    }

    public void setAdtAcrdto(String adtAcrdto) {
        this.adtAcrdto = adtAcrdto == null ? null : adtAcrdto.trim();
    }

    public String getCreatedDft() {
        return createdDft;
    }

    public void setCreatedDft(String createdDft) {
        this.createdDft = createdDft == null ? null : createdDft.trim();
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