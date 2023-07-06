package com.xx.service.impl;

import com.xx.domain.*;
import com.xx.mapper.*;
import com.xx.service.MajorFuncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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
    @Autowired(required = false)
    private CarScheduleTableMapper CarScheduleTableMapper;
    @Autowired(required = false)
    private ScheduleTableMapper ScheduleTableMapper;

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

    public List<Map<String,Object>> getCarScheduleTable(String date) throws ParseException {
        List<Map<String,Object>> result=new ArrayList<Map<String, Object>>();
        List<Map<String,Object>> trafficInfo=TrafficInfoMapper.selectList2();
        List<CarScheduleTable> carSchedulrTableList=getCarScheduleTableList(date);
        //SimpleDateFormat格式设置24小时制时，HH代表24小时制，hh代表12小时制
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH");
        for(Map<String,Object> traffic : trafficInfo){
            Map<String,Object> rs=new HashMap<String,Object>();
            String carNumber=traffic.get("car_number").toString();
            String resDriver=traffic.get("name").toString();
            String resDriverTel=traffic.get("tel").toString();
            List<String> days = new ArrayList();
            for(CarScheduleTable obj:carSchedulrTableList){
                if(carNumber.equals(obj.getCarNumber().toString())){
                    String start=simpleDateFormat.format(obj.getStartTime());
                    String end=simpleDateFormat.format(obj.getEndTime());
                    if(start.substring(0,10).equals(end.substring(0,10))){
                        //同一天，判断一整天、上午、下午
                        String type="";
                        Integer Shour=Integer.parseInt(start.substring(11,13));
                        Integer Ehour=Integer.parseInt(end.substring(11,13));
                        if(Ehour<13){
                            type="上午:";
                        }else if(Shour>=13){
                            type="下午:";
                        }
                        if(rs.get(start.substring(8,10)+"号")!=null){
                            String str=rs.get(start.substring(8,10)+"号").toString();
                            rs.put(start.substring(8,10)+"号",str+","+type+obj.getDescription());
                        }else{
                            rs.put(start.substring(8,10)+"号",type+obj.getDescription());
                        }
                    }else{
                        days=findEveryDay(start,end);
                        for(String day:days){
                            rs.put(day.substring(8,10)+"号",obj.getDescription());
                        }
                    }
                }
            }
            rs.put("carNumber",carNumber);
            rs.put("resDriver",resDriver);
            rs.put("resDriverTel",resDriverTel);
            result.add(rs);
        }
        return result;
    }
    public List<CarScheduleTable> getCarScheduleTableList(String date){
        return CarScheduleTableMapper.selectList(date);
    }

    public List<Map<String, Object>> getDriverByCarNumber(String carNumber) {
        return CarScheduleTableMapper.getDriverByCarNumber(carNumber);
    }

    public List<CarScheduleTable> judgeIfEmpty(CarScheduleTable CarScheduleTable) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH");
        String carNumber=CarScheduleTable.getCarNumber();
        String start=simpleDateFormat.format(CarScheduleTable.getStartTime());
        String end=simpleDateFormat.format(CarScheduleTable.getEndTime());
        String id=(CarScheduleTable.getId()==0 ? "" : CarScheduleTable.getId().toString());
        return CarScheduleTableMapper.judgeIfEmpty(carNumber,start,end,id);
    }

    public int addCarScheduleTable(CarScheduleTable CarScheduleTable){
        return CarScheduleTableMapper.insert(CarScheduleTable);
    }
    public int editCarScheduleTable(CarScheduleTable CarScheduleTable) {
        return CarScheduleTableMapper.updateByPrimaryKey(CarScheduleTable);
    }
    public int deleteCarScheduleTable(Long id) {
        return CarScheduleTableMapper.deleteByPrimaryKey(id);
    }
    

    
    public List<Map<String,Object>> getScheduleTableList(String month) {
        return ScheduleTableMapper.selectList(month);
    }
    public List<Map<String,Object>> getScheduleHistory() {
        return ScheduleTableMapper.getScheduleHistory();
    }
    public List<Map<String,Object>> getScheduleTableListForCalendar(String month) throws ParseException {
        List<Map<String,Object>> rs=ScheduleTableMapper.selectList(month);
        List<Map<String,Object>> result=new ArrayList<Map<String,Object>>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String startDate=month+"-01";
        int m=Integer.parseInt(month.substring(5,7))+1;
        String endDate=(month.substring(0,5)+(m<10 ? "0"+m : m)+"-01");
        List<String> dates = findEveryDay(startDate,endDate);
        for(int i=0;i<dates.size();i++){
            List<Map<String,Object>> children=new ArrayList<Map<String,Object>>();
            for(int j=0;j<rs.size();j++){
                boolean flag=belongCalendar(
                        simpleDateFormat.parse(dates.get(i)),
                        simpleDateFormat.parse(rs.get(j).get("start_time").toString()),
                        simpleDateFormat.parse(rs.get(j).get("end_time").toString()));
                if(flag){
                    Map<String,Object> map=new HashMap();
                    map.put("driver",rs.get(j).get("staff_name"));
                    map.put("number",rs.get(j).get("car_number"));
                    map.put("tel",rs.get(j).get("tel"));
                    map.put("tripDetail",rs.get(j).get("trip_detail"));
                    children.add(map);
                }
            }
            Map<String,Object> MAP=new HashMap();
            MAP.put("day", dates.get(i));
            MAP.put("children", children);
            result.add(MAP);
        }
        return  result;
    }
    public int addScheduleTable(ScheduleTable ScheduleTable){
        return ScheduleTableMapper.insert(ScheduleTable);
    }
    public int editScheduleTable(ScheduleTable ScheduleTable) {
        return ScheduleTableMapper.updateByPrimaryKey(ScheduleTable);
    }
    public int deleteScheduleTable(Long id) {
        return ScheduleTableMapper.deleteByPrimaryKey(id);
    }

    public static String transA2B(String a){
        String rs = a;
        if (a.contains("_")) {
            int i = a.indexOf("_");
            int j = i + 1;
            char c = a.charAt(j);
            StringBuilder append = new StringBuilder().append(c);
            String daxie = append.toString().toUpperCase();
            String old = new StringBuilder().append("_").append(c).toString();
            rs = a.replace(old, daxie);
        }
        return rs;
    }
    /**
     * 传入两个时间范围，返回这两个时间范围内的所有日期，并保存在一个集合中
     * @param beginTime
     * @param endTime
     */
    public static List<String> findEveryDay(String beginTime, String endTime)
            throws ParseException {
        //1.创建一个放所有日期的集合
        List<String> dates = new ArrayList();
        //2.创建时间解析对象规定解析格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //3.将传入的时间解析成Date类型,相当于格式化
        Date dBegin = sdf.parse(beginTime);
        Date dEnd = sdf.parse(endTime);
        //4.将格式化后的第一天添加进集合
        dates.add(sdf.format(dBegin));
        //5.使用本地的时区和区域获取日历
        Calendar calBegin = Calendar.getInstance();
        //6.传入起始时间将此日历设置为起始日历
        calBegin.setTime(dBegin);
        //8.判断结束日期是否在起始日历的日期之后
        while (dEnd.after(calBegin.getTime())) {
            // 9.根据日历的规则:月份中的每一天，为起始日历加一天
            calBegin.add(Calendar.DAY_OF_MONTH, 1);
            //10.得到的每一天就添加进集合
            dates.add(sdf.format(calBegin.getTime()));
            //11.如果当前的起始日历超过结束日期后,就结束循环
        }
        return dates;
    }
    /**
     * 判断时间是否在时间段内
     * @param nowTime
     * @param beginTime
     * @param endTime
     * @return
     */
    public static boolean belongCalendar(Date nowTime, Date beginTime, Date endTime) {
        //设置当前时间
        Calendar date = Calendar.getInstance();
        date.setTime(nowTime);
        //设置开始时间
        Calendar begin = Calendar.getInstance();
        begin.setTime(beginTime);
        //设置结束时间
        Calendar end = Calendar.getInstance();
        end.setTime(endTime);
        //处于开始时间之后，和结束时间之前的判断
        if ((date.after(begin) && date.before(end)) || date.equals(begin) || date.equals(end)) {
            return true;
        } else {
            return false;
        }
    }


}


