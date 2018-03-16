package com.hro.core.cmanager.dao.model;

import java.io.Serializable;
import java.util.Date;

public class AlarmSet implements Serializable {
    private String devid;

    private Double alarmRadius;

    private Integer operate;

    private Date createTime;

    private Date updateTime;

    private String operator;

    private static final long serialVersionUID = 1L;

    public String getDevid() {
        return devid;
    }

    public void setDevid(String devid) {
        this.devid = devid;
    }

    public Double getAlarmRadius() {
        return alarmRadius;
    }

    public void setAlarmRadius(Double alarmRadius) {
        this.alarmRadius = alarmRadius;
    }

    public Integer getOperate() {
        return operate;
    }

    public void setOperate(Integer operate) {
        this.operate = operate;
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

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "AlarmSet{" +
                "devid='" + devid + '\'' +
                ", alarmRadius=" + alarmRadius +
                ", operate=" + operate +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", operator='" + operator + '\'' +
                '}';
    }
}