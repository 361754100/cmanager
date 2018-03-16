package com.hro.core.cmanager.dao.model;

import java.io.Serializable;
import java.util.Date;

public class CarInfo implements Serializable {
    private String devid;

    private Integer devType;

    private String userId;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getDevid() {
        return devid;
    }

    public void setDevid(String devid) {
        this.devid = devid;
    }

    public Integer getDevType() {
        return devType;
    }

    public void setDevType(Integer devType) {
        this.devType = devType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "devid='" + devid + '\'' +
                ", devType=" + devType +
                ", userId='" + userId + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}