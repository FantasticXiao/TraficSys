package com.xx.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.xx.domain.*;
import com.xx.service.MajorFuncService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.GET;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/demo")
public class Controller {

    // 前端需要传这种格式的字符串
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")

    @Autowired
    private MajorFuncService MajorFuncService;

    @GetMapping("/login")
    public  Map<String,Object> Login(String name, String password) {
        Map<String,Object> rs = MajorFuncService.logIn(name,password);
        return rs;
    }
    @GetMapping("/getSysMenuList")
    public List<SysMenu> getSysMenuList(){
        return MajorFuncService.getSysMenuList();
    }
    @GetMapping("/getSysMenuListByRoleId")
    public List<SysMenu> getSysMenuListByRoleId(Long roleId){
        return MajorFuncService.getSysMenuListByRoleId(roleId);
    }
    @GetMapping("/selectRoleMenuByRoleId")
    public List<SysRoleMenu> selectRoleMenuByRoleId(Long roleId){
        return MajorFuncService.selectRoleMenuByRoleId(roleId);
    }
    @PostMapping("/roleMenuSave")
    public int roleMenuSave(@RequestBody List<SysRoleMenu> SysRoleMenu){
        return MajorFuncService.roleMenuSave(SysRoleMenu);
    }

    //车辆属性的接口，诸如车牌、颜色、型号
    @GetMapping("/getTrafficAttrList")
    public List<TrafficAttr> getTrafficAttrList(){
        return MajorFuncService.getTrafficAttrList();
    }

    @PostMapping( "/addTrafficAttr")
    public int addTrafficAttr(@RequestBody TrafficAttr trafficAttr){
        return MajorFuncService.addTrafficAttr(trafficAttr);
    }
    @PostMapping( "/editTrafficAttr")
    public int editTrafficAttr(@RequestBody TrafficAttr trafficAttr){
        return MajorFuncService.editTrafficAttr(trafficAttr);
    }
    @PostMapping( "/deleteTrafficAttr")
    public int deleteTrafficAttr(@RequestBody TrafficAttr trafficAttr){
        return MajorFuncService.deleteTrafficAttr(trafficAttr.getId());
    }

    //车辆信息管理相关接口
   @GetMapping("/getTrafficInfoList")
    public List<TrafficInfo> getTrafficInfoList(){
        return MajorFuncService.getTrafficInfoList();
    }

    @PostMapping( "/addTrafficInfo")
    public int addTrafficInfo(@RequestBody TrafficInfo TrafficInfo){
        return MajorFuncService.addTrafficInfo(TrafficInfo);
    }
    @PostMapping( "/editTrafficInfo")
    public int editTrafficInfo(@RequestBody TrafficInfo TrafficInfo){
        return MajorFuncService.editTrafficInfo(TrafficInfo);
    }
    @PostMapping( "/deleteTrafficInfo")
    public int deleteTrafficInfo(@RequestBody TrafficInfo TrafficInfo){
        return MajorFuncService.deleteTrafficInfo(TrafficInfo.getId());
    }
    //员工信息管理相关接口
    @GetMapping("/getStaffInfoList")
    public List<StaffInfo> getStaffInfoList(){
        return MajorFuncService.getStaffInfoList();
    }

    @GetMapping("/selectDepartmentList")
    public List<Map<String,Object>> selectDepartmentList(){
        return MajorFuncService.selectDepartmentList();
    }

    @PostMapping( "/addStaffInfo")
    public int addStaffInfo(@RequestBody StaffInfo StaffInfo){
        return MajorFuncService.addStaffInfo(StaffInfo);
    }
    @PostMapping( "/editStaffInfo")
    public int editStaffInfo(@RequestBody StaffInfo StaffInfo){
        return MajorFuncService.editStaffInfo(StaffInfo);
    }
    @PostMapping( "/deleteStaffInfo")
    public int deleteStaffInfo(@RequestBody StaffInfo StaffInfo){
        return MajorFuncService.deleteStaffInfo(StaffInfo.getId());
    }

    //用户角色的接口 sys_role
    @GetMapping("/getSysRoleList")
    public List<SysRole> getSysRoleList(){
        return MajorFuncService.getSysRoleList();
    }
    @PostMapping( "/addSysRole")
    public int addSysRole(@RequestBody SysRole SysRole){
        return MajorFuncService.addSysRole(SysRole);
    }
    @PostMapping( "/editSysRole")
    public int editSysRole(@RequestBody SysRole SysRole){
        return MajorFuncService.editSysRole(SysRole);
    }
    @PostMapping( "/deleteSysRole")
    public int deleteSysRole(@RequestBody SysRole SysRole){
        return MajorFuncService.deleteSysRole(SysRole.getId());
    }

    //出车排班表+出车订单管理
    @GetMapping("/getCarScheduleTable")  //-甘特图形式对应的数据
    public List<Map<String,Object>> getCarScheduleTable(String date) throws ParseException {
        return MajorFuncService.getCarScheduleTable(date);
    }
    @GetMapping("/getCarScheduleTableList")
    public List<CarScheduleTable> getCarScheduleTableList(String date){
        return MajorFuncService.getCarScheduleTableList(date);
    }
    @GetMapping("/getDriverByCarNumber")
    public List<Map<String,Object>> getDriverByCarNumber(String carNumber){
        return MajorFuncService.getDriverByCarNumber(carNumber);
    }
    @PostMapping( "/judgeIfEmpty")
    public List<CarScheduleTable> judgeIfEmpty(@RequestBody CarScheduleTable CarScheduleTable){
        return MajorFuncService.judgeIfEmpty(CarScheduleTable);
    }
    @PostMapping( "/addCarScheduleTable")
    public int addCarScheduleTable(@RequestBody CarScheduleTable CarScheduleTable){
        return MajorFuncService.addCarScheduleTable(CarScheduleTable);
    }
    @PostMapping( "/editCarScheduleTable")
    public int editCarScheduleTable(@RequestBody CarScheduleTable CarScheduleTable){
        return MajorFuncService.editCarScheduleTable(CarScheduleTable);
    }
    @PostMapping( "/deleteCarScheduleTable")
    public int deleteCarScheduleTable(@RequestBody CarScheduleTable CarScheduleTable){
        return MajorFuncService.deleteCarScheduleTable(CarScheduleTable.getId());
    }







    //出车排班表----作废
    @GetMapping("/getScheduleTableList")
    public List<Map<String,Object>> getScheduleTableList(String month){
        return MajorFuncService.getScheduleTableList(month);
    }
    @GetMapping("/getScheduleTableListForCalendar")
    public List<Map<String,Object>> getScheduleTableListForCalendar(String month) throws ParseException {
        return MajorFuncService.getScheduleTableListForCalendar(month);
    }
    @GetMapping("/getScheduleHistory")
    public List<Map<String,Object>> getScheduleHistory(){
        return MajorFuncService.getScheduleHistory();
    }
    @PostMapping( "/addScheduleTable")
    public int addScheduleTable(@RequestBody ScheduleTable ScheduleTable){
        return MajorFuncService.addScheduleTable(ScheduleTable);
    }
    @PostMapping( "/editScheduleTable")
    public int editScheduleTable(@RequestBody ScheduleTable ScheduleTable){
        return MajorFuncService.editScheduleTable(ScheduleTable);
    }
    @PostMapping( "/deleteScheduleTable")
    public int deleteScheduleTable(@RequestBody ScheduleTable ScheduleTable){
        return MajorFuncService.deleteScheduleTable(ScheduleTable.getId());
    }

}

