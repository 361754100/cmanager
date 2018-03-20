package com.hro.core.cmanager.service;


import com.hro.core.cmanager.controller.request.CarInfoReq;
import com.hro.core.cmanager.controller.response.CommonResp;
import com.hro.core.cmanager.controller.response.CarInfoQueryPageResp;
import com.hro.core.cmanager.dao.CarInfoDao;
import com.hro.core.cmanager.dao.CarInfoDao;
import com.hro.core.cmanager.dao.model.CarInfo;
import com.hro.core.cmanager.enums.StateCodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class CarInfoService {

    @Autowired
    private CarInfoDao carInfoDao;

    /**
     * 添加信息
     * @param req
     * @return
     */
    public CommonResp addInfo(CarInfoReq req) {
        CommonResp resp = new CommonResp();
        resp.setMsg("添加车辆信息失败");

        CarInfo carInfo = req.getCarInfo();
        carInfo.setCreateTime(new Date());
        carInfo.setDevid(UUID.randomUUID().toString());

        int cnt = carInfoDao.addInfo(carInfo);
        if(cnt > 0) {
            resp.setCode(StateCodeEnum.SUCCESS.getValue());
            resp.setMsg("添加车辆信息成功");
        }

        return resp;
    }


    /**
     * 删除信息
     * @param req
     * @return
     */
    public CommonResp delInfo(CarInfoReq req) {
        CommonResp resp = new CommonResp();
        resp.setMsg("删除车辆信息失败");

        CarInfo carInfo = req.getCarInfo();

        int cnt = carInfoDao.delInfoById(carInfo.getDevid());
        if(cnt > 0) {
            resp.setCode(StateCodeEnum.SUCCESS.getValue());
            resp.setMsg("删除车辆信息成功");
        }

        return resp;
    }


    /**
     * 更新信息
     * @param req
     * @return
     */
    public CommonResp updateInfo(CarInfoReq req) {
        CommonResp resp = new CommonResp();
        resp.setMsg("修改车辆信息失败");

        CarInfo carInfo = req.getCarInfo();
        carInfo.setUpdateTime(new Date());

        int cnt = carInfoDao.updateInfo(carInfo);
        if(cnt > 0) {
            resp.setCode(StateCodeEnum.SUCCESS.getValue());
            resp.setMsg("修改车辆信息成功");
        }

        return resp;
    }

    /**
     * 分页查询
     * @return
     */
    public CarInfoQueryPageResp queryInfoPage(CarInfoReq req) {
        CarInfoQueryPageResp resp = new CarInfoQueryPageResp();

        int total = carInfoDao.getRecordTotal(null);
        List<CarInfo> result = carInfoDao.queryPageRecord(req);
        resp.setResult(result);
        resp.setTotal(total);
        resp.setCode(StateCodeEnum.SUCCESS.getValue());
        resp.setPageNum(req.getPageNum());
        resp.setPageSize(req.getPageSize());

        return resp;
    }

    /**
     * 分页查询
     * @return
     */
    public List<CarInfo> queryInfoByTelephone(String telephone) {

        List<CarInfo> result = carInfoDao.queryInfoByTelephone(telephone);
        return result;
    }

}
