package com.hro.core.cmanager.dao;

import com.hro.core.cmanager.controller.request.UserInfoReq;
import com.hro.core.cmanager.dao.mapper.UserInfoMapper;
import com.hro.core.cmanager.dao.model.UserInfo;
import com.hro.core.cmanager.dao.model.UserInfoExample;
import com.hro.core.cmanager.utils.RowBoundsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;

/**
 * 用户信息Dao
 */
@Repository
public class UserInfoDao {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfoMapper getUserInfoMapper() {
        return userInfoMapper;
    }

    public void setUserInfoMapper(UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }

    /**
     * 添加用户信息
     * @param userInfo
     * @return
     */
    public int addInfo(UserInfo userInfo) {
        int cnt = 0;
        UserInfoExample example = new UserInfoExample();
        example.createCriteria().andUserIdEqualTo(userInfo.getUserId());

        boolean isExist = userInfoMapper.countByExample(example) > 0;
        if(isExist) {
            return cnt;
        }

        cnt = userInfoMapper.insertSelective(userInfo);

        return cnt;
    }

    /**
     * 根据主键删除用户信息
     * @param userId
     * @return
     */
    public int delInfoById(String userId) {
        UserInfoExample example = new UserInfoExample();
        example.createCriteria().andUserIdEqualTo(userId);

        int cnt =userInfoMapper.deleteByExample(example);
        return cnt;
    }

    /**
     * 修改用户信息
     * @param userInfo
     * @return
     */
    public int updateInfo(UserInfo userInfo) {
        UserInfoExample example = new UserInfoExample();
        example.createCriteria().andUserIdEqualTo(userInfo.getUserId());

        int cnt = userInfoMapper.updateByExampleSelective(userInfo, example);
        return cnt;
    }

    /**
     * 根据用户ID获取用户信息
     * @param userId
     * @return
     */
    public UserInfo getInfoById(String userId) {
        UserInfo userInfo = null;

        UserInfoExample example = new UserInfoExample();
        example.createCriteria().andUserIdEqualTo(userId);

        List<UserInfo> result = userInfoMapper.selectByExample(example);
        if(!CollectionUtils.isEmpty(result)) {
            userInfo = result.get(0);
        }
        return userInfo;
    }

    /**
     * 获取记录总数
     * @return
     */
    public int getRecordTotal(Map<String, String> conditions) {
        int total = userInfoMapper.countByExample(null);
        return total;
    }

    /**
     *
     * @return
     */
    public List<UserInfo> queryPageRecord(UserInfoReq req) {
        int pageNum = req.getPageNum();
        int pageSize = req.getPageSize();

        UserInfoExample example = new UserInfoExample();

        List<UserInfo> result = userInfoMapper.selectByExampleWithRowbounds(example, RowBoundsUtil.of(pageNum, pageSize));
        return result;
    }

}
