package com.xx.mapper;

import com.xx.domain.TrafficAttr;
import com.xx.domain.TrafficAttrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrafficAttrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TrafficAttr record);

    List<TrafficAttr> selectList();

    TrafficAttr selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(TrafficAttr record);

}