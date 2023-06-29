package com.xx.mapper;

import com.xx.domain.CarScheduleTable;
import com.xx.domain.CarScheduleTableExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CarScheduleTableMapper {
    List<CarScheduleTable> selectList(String date);

    long countByExample(CarScheduleTableExample example);

    int deleteByExample(CarScheduleTableExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CarScheduleTable record);

    int insertSelective(CarScheduleTable record);

    List<CarScheduleTable> selectByExample(CarScheduleTableExample example);

    CarScheduleTable selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CarScheduleTable record, @Param("example") CarScheduleTableExample example);

    int updateByExample(@Param("record") CarScheduleTable record, @Param("example") CarScheduleTableExample example);

    int updateByPrimaryKeySelective(CarScheduleTable record);

    int updateByPrimaryKey(CarScheduleTable record);
}