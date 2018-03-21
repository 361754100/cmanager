package com.hro.core.cmanager.controller;

import com.hro.core.cmanager.controller.request.CarInfoReq;
import com.hro.core.cmanager.controller.response.CarInfoQueryPageResp;
import com.hro.core.cmanager.controller.response.CommonResp;
import com.hro.core.cmanager.dao.model.CarInfo;
import com.hro.core.cmanager.dao.model.UserInfo;
import com.hro.core.cmanager.log.LogUtil;
import com.hro.core.cmanager.service.CarInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/carInfo")
@Api(value = "carInfo")
public class CarInfoController {

    @Autowired
    private CarInfoService carInfoService;

    @ApiOperation(value = "添加车辆信息", notes = "")
    @RequestMapping(value = "/addInfo", method = RequestMethod.POST)
    @ResponseBody
    public CommonResp addInfo(@RequestBody CarInfoReq req) {
        LogUtil.info("添加车辆信息, 接收到的请求参数={}", req);

        CommonResp resp = carInfoService.addInfo(req);
        LogUtil.info("添加车辆信息，响应消息={}", resp);
        return resp;
    }

    @ApiOperation(value = "删除车辆信息", notes = "")
    @RequestMapping(value = "/delInfo", method = RequestMethod.POST)
    @ResponseBody
    public CommonResp delInfo(@RequestBody CarInfoReq req) {
        LogUtil.info("删除车辆信息, 接收到的请求参数={}", req);

        CommonResp resp = carInfoService.delInfo(req);
        LogUtil.info("删除车辆信息，响应消息={}", resp);
        return resp;
    }

    @ApiOperation(value = "修改车辆信息", notes = "")
    @RequestMapping(value = "/updateInfo", method = RequestMethod.POST)
    @ResponseBody
    public CommonResp updateInfo(@RequestBody CarInfoReq req) {
        LogUtil.info("修改车辆信息, 接收到的请求参数={}", req);

        CommonResp resp = carInfoService.updateInfo(req);
        LogUtil.info("修改车辆信息，响应消息={}", resp);
        return resp;
    }

    @ApiOperation(value = "分页查询车辆信息", notes = "")
    @RequestMapping(value = "/queryInfoPage", method = RequestMethod.POST)
    @ResponseBody
    public CarInfoQueryPageResp queryInfoPage(@RequestBody CarInfoReq req) {
        LogUtil.info("分页查询车辆信息, 接收到的请求参数={}", req);

        CarInfoQueryPageResp resp = carInfoService.queryInfoPage(req);
        LogUtil.info("分页查询车辆信息，响应消息={}", resp);
        return resp;
    }

    @ApiOperation(value = "查询车辆信息", notes = "用手机号查询用户关联的车辆信息")
    @RequestMapping(value = "/queryInfoByTelephone", method = RequestMethod.POST)
    @ResponseBody
    public List<CarInfo> queryInfoByTelephone(@RequestBody UserInfo params) {
        String telephone = params.getTelephone();
        LogUtil.info("查询车辆信息, 接收到的请求参数={}", telephone);

        List<CarInfo> result = carInfoService.queryInfoByTelephone(telephone);
        LogUtil.info("查询车辆信息，响应消息={}", result);
        return result;
    }

}
