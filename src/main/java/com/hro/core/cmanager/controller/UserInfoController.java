package com.hro.core.cmanager.controller;

import com.hro.core.cmanager.controller.request.UserInfoReq;
import com.hro.core.cmanager.controller.response.CommonResp;
import com.hro.core.cmanager.controller.response.UserInfoQueryPageResp;
import com.hro.core.cmanager.log.LogUtil;
import com.hro.core.cmanager.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/userInfo")
@Api(value = "userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @ApiOperation(value = "添加用户信息", notes = "")
    @RequestMapping(value = "/addInfo", method = RequestMethod.POST)
    @ResponseBody
    public CommonResp addInfo(@RequestBody UserInfoReq req) {
        LogUtil.info("添加用户信息, 接收到的请求参数={}", req);

        CommonResp resp = userInfoService.addInfo(req);
        LogUtil.info("添加用户信息，响应消息={}", resp);
        return resp;
    }

    @ApiOperation(value = "删除用户信息", notes = "")
    @RequestMapping(value = "/delInfo", method = RequestMethod.POST)
    @ResponseBody
    public CommonResp delInfo(@RequestBody UserInfoReq req) {
        LogUtil.info("删除用户信息, 接收到的请求参数={}", req);

        CommonResp resp = userInfoService.delInfo(req);
        LogUtil.info("删除用户信息，响应消息={}", resp);
        return resp;
    }

    @ApiOperation(value = "修改用户信息", notes = "")
    @RequestMapping(value = "/updateInfo", method = RequestMethod.POST)
    @ResponseBody
    public CommonResp updateInfo(@RequestBody UserInfoReq req) {
        LogUtil.info("修改用户信息, 接收到的请求参数={}", req);

        CommonResp resp = userInfoService.updateInfo(req);
        LogUtil.info("修改用户信息，响应消息={}", resp);
        return resp;
    }

    @ApiOperation(value = "分页查询用户信息", notes = "")
    @RequestMapping(value = "/queryInfoPage", method = RequestMethod.POST)
    @ResponseBody
    public UserInfoQueryPageResp queryInfoPage(@RequestBody UserInfoReq req) {
        LogUtil.info("分页查询用户信息, 接收到的请求参数={}", req);

        UserInfoQueryPageResp resp = userInfoService.queryInfoPage(req);
        LogUtil.info("分页查询用户信息，响应消息={}", resp);
        return resp;
    }

}
