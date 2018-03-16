package com.hro.core.cmanager.controller.response;

import com.hro.core.cmanager.dao.model.CarInfo;
import com.hro.core.cmanager.dao.model.UserInfo;

import java.util.List;

/**
 * 用户信息查询响应
 */
public class CarInfoQueryPageResp extends CommonResp {

    /**
     * 查询结果
     */
    private List<CarInfo> result;

    public List<CarInfo> getResult() {
        return result;
    }

    public void setResult(List<CarInfo> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "CarInfoQueryPageResp{" +
                "pageNum=" + super.getPageNum() +
                ", pageSize=" + super.getPageSize() +
                ", total="+ super.getTotal() +
                ", msg="+ super.getMsg() +
                ", code="+ super.getCode() +
                ", result=" + result +
                '}';
    }

}
