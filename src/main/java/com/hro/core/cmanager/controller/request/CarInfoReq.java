package com.hro.core.cmanager.controller.request;

import com.hro.core.cmanager.dao.model.CarInfo;
import com.hro.core.cmanager.dao.model.UserInfo;

/**
 * 用户信息请求参数
 */
public class CarInfoReq extends CommonReq{

    private CarInfo carInfo;

    public CarInfo getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(CarInfo carInfo) {
        this.carInfo = carInfo;
    }

    @Override
    public String toString() {
        return "CarInfoReq{" +
                "carInfo=" + carInfo +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                '}';
    }
}
