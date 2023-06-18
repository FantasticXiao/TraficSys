package com.xx.service.impl;

import com.xx.domain.*;
import com.xx.mapper.*;
import com.xx.service.MajorFuncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class MajorFuncServiceImpl implements MajorFuncService {

    @Autowired(required = false)
    private SysUserMapper SysUserMapper;
    @Autowired(required = false)
    private SysMenuMapper SysMenuMapper;
    @Autowired(required = false)
    private SysRoleMapper SysRoleMapper;
    @Autowired(required = false)
    private TrafficAttrMapper TrafficAttrMapper;
    @Autowired(required = false)
    private TrafficInfoMapper TrafficInfoMapper;
    @Autowired(required = false)
    private StaffInfoMapper StaffInfoMapper;
    @Autowired(required = false)
    private SysRoleMenuMapper SysRoleMenuMapper;

    public Map<String,Object> logIn(String name, String password) {
        return SysUserMapper.logIn(name,password);
    }
    public List<SysMenu> getSysMenuList() {
        return SysMenuMapper.selectList();
    }
    public List<SysMenu> getSysMenuListByRoleId(Long roleId) {
        return SysMenuMapper.selectListByRoleId(roleId);
    }
    public List<SysRoleMenu> selectRoleMenuByRoleId(Long roleId) {
        return SysRoleMenuMapper.selectRoleMenuByRoleId(roleId);
    }
    public int roleMenuSave(List<SysRoleMenu> SysRoleMenu){
        int rs=0;
        if(SysRoleMenu.size()>0){
            List<SysRoleMenu> roleMenu=SysRoleMenuMapper.selectRoleMenuByRoleId(SysRoleMenu.get(0).getRoleId());
            if(roleMenu.size()>0){
                SysRoleMenuMapper.deleteByRoleId(SysRoleMenu.get(0).getRoleId());
            }
            for(int i=0;i<SysRoleMenu.size();i++){
                SysRoleMenuMapper.insert(SysRoleMenu.get(i));
            }
        }else{
            rs=1;
        }
        return rs;
    }

    public List<TrafficAttr> getTrafficAttrList(){
        return  TrafficAttrMapper.selectList();
    }
    public int addTrafficAttr(TrafficAttr trafficAttr){
        return TrafficAttrMapper.insert(trafficAttr);
    }
    public int editTrafficAttr(TrafficAttr trafficAttr) {
        return TrafficAttrMapper.updateByPrimaryKey(trafficAttr);
    }
    public int deleteTrafficAttr(Integer id) {
        return TrafficAttrMapper.deleteByPrimaryKey(id);
    }

    public List<TrafficInfo> getTrafficInfoList(){
        return  TrafficInfoMapper.selectList();
    }
    public int addTrafficInfo(TrafficInfo TrafficInfo){
        return TrafficInfoMapper.insert(TrafficInfo);
    }
    public int editTrafficInfo(TrafficInfo TrafficInfo) {
        return TrafficInfoMapper.updateByPrimaryKey(TrafficInfo);
    }
    public int deleteTrafficInfo(Integer id) {
        return TrafficInfoMapper.deleteByPrimaryKey(id);
    }

    public List<StaffInfo> getStaffInfoList(){
        return  StaffInfoMapper.selectList();
    }
    public List<Map<String, Object>> selectDepartmentList() {
        return StaffInfoMapper.selectDepartmentList();
    }
    public int addStaffInfo(StaffInfo StaffInfo){
        return StaffInfoMapper.insert(StaffInfo);
    }
    public int editStaffInfo(StaffInfo StaffInfo) {
        return StaffInfoMapper.updateByPrimaryKey(StaffInfo);
    }
    public int deleteStaffInfo(Integer id) {
        return StaffInfoMapper.deleteByPrimaryKey(id);
    }

    public List<SysRole> getSysRoleList(){
        return  SysRoleMapper.selectList();
    }
    public int addSysRole(SysRole SysRole){
        return SysRoleMapper.insert(SysRole);
    }
    public int editSysRole(SysRole SysRole) {
        return SysRoleMapper.updateByPrimaryKey(SysRole);
    }
    public int deleteSysRole(Long id) {
        SysRoleMenuMapper.deleteByRoleId(id);
        return SysRoleMapper.deleteByPrimaryKey(id);
    }



}

