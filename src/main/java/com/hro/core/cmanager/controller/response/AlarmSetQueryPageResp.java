package com.hro.core.cmanager.controller.response;

import com.hro.core.cmanager.dao.model.AlarmSet;

import java.util.List;

/**
 * 告警配置分页查询响应
 */
public class AlarmSetQueryPageResp extends CommonResp {

    /**
     * 查询结果
     */
    private List<AlarmSet> result;

    public List<AlarmSet> getResult() {
        return result;
    }

    public void setResult(List<AlarmSet> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "AlarmQueryPageResp{" +
                "pageNum=" + super.getPageNum() +
                ", pageSize=" + super.getPageSize() +
                ", total="+ super.getTotal() +
                ", msg="+ super.getMsg() +
                ", code="+ super.getCode() +
                ", result=" + result +
                '}';
    }

}
