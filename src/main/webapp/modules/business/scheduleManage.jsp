<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>出车排班表</title>
    <%@include file="../config.jsp"%>
    <style>
         .el-table thead.is-group th {
             background: none;
         }
        .el-table thead.is-group tr:first-of-type th:first-of-type {
            border-bottom: none;
        }
        .el-table thead.is-group tr:first-of-type th:first-of-type:before {
            content: '';
            position: absolute;
            width: 1px;
            height: 250px;
            top: 0;
            left: 0;
            background-color: grey;
            opacity: 0.3;
            display: block;
            transform: rotate(-72deg);
            transform-origin: top;
        }
        .el-table thead.is-group tr:last-of-type th:first-of-type:before {
            content: '';
            position: absolute;
            width: 1px;
            height: 250px;
            bottom: 0;
            right: 0;
            background-color: grey;
            opacity: 0.3;
            display: block;
            transform: rotate(-72.5deg);
            transform-origin: bottom;
        }
         .el-input, .el-select, .el-date-editor{
             width:150px!important;
         }
        .el-form-item__content .el-date-editor{
            width:360px!important;
        }
    </style>

</head>
<body>
<div id="app">
    <el-header>
        <el-row :gutter="2">
            <el-date-picker v-model="date" type="month" placeholder="选择年月"
                            value-format="yyyy-MM" @change="initTableData"></el-date-picker>
            <el-input placeholder="负责司机" autocomplete="false" v-model="driver"
                      prefix-icon="el-icon-search" @change="search('driver')"></el-input>
            <el-input placeholder="车牌号" autocomplete="false" v-model="number"
                      prefix-icon="el-icon-search" @change="search('number')"></el-input>
            &nbsp;&nbsp;
            <el-button type="primary" icon="el-icon-plus" @click="dialogVisible = true">新增排班</el-button>
        </el-row>
    </el-header>
    <el-table height="440" :data="tableData" fit border size="small" :header-cell-style="{ background: '#FAFAFA' }" v-loading="loading">
        <template>
            <el-table-column prop="day" label="日期" width="250" align="right" fixed>
                <el-table-column prop="columnName" label="车牌号" align="left" width="250"></el-table-column>
            </el-table-column>
        </template>
        <template>
            <el-table-column align="center" v-for="(item, i) in dayAndWeek" :label="item.week">
                <el-table-column align="center" :label="item.time" :prop="item.time"  width="100"></el-table-column>
                <%--<template slot-scope="scope">
                    <el-row prop='day'>{{ scope.row.item.time }}</el-row>
                    <el-row prop='week'>{{ scope.row.item.week }}</el-row>
                </template>--%>
                <%--<template slot-scope="scope">
                    <div :class="dayGanttType(scope.row, item)"></div>
                </template>--%>
            </el-table-column>
        </template>
    </el-table>
    <el-dialog title="新增出车排班" :visible.sync="dialogVisible">
        <el-form :model="form"  ref="roleForm" :rules="rules" :inline="true" class="demo-form-inline">
           <%-- <el-form-item label="天数" :label-width="formLabelWidth" prop="type">
                <el-radio-group v-model="form.type">
                <el-radio-button label="单日">单日</el-radio-button>
                <el-radio-button label="多日">多日</el-radio-button>
                </el-radio-group>
            </el-form-item>
            <el-form-item v-if="form.type=='单日' " :label-width="formLabelWidth" label="单日排班" required>
                    <el-form-item prop="day">
                        <el-date-picker type="date" placeholder="选择日期" v-model="form.day" ></el-date-picker>
                    </el-form-item>
                    <el-form-item prop="startTime">
                        <el-time-picker placeholder="开始时间" v-model="form.startTime" ></el-time-picker>
                    </el-form-item>
                        -
                    <el-form-item prop="endTime">
                        <el-time-picker placeholder="结束时间" v-model="form.endTime" ></el-time-picker>
                    </el-form-item>
            </el-form-item>
            <el-form-item v-if="form.type=='多日' " :label-width="formLabelWidth" label="多日排班" required>
                    <el-form-item prop="startTime">
                        <el-date-picker type="datetime" placeholder="开始时间" v-model="form.startTime" ></el-date-picker>
                    </el-form-item>
                        -
                    <el-form-item prop="endTime">
                        <el-date-picker type="datetime" placeholder="结束时间" v-model="form.endTime"></el-date-picker>
                    </el-form-item>
            </el-form-item>--%>
               <el-form-item :label-width="formLabelWidth" label="出车时间" required>
                   <el-date-picker
                           v-model="form.endTime"
                           type="datetimerange"
                           align="right"  value-format="yyyy-MM-dd HH:mm:ss"
                           start-placeholder="出发时间"
                           end-placeholder="返车时间"
                           :default-time="['08:00:00', '17:00:00']">
                   </el-date-picker>
               </el-form-item>
            <el-form-item label="车牌号" :label-width="formLabelWidth" prop="carNumber">
                <el-select v-model="form.carNumber" filterable placeholder="车牌号" @change="getResDriver">
                    <el-option v-for="item in carOptions" :key="item.id" :label="item.carNumber" :value="item.carNumber"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="负责司机" :label-width="formLabelWidth" prop="resDriver">
                <el-input v-model="form.resDriver" :disabled="true"></el-input>
            </el-form-item>
               <el-form-item label="座位数" :label-width="formLabelWidth" prop="passengerCapacity">
                   <el-input v-model="form.passengerCapacity" :disabled="true"></el-input>
               </el-form-item>
            <el-form-item label="跟车司机" :label-width="formLabelWidth" prop="driver">
                <el-select v-model="form.driver" filterable placeholder="跟车司机">
                    <el-option v-for="item in driverOptions" :key="item.id" :label="item.name" :value="item.name"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="出发地" :label-width="formLabelWidth" prop="startAddress">
                <el-input  v-model="form.startAddress" autocomplete="off" placeholder="出发地"></el-input>
            </el-form-item>
            <el-form-item label="目的地" :label-width="formLabelWidth" prop="endAddress">
                <el-input  v-model="form.endAddress" autocomplete="off" placeholder="目的地"></el-input>
            </el-form-item>
            <el-form-item label="对接旅行社" :label-width="formLabelWidth" prop="travelAgency">
                <el-input  v-model="form.travelAgency" autocomplete="off" placeholder="对接旅行社"></el-input>
            </el-form-item>
            <el-form-item label="旅行社联系人" :label-width="formLabelWidth" prop="travelAgencyResponsibility">
                <el-input  v-model="form.travelAgencyResponsibility" autocomplete="off" placeholder="旅行社联系人"></el-input>
            </el-form-item>
            <el-form-item label="行程简述" :label-width="formLabelWidth" prop="status">
                <el-input  v-model="form.status" autocomplete="off" placeholder="行程简述"></el-input>
            </el-form-item>
            <el-form-item label="车价" :label-width="formLabelWidth" prop="price">
                <el-input  v-model="form.price" autocomplete="off" placeholder="车价"></el-input>
            </el-form-item>
        </el-form>
        <div slot="footer" class="dialog-footer">
            <el-button @click="dialogVisible = false">取 消</el-button>
            <el-button type="primary" @click="addFunc">确 定</el-button>
        </div>
    </el-dialog>
</div>
</body>
<script>
    new Vue({
        el: '#app',
        data() {
            return {
                date:'',
                driver:'',
                number:'',
                tableData:[],
                loading: false,
                dayAndWeek:[],
                dialogVisible:false,
                form: {
                    /*"year":null, "month": null,"day": null, "type": '单日',*/
                    "startTime": null, "endTime": null, "carNumber": null, "status": null,
                    "startAddress": null, "endAddress": null, "goTime": null, "travelAgency": null,
                    "travelAgencyResponsibility": null, "price": null, "driver": null, "driverTel": null, "createTime": null
                },
                rules: {
                    endTime: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    carNumber: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    startAddress: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    endAddress: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    price: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    status: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    driver: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    travelAgencyResponsibility: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    travelAgency: [{ required: true, message: '不能为空', trigger: 'blur' },],
                },
                formLabelWidth: '120px',
                carOptions:[],
                driverOptions:[],
            };
        },
        methods: {
            setColSpan () {
                // 获取表头的所有单元格
                var x = document.getElementsByClassName("el-table__header")[0].rows[0]
                    .cells;
                for (let i = 0; i < x.length; i++) {
                    if (i === x.length - 1) {
                        return;
                    }
                    if (i % 2 !== 0) {
                        // 将第二列表头单元格的colSpan设为2
                        x[i].colSpan = 2;
                        // 将第三列表头单元格的display设为none
                        x[i + 1].style.display = "none";
                    }
                }
            },
            dayGanttType (row, date) {
                // 获取时间数组
                const r = row.time;
                // 遍历多组时间
                for (let i = 0; i < r.length; i++) {
                    // 获取每组时间的开始时间
                    let start_date = r[i].startDate;
                    // 获取每组时间的结束时间
                    let end_date = r[i].endDate;
                    // 查看时间是否在开始和结束时间之间
                    // compareDate方法是获取判断条件的，在这里不重要，就不上代码了。
                    const flag = this.compareDate(start_date, end_date, date);
                    // 如果存在
                    if (flag) {
                        // 判断条件，主要是区分显示颜色，不重要
                        if (r[i].flag === "1") {
                            // 添加class
                            return "wl-item-on";
                        } else {
                            // 添加class
                            return "wl-item-on green";
                        }
                    }
                }
            },
            intiDayAndWeek(date) {
                let me=this;
                let year = date.getFullYear();//获取当前年份
                let month = date.getMonth() + 1;//获取当前月份
                let dd = new Date(year, month, 0);//获取当月总天数
                let weekList = ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"];
                for (let i = 1; i <= dd.getDate(); i++) {
                    if(i<10){
                        me.dayAndWeek.push({
                            time: "0"+i + "号",
                            week: weekList[new Date(date.setDate(i)).getDay()],//获取对应日期的星期
                        });
                    }else{
                        me.dayAndWeek.push({
                            time: i + "号",
                            week: weekList[new Date(date.setDate(i)).getDay()],//获取对应日期的星期
                        });
                    }
                }

            },
            initOptions(){
                let me=this;
                axios.get('../../demo/getTrafficInfoList').then(res=>{
                    if(res.data!=''){
                        me.carOptions=res.data;
                    }
                });
                axios.get('../../demo/getStaffInfoList').then(res=>{
                    if(res.data!=''){
                        me.driverOptions=res.data;
                    }
                });
            },
            initTableData(){
                let me=this;
                axios({
                    type: 'post',
                    url: '../../demo/getCarScheduleTable',
                    params: {date:this.date}
                }).then(res=>{
                    if(res.data!=''){
                        let data=res.data;
                        data.forEach(v=>{
                            v.columnName=v.carNumber+":"+v.resDriver.substring(0,1)+v.resDriverTel;
                        })
                        me.tableData=res.data;
                    }else{
                        alert(err);
                    }
                });
            },
            search(type){
                this.searchDay=[];
                this.tableData.forEach(v=>{
                        if(v[type].indexOf(this[type])>-1) this.tableData.push(v);
                    })
            },
            getResDriver(){
              let me=this;
              let driverId='无';
              let driverTel='';
              me.carOptions.forEach(v=>{
                  if(me.form.carNumber==v.carNumber){
                      driverId=v.driverId;
                      me.form.passengerCapacity=v.passengerCapacity;
                  }
              })
                me.driverOptions.forEach(v=>{
                    if(v.id==driverId){
                        driverId=v.name;
                        driverTel=v.tel;
                    }
                })
                me.form.resDriver=driverId;
                me.form.resDriverTel=driverTel;
            },
            addFunc(){
                let me=this;
                let v=me.form;
                me.loading=true;
                v.createTime=getNow();
                v.startTime=v.endTime[0];
                v.endTime=v.endTime[1];
                me.driverOptions.forEach(v=>{
                    if(me.form.driver==v.name) me.form.driverTel=v.tel;
                })
                this.$refs['roleForm'].validate((valid) => {
                    if (valid) {
                        axios.post('../../demo/addCarScheduleTable',v).then(res=>{
                            if(res.data!=''){
                                me.initTableData();
                                me.dialogVisible = false;
                                me.loading=false;
                                me.$refs['roleForm'].resetFields();
                                me.$message({
                                    type: 'success',
                                    message: '排班记录已生成！'
                                });
                            }
                        },err=>{
                            alert("新增数据失败！");
                        });
                    } else {
                        return false;
                    }
                });
            },
        },
        computed: {

        },
        mounted() {
            let me=this;
            me.$nextTick(function () {
                me.date=getNowMonth();
                me.initTableData();
                me.setColSpan();
                me.intiDayAndWeek(new Date());
                me.initOptions();
            });
        }
    });
</script>
</html>
