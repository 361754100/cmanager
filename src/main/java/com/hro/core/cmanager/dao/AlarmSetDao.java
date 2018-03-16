package com.hro.core.cmanager.dao;

import com.hro.core.cmanager.controller.request.AlarmSetReq;
import com.hro.core.cmanager.dao.mapper.AlarmSetMapper;
import com.hro.core.cmanager.dao.model.AlarmSet;
import com.hro.core.cmanager.dao.model.AlarmSetExample;
import com.hro.core.cmanager.utils.RowBoundsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 告警配置信息Dao
 */
@Repository
public class AlarmSetDao {

    @Autowired
    private AlarmSetMapper alarmSetMapper;

    /**
     * 添加信息
     * @param alarmSet
     * @return
     */
    public int addInfo(AlarmSet alarmSet) {
        int cnt = 0;
        AlarmSetExample example = new AlarmSetExample();
        example.createCriteria().andDevidEqualTo(alarmSet.getDevid());

        boolean isExist = alarmSetMapper.countByExample(example) > 0;
        if(isExist) {
            return cnt;
        }

        cnt = alarmSetMapper.insertSelective(alarmSet);

        return cnt;
    }

    /**
     * 添加信息
     * @param alarmSet
     * @return
     */
    public int saveOrUpdateInfo(AlarmSet alarmSet) {
        int cnt = 0;
        AlarmSetExample example = new AlarmSetExample();
        example.createCriteria().andDevidEqualTo(alarmSet.getDevid());

        boolean isExist = alarmSetMapper.countByExample(example) > 0;
        if(!isExist) {
            cnt = alarmSetMapper.insertSelective(alarmSet);
        } else {
            AlarmSet tmp = new AlarmSet();
            tmp.setAlarmRadius(alarmSet.getAlarmRadius());
            tmp.setOperator(alarmSet.getOperator());
            tmp.setUpdateTime(new Date());
            tmp.setOperate(alarmSet.getOperate());

            cnt = alarmSetMapper.updateByExampleSelective(tmp, example);
        }

        return cnt;
    }

    /**
     * 根据主键删除信息
     * @param devid
     * @return
     */
    public int delInfoById(String devid) {
        AlarmSetExample example = new AlarmSetExample();
        example.createCriteria().andDevidEqualTo(devid);

        int cnt =alarmSetMapper.deleteByExample(example);
        return cnt;
    }

    /**
     * 修改信息
     * @param alarmSet
     * @return
     */
    public int updateInfo(AlarmSet alarmSet) {
        AlarmSetExample example = new AlarmSetExample();
        example.createCriteria().andDevidEqualTo(alarmSet.getDevid());

        int cnt = alarmSetMapper.updateByExampleSelective(alarmSet, example);
        return cnt;
    }

    /**
     * 根据ID获取信息
     * @param devid
     * @return
     */
    public AlarmSet getInfoById(String devid) {
        AlarmSet alarmSet = null;

        AlarmSetExample example = new AlarmSetExample();
        example.createCriteria().andDevidEqualTo(devid);

        List<AlarmSet> result = alarmSetMapper.selectByExample(example);
        if(!CollectionUtils.isEmpty(result)) {
            alarmSet = result.get(0);
        }
        return alarmSet;
    }

    /**
     * 根据设备ID获取信息
     * @param devid
     * @return
     */
    public AlarmSet getInfoByDevid(String devid) {
        AlarmSet alarmSet = null;

        AlarmSetExample example = new AlarmSetExample();
        example.createCriteria().andDevidEqualTo(devid);

        List<AlarmSet> result = alarmSetMapper.selectByExample(example);
        if(!CollectionUtils.isEmpty(result)) {
            alarmSet = result.get(0);
        }
        return alarmSet;
    }

    /**
     * 获取记录总数
     * @return
     */
    public int getRecordTotal(Map<String, String> conditions) {
        int total = alarmSetMapper.countByExample(null);
        return total;
    }

    /**
     *
     * @return
     */
    public List<AlarmSet> queryPageRecord(AlarmSetReq req) {
        int pageNum = req.getPageNum();
        int pageSize = req.getPageSize();

        AlarmSetExample example = new AlarmSetExample();

        List<AlarmSet> result = alarmSetMapper.selectByExampleWithRowbounds(example, RowBoundsUtil.of(pageNum, pageSize));
        return result;
    }

}
