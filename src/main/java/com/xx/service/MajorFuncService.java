package com.xx.service;

import com.xx.domain.*;

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
    List<Map<String,Object>> selectDepartmentList();
    int addStaffInfo(StaffInfo StaffInfo);
    int editStaffInfo(StaffInfo StaffInfo);
    int deleteStaffInfo(Integer id);

    List<SysRole> getSysRoleList();
    int addSysRole(SysRole SysRole);
    int editSysRole(SysRole SysRole);
    int deleteSysRole(Long id);

}

