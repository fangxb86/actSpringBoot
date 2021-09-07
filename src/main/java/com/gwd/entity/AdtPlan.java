package com.gwd.entity;

import java.util.Date;

public class AdtPlan {
    private Long adtPlanId;

    private String adtPlanNm;

    private String adtTgt;

    private String planAnul;

    private Long planDeptId;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Date updatedTime;

    public AdtPlan(Long adtPlanId, String adtPlanNm, String adtTgt, String planAnul, Long planDeptId, Long createdBy, Date createdTime, Long updatedBy, Date updatedTime) {
        this.adtPlanId = adtPlanId;
        this.adtPlanNm = adtPlanNm;
        this.adtTgt = adtTgt;
        this.planAnul = planAnul;
        this.planDeptId = planDeptId;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public AdtPlan() {
        super();
    }

    public Long getAdtPlanId() {
        return adtPlanId;
    }

    public void setAdtPlanId(Long adtPlanId) {
        this.adtPlanId = adtPlanId;
    }

    public String getAdtPlanNm() {
        return adtPlanNm;
    }

    public void setAdtPlanNm(String adtPlanNm) {
        this.adtPlanNm = adtPlanNm == null ? null : adtPlanNm.trim();
    }

    public String getAdtTgt() {
        return adtTgt;
    }

    public void setAdtTgt(String adtTgt) {
        this.adtTgt = adtTgt == null ? null : adtTgt.trim();
    }

    public String getPlanAnul() {
        return planAnul;
    }

    public void setPlanAnul(String planAnul) {
        this.planAnul = planAnul == null ? null : planAnul.trim();
    }

    public Long getPlanDeptId() {
        return planDeptId;
    }

    public void setPlanDeptId(Long planDeptId) {
        this.planDeptId = planDeptId;
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