package com.xx.mapper;

import com.xx.domain.TrafficInfo;
import java.util.List;
import java.util.Map;

public interface TrafficInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(TrafficInfo record);

    List<TrafficInfo> selectList();
    List<Map<String,Object>> selectList2();

    TrafficInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(TrafficInfo record);

}