package com.hro.core.cmanager.controller.response;

import com.hro.core.cmanager.dao.model.UserInfo;

import java.util.List;

/**
 * 用户信息查询响应
 */
public class UserInfoQueryPageResp extends CommonResp {

    /**
     * 查询结果
     */
    private List<UserInfo> result;

    public List<UserInfo> getResult() {
        return result;
    }

    public void setResult(List<UserInfo> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "UserInfoQueryPageResp{" +
                "pageNum=" + super.getPageNum() +
                ", pageSize=" + super.getPageSize() +
                ", total="+ super.getTotal() +
                ", msg="+ super.getMsg() +
                ", code="+ super.getCode() +
                ", result=" + result +
                '}';
    }

}
