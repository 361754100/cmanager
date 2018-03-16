package com.hro.core.cmanager.dao;

import com.hro.core.cmanager.controller.request.CarInfoReq;
import com.hro.core.cmanager.controller.request.UserInfoReq;
import com.hro.core.cmanager.dao.mapper.CarInfoMapper;
import com.hro.core.cmanager.dao.model.CarInfo;
import com.hro.core.cmanager.dao.model.CarInfoExample;
import com.hro.core.cmanager.utils.RowBoundsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;

/**
 * 车辆信息Dao
 */
@Repository
public class CarInfoDao {

    @Autowired
    private CarInfoMapper carInfoMapper;

    /**
     * 添加信息
     * @param carInfo
     * @return
     */
    public int addInfo(CarInfo carInfo) {
        int cnt = 0;
        CarInfoExample example = new CarInfoExample();
        example.createCriteria().andDevidEqualTo(carInfo.getDevid());

        boolean isExist = carInfoMapper.countByExample(example) > 0;
        if(isExist) {
            return cnt;
        }

        cnt = carInfoMapper.insertSelective(carInfo);

        return cnt;
    }

    /**
     * 根据主键删除信息
     * @param devid
     * @return
     */
    public int delInfoById(String devid) {
        CarInfoExample example = new CarInfoExample();
        example.createCriteria().andDevidEqualTo(devid);

        int cnt =carInfoMapper.deleteByExample(example);
        return cnt;
    }

    /**
     * 修改信息
     * @param carInfo
     * @return
     */
    public int updateInfo(CarInfo carInfo) {
        CarInfoExample example = new CarInfoExample();
        example.createCriteria().andDevidEqualTo(carInfo.getDevid());

        int cnt = carInfoMapper.updateByExampleSelective(carInfo, example);
        return cnt;
    }

    /**
     * 根据用户ID获取信息
     * @param devid
     * @return
     */
    public CarInfo getInfoById(String devid) {
        CarInfo carInfo = null;

        CarInfoExample example = new CarInfoExample();
        example.createCriteria().andDevidEqualTo(devid);

        List<CarInfo> result = carInfoMapper.selectByExample(example);
        if(!CollectionUtils.isEmpty(result)) {
            carInfo = result.get(0);
        }
        return carInfo;
    }

    /**
     * 获取记录总数
     * @return
     */
    public int getRecordTotal(Map<String, String> conditions) {
        int total = carInfoMapper.countByExample(null);
        return total;
    }

    /**
     *
     * @return
     */
    public List<CarInfo> queryPageRecord(CarInfoReq req) {
        int pageNum = req.getPageNum();
        int pageSize = req.getPageSize();

        CarInfoExample example = new CarInfoExample();

        List<CarInfo> result = carInfoMapper.selectByExampleWithRowbounds(example, RowBoundsUtil.of(pageNum, pageSize));
        return result;
    }

}
