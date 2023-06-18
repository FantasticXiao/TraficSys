package com.xx.mapper;

import com.xx.domain.TrafficInfo;
import java.util.List;

public interface TrafficInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(TrafficInfo record);

    List<TrafficInfo> selectList();

    TrafficInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(TrafficInfo record);

}