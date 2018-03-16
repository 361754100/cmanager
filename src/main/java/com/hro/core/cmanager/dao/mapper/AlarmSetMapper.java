package com.hro.core.cmanager.dao.mapper;

import com.hro.core.cmanager.dao.model.AlarmSet;
import com.hro.core.cmanager.dao.model.AlarmSetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AlarmSetMapper {
    int countByExample(AlarmSetExample example);

    int deleteByExample(AlarmSetExample example);

    int deleteByPrimaryKey(String devid);

    int insert(AlarmSet record);

    int insertSelective(AlarmSet record);

    List<AlarmSet> selectByExampleWithRowbounds(AlarmSetExample example, RowBounds rowBounds);

    List<AlarmSet> selectByExample(AlarmSetExample example);

    AlarmSet selectByPrimaryKey(String devid);

    int updateByExampleSelective(@Param("record") AlarmSet record, @Param("example") AlarmSetExample example);

    int updateByExample(@Param("record") AlarmSet record, @Param("example") AlarmSetExample example);

    int updateByPrimaryKeySelective(AlarmSet record);

    int updateByPrimaryKey(AlarmSet record);
}