package com.hro.core.cmanager.controller.request;

import com.hro.core.cmanager.dao.model.UserInfo;

/**
 * 用户信息请求参数
 */
public class UserInfoReq extends CommonReq{

    // 用户信息
    private UserInfo userInfo;

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String toString() {
        return "UserInfoReq{" +
                "userInfo=" + userInfo +
                '}';
    }
}
