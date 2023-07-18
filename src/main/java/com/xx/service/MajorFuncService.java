package com.xx.service;

import com.xx.domain.*;
import org.springframework.web.multipart.MultipartFile;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface MajorFuncService {

    Map<String,Object> logIn(String name, String password);
    List<SysMenu> getSysMenuList();
    List<SysMenu> getSysMenuListByRoleId(Long roleId);
    List<SysRoleMenu> selectRoleMenuByRoleId(Long roleId);
    int roleMenuSave(List<SysRoleMenu> SysRoleMenu);
    List<TrafficAttr> getTrafficAttrList();
    int addTrafficAttr(TrafficAttr trafficAttr);
    int editTrafficAttr(TrafficAttr trafficAttr);
    int deleteTrafficAttr(Integer id);

    List<TrafficInfo> getTrafficInfoList();
    int addTrafficInfo(TrafficInfo TrafficInfo);
    int editTrafficInfo(TrafficInfo TrafficInfo);
    int deleteTrafficInfo(Integer id);

    List<StaffInfo> getStaffInfoList();
    int addStaffInfo(StaffInfo StaffInfo);
    int editStaffInfo(StaffInfo StaffInfo);
    int deleteStaffInfo(Integer id);

    List<StaffDepartment> getStaffDepartmentList();
    int addStaffDepartment(StaffDepartment StaffDepartment);
    int editStaffDepartment(StaffDepartment StaffDepartment);
    int deleteStaffDepartment(Integer id);

    List<SysRole> getSysRoleList();
    int addSysRole(SysRole SysRole);
    int editSysRole(SysRole SysRole);
    int deleteSysRole(Long id);

    List<Map<String,Object>> getCarScheduleTable(String date) throws ParseException ;
    List<CarScheduleTable> getCarScheduleTableList(String date);
    List<CarScheduleTable> getOrderNameList();
    List<CarScheduleTable> getCarScheduleByOrderNumber(String orderNumber);
    List<Map<String,Object>> getDriverByCarNumber(String carNumber);
    List<CarScheduleTable> judgeIfEmpty(CarScheduleTable CarScheduleTable);
    int addCarScheduleTable(CarScheduleTable CarScheduleTable);
    int editCarScheduleTable(CarScheduleTable CarScheduleTable);
    int deleteCarScheduleTable(Long id);



}

