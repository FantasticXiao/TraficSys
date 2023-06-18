package com.xx.mapper;

import com.xx.domain.ScheduleTable;
import com.xx.domain.ScheduleTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScheduleTableMapper {
    long countByExample(ScheduleTableExample example);

    int deleteByExample(ScheduleTableExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ScheduleTable record);

    int insertSelective(ScheduleTable record);

    List<ScheduleTable> selectByExample(ScheduleTableExample example);

    ScheduleTable selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ScheduleTable record, @Param("example") ScheduleTableExample example);

    int updateByExample(@Param("record") ScheduleTable record, @Param("example") ScheduleTableExample example);

    int updateByPrimaryKeySelective(ScheduleTable record);

    int updateByPrimaryKey(ScheduleTable record);
}