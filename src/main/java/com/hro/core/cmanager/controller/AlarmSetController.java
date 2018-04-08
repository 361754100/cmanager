package com.hro.core.cmanager.controller;

import com.hro.core.cmanager.controller.request.AlarmSetReq;
import com.hro.core.cmanager.controller.response.AlarmSetQueryPageResp;
import com.hro.core.cmanager.controller.response.CommonResp;
import com.hro.core.cmanager.dao.model.AlarmSet;
import com.hro.core.cmanager.dao.model.CarInfo;
import com.hro.core.cmanager.log.LogUtil;
import com.hro.core.cmanager.service.AlarmSetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/alarmSet")
@Api(value = "alarmSet")
public class AlarmSetController {

    @Autowired
    private AlarmSetService alarmSetService;

    @ApiOperation(value = "添加/更新告警配置", notes = "")
    @RequestMapping(value = "/saveOrUpdateInfo", method = RequestMethod.POST)
    @ResponseBody
    public CommonResp saveOrUpdateInfo(@RequestBody AlarmSetReq req) {
        LogUtil.info("添加/更新告警配置, 接收到的请求参数={}", req);

        CommonResp resp = alarmSetService.saveOrUpdateInfo(req);
        LogUtil.info("添加/更新告警配置，响应消息={}", resp);
        return resp;
    }

    @ApiOperation(value = "删除告警配置", notes = "")
    @RequestMapping(value = "/delInfo", method = RequestMethod.POST)
    @ResponseBody
    public CommonResp delInfo(@RequestBody AlarmSetReq req) {
        LogUtil.info("删除告警配置, 接收到的请求参数={}", req);

        CommonResp resp = alarmSetService.delInfo(req);
        LogUtil.info("删除告警配置，响应消息={}", resp);
        return resp;
    }

    @ApiOperation(value = "修改告警配置", notes = "")
    @RequestMapping(value = "/updateInfo", method = RequestMethod.POST)
    @ResponseBody
    public CommonResp updateInfo(@RequestBody AlarmSetReq req) {
        LogUtil.info("修改告警配置, 接收到的请求参数={}", req);

        CommonResp resp = alarmSetService.updateInfo(req);
        LogUtil.info("修改告警配置，响应消息={}", resp);
        return resp;
    }

    @ApiOperation(value = "分页查询告警配置", notes = "")
    @RequestMapping(value = "/queryInfoPage", method = RequestMethod.POST)
    @ResponseBody
    public AlarmSetQueryPageResp queryInfoPage(@RequestBody AlarmSetReq req) {
        LogUtil.info("分页查询告警配置, 接收到的请求参数={}", req);

        AlarmSetQueryPageResp resp = alarmSetService.queryInfoPage(req);
        LogUtil.info("分页查询告警配置，响应消息={}", resp);
        return resp;
    }

    @ApiOperation(value = "条件查询告警配置", notes = "")
    @RequestMapping(value = "/queryInfoByDevid", method = RequestMethod.POST)
    @ResponseBody
    public AlarmSet queryInfoByDevid(@RequestBody CarInfo params) {
        LogUtil.info("条件查询告警配置, 接收到的请求参数={}", params);

        AlarmSet alarmSet = alarmSetService.queryInfoByDevid(params.getDevid());
        LogUtil.info("条件查询告警配置，响应消息={}", alarmSet);
        return alarmSet;
    }

}
