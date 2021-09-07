package com.gwd.entity;

import java.util.Date;

public class AdtPrj {
    private Long adtPrjId;

    private String adtPrjNm;

    private Long adtPlanId;

    private Byte state;

    private Byte type;

    private Byte bldMtd;

    private Date adtStdt;

    private Date adtEddt;

    private Date implStdt;

    private Date implEddt;

    private Short expDays;

    private Long leadDeptId;

    private Long mngdDeptId;

    private String asesAnul;

    private Byte prjCeft;

    private Long anulPlanId;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Date updatedTime;

    public AdtPrj(Long adtPrjId, String adtPrjNm, Long adtPlanId, Byte state, Byte type, Byte bldMtd, Date adtStdt, Date adtEddt, Date implStdt, Date implEddt, Short expDays, Long leadDeptId, Long mngdDeptId, String asesAnul, Byte prjCeft, Long anulPlanId, Long createdBy, Date createdTime, Long updatedBy, Date updatedTime) {
        this.adtPrjId = adtPrjId;
        this.adtPrjNm = adtPrjNm;
        this.adtPlanId = adtPlanId;
        this.state = state;
        this.type = type;
        this.bldMtd = bldMtd;
        this.adtStdt = adtStdt;
        this.adtEddt = adtEddt;
        this.implStdt = implStdt;
        this.implEddt = implEddt;
        this.expDays = expDays;
        this.leadDeptId = leadDeptId;
        this.mngdDeptId = mngdDeptId;
        this.asesAnul = asesAnul;
        this.prjCeft = prjCeft;
        this.anulPlanId = anulPlanId;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public AdtPrj() {
        super();
    }

    public Long getAdtPrjId() {
        return adtPrjId;
    }

    public void setAdtPrjId(Long adtPrjId) {
        this.adtPrjId = adtPrjId;
    }

    public String getAdtPrjNm() {
        return adtPrjNm;
    }

    public void setAdtPrjNm(String adtPrjNm) {
        this.adtPrjNm = adtPrjNm == null ? null : adtPrjNm.trim();
    }

    public Long getAdtPlanId() {
        return adtPlanId;
    }

    public void setAdtPlanId(Long adtPlanId) {
        this.adtPlanId = adtPlanId;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getBldMtd() {
        return bldMtd;
    }

    public void setBldMtd(Byte bldMtd) {
        this.bldMtd = bldMtd;
    }

    public Date getAdtStdt() {
        return adtStdt;
    }

    public void setAdtStdt(Date adtStdt) {
        this.adtStdt = adtStdt;
    }

    public Date getAdtEddt() {
        return adtEddt;
    }

    public void setAdtEddt(Date adtEddt) {
        this.adtEddt = adtEddt;
    }

    public Date getImplStdt() {
        return implStdt;
    }

    public void setImplStdt(Date implStdt) {
        this.implStdt = implStdt;
    }

    public Date getImplEddt() {
        return implEddt;
    }

    public void setImplEddt(Date implEddt) {
        this.implEddt = implEddt;
    }

    public Short getExpDays() {
        return expDays;
    }

    public void setExpDays(Short expDays) {
        this.expDays = expDays;
    }

    public Long getLeadDeptId() {
        return leadDeptId;
    }

    public void setLeadDeptId(Long leadDeptId) {
        this.leadDeptId = leadDeptId;
    }

    public Long getMngdDeptId() {
        return mngdDeptId;
    }

    public void setMngdDeptId(Long mngdDeptId) {
        this.mngdDeptId = mngdDeptId;
    }

    public String getAsesAnul() {
        return asesAnul;
    }

    public void setAsesAnul(String asesAnul) {
        this.asesAnul = asesAnul == null ? null : asesAnul.trim();
    }

    public Byte getPrjCeft() {
        return prjCeft;
    }

    public void setPrjCeft(Byte prjCeft) {
        this.prjCeft = prjCeft;
    }

    public Long getAnulPlanId() {
        return anulPlanId;
    }

    public void setAnulPlanId(Long anulPlanId) {
        this.anulPlanId = anulPlanId;
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