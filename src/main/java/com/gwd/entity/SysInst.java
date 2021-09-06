package com.gwd.entity;

import java.util.Date;

public class SysInst {
    private Long instId;

    private String instNm;

    private Long parentId;

    private String parentNm;

    private String nodeRteInfo;

    private Byte sort;

    private Byte instType;

    private Byte state;

    private String tel;

    private Long createdBy;

    private Date createdTime;

    private Long updatedBy;

    private Date updatedTime;

    public SysInst(Long instId, String instNm, Long parentId, String parentNm, String nodeRteInfo, Byte sort, Byte instType, Byte state, String tel, Long createdBy, Date createdTime, Long updatedBy, Date updatedTime) {
        this.instId = instId;
        this.instNm = instNm;
        this.parentId = parentId;
        this.parentNm = parentNm;
        this.nodeRteInfo = nodeRteInfo;
        this.sort = sort;
        this.instType = instType;
        this.state = state;
        this.tel = tel;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public SysInst() {
        super();
    }

    public Long getInstId() {
        return instId;
    }

    public void setInstId(Long instId) {
        this.instId = instId;
    }

    public String getInstNm() {
        return instNm;
    }

    public void setInstNm(String instNm) {
        this.instNm = instNm == null ? null : instNm.trim();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getParentNm() {
        return parentNm;
    }

    public void setParentNm(String parentNm) {
        this.parentNm = parentNm == null ? null : parentNm.trim();
    }

    public String getNodeRteInfo() {
        return nodeRteInfo;
    }

    public void setNodeRteInfo(String nodeRteInfo) {
        this.nodeRteInfo = nodeRteInfo == null ? null : nodeRteInfo.trim();
    }

    public Byte getSort() {
        return sort;
    }

    public void setSort(Byte sort) {
        this.sort = sort;
    }

    public Byte getInstType() {
        return instType;
    }

    public void setInstType(Byte instType) {
        this.instType = instType;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
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