package com.xx.mapper;

import com.xx.domain.ScheduleCaches;
import com.xx.domain.ScheduleCachesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScheduleCachesMapper {
    long countByExample(ScheduleCachesExample example);

    int deleteByExample(ScheduleCachesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ScheduleCaches record);

    int insertSelective(ScheduleCaches record);

    List<ScheduleCaches> selectByExample(ScheduleCachesExample example);

    ScheduleCaches selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ScheduleCaches record, @Param("example") ScheduleCachesExample example);

    int updateByExample(@Param("record") ScheduleCaches record, @Param("example") ScheduleCachesExample example);

    int updateByPrimaryKeySelective(ScheduleCaches record);

    int updateByPrimaryKey(ScheduleCaches record);
}