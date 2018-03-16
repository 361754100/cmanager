package com.hro.core.cmanager.service;


import com.hro.core.cmanager.controller.request.AlarmSetReq;
import com.hro.core.cmanager.controller.response.AlarmSetQueryPageResp;
import com.hro.core.cmanager.controller.response.CommonResp;
import com.hro.core.cmanager.dao.AlarmSetDao;
import com.hro.core.cmanager.dao.model.AlarmSet;
import com.hro.core.cmanager.enums.StateCodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AlarmSetService {

    @Autowired
    private AlarmSetDao alarmSetDao;

    @Autowired
    private RedisService redisService;

    // 缓存Key
    private static final String CACHE_KEY_PREFIX = "ALARM_SET_";

    // 缓存Key
    private static final long CACHE_EXPIRE_TIME = 30l*60;

    /**
     * 添加/更新信息
     * @param req
     * @return
     */
    public CommonResp saveOrUpdateInfo(AlarmSetReq req) {
        CommonResp resp = new CommonResp();
        resp.setMsg("添加/更新告警配置失败");

        AlarmSet alarmSet = req.getAlarmSet();
        alarmSet.setCreateTime(new Date());

        int cnt = alarmSetDao.saveOrUpdateInfo(alarmSet);
        if(cnt > 0) {
            redisService.setObj(CACHE_KEY_PREFIX + alarmSet.getDevid(), alarmSet, CACHE_EXPIRE_TIME);
            resp.setCode(StateCodeEnum.SUCCESS.getValue());
            resp.setMsg("添加/更新告警配置成功");
        }

        return resp;
    }


    /**
     * 删除信息
     * @param req
     * @return
     */
    public CommonResp delInfo(AlarmSetReq req) {
        CommonResp resp = new CommonResp();
        resp.setMsg("删除告警配置失败");

        AlarmSet alarmSet = req.getAlarmSet();

        int cnt = alarmSetDao.delInfoById(alarmSet.getDevid());
        if(cnt > 0) {
            resp.setCode(StateCodeEnum.SUCCESS.getValue());
            resp.setMsg("删除告警配置成功");
        }

        return resp;
    }


    /**
     * 更新信息
     * @param req
     * @return
     */
    public CommonResp updateInfo(AlarmSetReq req) {
        CommonResp resp = new CommonResp();
        resp.setMsg("修改告警配置失败");

        AlarmSet alarmSet = req.getAlarmSet();
        alarmSet.setUpdateTime(new Date());

        int cnt = alarmSetDao.updateInfo(alarmSet);
        if(cnt > 0) {
            resp.setCode(StateCodeEnum.SUCCESS.getValue());
            resp.setMsg("修改告警配置成功");
        }

        return resp;
    }

    /**
     * 分页查询
     * @return
     */
    public AlarmSetQueryPageResp queryInfoPage(AlarmSetReq req) {
        AlarmSetQueryPageResp resp = new AlarmSetQueryPageResp();

        int total = alarmSetDao.getRecordTotal(null);
        List<AlarmSet> result = alarmSetDao.queryPageRecord(req);
        resp.setResult(result);
        resp.setTotal(total);
        resp.setCode(StateCodeEnum.SUCCESS.getValue());
        resp.setPageNum(req.getPageNum());
        resp.setPageSize(req.getPageSize());

        return resp;
    }

    /**
     * 条件查询
     * @return
     */
    public AlarmSet queryInfoByDevid(String devid) {
        String redisKey = CACHE_KEY_PREFIX + devid;
        AlarmSet cache = (AlarmSet) redisService.getObj(redisKey, AlarmSet.class);
        if(cache == null) {
            AlarmSet alarmSet = alarmSetDao.getInfoByDevid(devid);
            redisService.setObj(redisKey, alarmSet, CACHE_EXPIRE_TIME);
            return alarmSet;
        }
        return cache;
    }

}
