package com.xx.mapper;

import com.xx.domain.StaffDepartment;
import com.xx.domain.StaffDepartmentExample;
import java.util.List;

import com.xx.domain.StaffInfo;
import org.apache.ibatis.annotations.Param;

public interface StaffDepartmentMapper {

    List<StaffDepartment> selectList();

    long countByExample(StaffDepartmentExample example);

    int deleteByExample(StaffDepartmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StaffDepartment record);

    int insertSelective(StaffDepartment record);

    List<StaffDepartment> selectByExample(StaffDepartmentExample example);

    StaffDepartment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StaffDepartment record, @Param("example") StaffDepartmentExample example);

    int updateByExample(@Param("record") StaffDepartment record, @Param("example") StaffDepartmentExample example);

    int updateByPrimaryKeySelective(StaffDepartment record);

    int updateByPrimaryKey(StaffDepartment record);
}