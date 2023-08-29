package com.xx.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mchange.io.FileUtils;
import com.sun.imageio.plugins.common.ImageUtil;
import com.xx.domain.*;
import com.xx.service.MajorFuncService;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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
    @PostMapping( "/editSysUser")
    public int editSysUser(@RequestBody SysUser SysUser){
        return MajorFuncService.editSysUser(SysUser);
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
    //上班打卡
    @GetMapping("/getUserClockList")
    public List<UserClock> getUserClockList(String date){
        return MajorFuncService.getUserClockList(date);
    }
    @GetMapping("/getUserClockListByUserId")
    public List<UserClock> getUserClockByUserId(String userId,String date){
        return MajorFuncService.getUserClockByUserId(userId,date);
    }
    @PostMapping( "/addUserClock")
    public int addUserClock(@RequestBody UserClock UserClock){
        return MajorFuncService.addUserClock(UserClock);
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

    //部门信息管理相关接口
    @GetMapping("/getStaffDepartmentList")
    public List<StaffDepartment> getStaffDepartmentList(){
        return MajorFuncService.getStaffDepartmentList();
    }
    @PostMapping( "/addStaffDepartment")
    public int addStaffDepartment(@RequestBody StaffDepartment StaffDepartment){
        return MajorFuncService.addStaffDepartment(StaffDepartment);
    }
    @PostMapping( "/editStaffDepartment")
    public int editStaffDepartment(@RequestBody StaffDepartment StaffDepartment){
        return MajorFuncService.editStaffDepartment(StaffDepartment);
    }
    @PostMapping( "/deleteStaffDepartment")
    public int deleteStaffDepartment(@RequestBody StaffDepartment StaffDepartment){
        return MajorFuncService.deleteStaffDepartment(StaffDepartment.getId());
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
    @GetMapping("/getOrderNameList")
    public List<CarScheduleTable> getOrderNameList(){
        return MajorFuncService.getOrderNameList();
    }
    @GetMapping("/getCarScheduleByOrderNumber")
    public List<CarScheduleTable> getCarScheduleByOrderNumber(String orderName){
        return MajorFuncService.getCarScheduleByOrderNumber(orderName);
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


    /**
     * 接收上传文件的接口
     * @param urlFile 上传的文件
     * @param request 请求
     * @return
     */
    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile urlFile,HttpServletRequest request) {
        //  url =》 http://localhost:8899/upload
        StringBuffer url = request.getRequestURL();
        // 意思是 取出ip地址加端口 http://localhost:8899
        String baseUrl = url.substring(0, url.length() - (url.length() - url.lastIndexOf("/")));
        // 文件名称
        String fileName = System.currentTimeMillis() + urlFile.getOriginalFilename();
        // 文件存储的路径
//        String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\img\\";
        String filePath="G\\upload_files\\";
        File file = new File(filePath);
        // 当文件夹不存在 创建文件夹
        if (!file.exists()) {
            file.mkdir();
        }
        File dest = new File(filePath + fileName);
        String storeUrlPath = "/img/" + fileName;

        try {
            // 写到文件夹中
            urlFile.transferTo(dest);
            System.out.println("上传成功");
        } catch (IOException e) {
            System.out.println("上传失败");
            throw new RuntimeException(e);
        }
        return baseUrl+storeUrlPath;
    }



}

