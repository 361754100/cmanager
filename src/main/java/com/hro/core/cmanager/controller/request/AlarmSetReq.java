package com.hro.core.cmanager.controller.request;

import com.hro.core.cmanager.dao.model.AlarmSet;

/**
 * 用户信息请求参数
 */
public class AlarmSetReq extends CommonReq{

    private AlarmSet alarmSet;

    public AlarmSet getAlarmSet() {
        return alarmSet;
    }

    public void setAlarmSet(AlarmSet alarmSet) {
        this.alarmSet = alarmSet;
    }

    @Override
    public String toString() {
        return "AlarmSetReq{" +
                "alarmSet=" + alarmSet +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                '}';
    }
}
