package com.hro.core.cmanager.dao.mapper;

import com.hro.core.cmanager.dao.model.CarInfo;
import com.hro.core.cmanager.dao.model.CarInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CarInfoMapper {
    int countByExample(CarInfoExample example);

    int deleteByExample(CarInfoExample example);

    int deleteByPrimaryKey(String devid);

    int insert(CarInfo record);

    int insertSelective(CarInfo record);

    List<CarInfo> selectByExampleWithRowbounds(CarInfoExample example, RowBounds rowBounds);

    List<CarInfo> selectByExample(CarInfoExample example);

    CarInfo selectByPrimaryKey(String devid);

    int updateByExampleSelective(@Param("record") CarInfo record, @Param("example") CarInfoExample example);

    int updateByExample(@Param("record") CarInfo record, @Param("example") CarInfoExample example);

    int updateByPrimaryKeySelective(CarInfo record);

    int updateByPrimaryKey(CarInfo record);
}