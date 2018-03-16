package com.hro.core.cmanager.service;


import com.hro.core.cmanager.controller.response.UserInfoQueryPageResp;
import com.hro.core.cmanager.enums.StateCodeEnum;
import com.hro.core.cmanager.controller.request.UserInfoReq;
import com.hro.core.cmanager.controller.response.CommonResp;
import com.hro.core.cmanager.dao.UserInfoDao;
import com.hro.core.cmanager.dao.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    /**
     * 添加用户信息
     * @param req
     * @return
     */
    public CommonResp addInfo(UserInfoReq req) {
        CommonResp resp = new CommonResp();
        resp.setMsg("添加用户信息失败");

        UserInfo userInfo = req.getUserInfo();
        userInfo.setCreateTime(new Date());
        userInfo.setUserId(UUID.randomUUID().toString());

        int cnt = userInfoDao.addInfo(userInfo);
        if(cnt > 0) {
            resp.setCode(StateCodeEnum.SUCCESS.getValue());
            resp.setMsg("添加用户信息成功");
        }

        return resp;
    }


    /**
     * 删除用户信息
     * @param req
     * @return
     */
    public CommonResp delInfo(UserInfoReq req) {
        CommonResp resp = new CommonResp();
        resp.setMsg("删除用户信息失败");

        UserInfo userInfo = req.getUserInfo();

        int cnt = userInfoDao.delInfoById(userInfo.getUserId());
        if(cnt > 0) {
            resp.setCode(StateCodeEnum.SUCCESS.getValue());
            resp.setMsg("删除用户信息成功");
        }

        return resp;
    }


    /**
     * 更新用户信息
     * @param req
     * @return
     */
    public CommonResp updateInfo(UserInfoReq req) {
        CommonResp resp = new CommonResp();
        resp.setMsg("修改用户信息失败");

        UserInfo userInfo = req.getUserInfo();
        userInfo.setUpdateTime(new Date());

        int cnt = userInfoDao.updateInfo(userInfo);
        if(cnt > 0) {
            resp.setCode(StateCodeEnum.SUCCESS.getValue());
            resp.setMsg("修改用户信息成功");
        }

        return resp;
    }

    /**
     * 分页查询
     * @return
     */
    public UserInfoQueryPageResp queryInfoPage(UserInfoReq req) {
        UserInfoQueryPageResp resp = new UserInfoQueryPageResp();

        int total = userInfoDao.getRecordTotal(null);
        List<UserInfo> result = userInfoDao.queryPageRecord(req);
        resp.setResult(result);
        resp.setTotal(total);
        resp.setCode(StateCodeEnum.SUCCESS.getValue());
        resp.setPageNum(req.getPageNum());
        resp.setPageSize(req.getPageSize());

        return resp;
    }

}
