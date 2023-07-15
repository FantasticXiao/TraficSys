<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>出车排班表</title>
    <%@include file="../config.jsp"%>
    <style>
        .is-selected {
            color: #1989FA;
        }
        .el-calendar-table .el-calendar-day {
            height: auto;
        }
        .el-header{
            padding: 0px 0px;
        }
        .el-input, .el-select, .el-date-editor{
            width:150px!important;
        }
        .switchCss{
            position: absolute;
            right: 5px;
            top: 20px;
        }
        .calendarDiv{
            position: absolute;
            top:60px;
            bottom:5px;
            overflow: auto;
        }
    </style>
</head>
<body>
<div id="app">
    <el-header>
    <el-row :gutter="2">
            <el-input placeholder="出车师傅" autocomplete="false" v-model="driver"
                      prefix-icon="el-icon-search" @change="search('driver')"></el-input>
            <el-input placeholder="车牌号" autocomplete="false" v-model="number"
                      prefix-icon="el-icon-search" @change="search('number')"></el-input>
        <%--    <el-input placeholder="手机号码" autocomplete="false" v-model="tel"
                      prefix-icon="el-icon-search" @change="search('tel')"></el-input>--%>
            &nbsp;&nbsp;
            <el-button type="primary" icon="el-icon-plus" @click="add">新增排班</el-button>
            <el-button type="primary" icon="el-icon-user-solid" @click="show">查看详情</el-button>

    </el-row>
        <el-switch class="switchCss" v-model="switchValue" @change="calendarVisible=!calendarVisible"></el-switch>
    </el-header>

    <div v-if="calendarVisible" class="calendarDiv">
    <el-calendar>
        <!-- 这里使用的是 2.5 slot 语法，对于新项目请使用 2.6 slot 语法-->
        <template slot="dateCell" slot-scope="{date, data}" >
            <el-badge :is-dot="intDOT(data)" class="item" >
                <p :class="data.isSelected ? 'is-selected' : ''" >
                    {{ data.day.split('-').slice(2).join('-') }}
                    {{ data.isSelected ? chooseDay(data) : ''}}
                </p>
            </el-badge>
                <template v-for="item in initDIV(data)">
                    <el-tag>{{ item.driver }} - {{ item.number }} </el-tag><br/>
                </template>
        </template>
    </el-calendar>
    </div>

    <el-table  v-if="!calendarVisible" :data="tableData"  border :height="TableHeight">
        <template slot="empty">
            <p>{{dataText}}</p>
        </template>
        <el-table-column prop="car_number" label="车牌号"></el-table-column>
        <el-table-column prop="staff_name" label="负责司机"></el-table-column>
        <el-table-column prop="tel" label="联系方式"></el-table-column>
        <el-table-column prop="start_time" label="行程开始时间"></el-table-column>
        <el-table-column prop="end_time" label="行程结束时间"></el-table-column>
        <el-table-column prop="type" label="排版类型"></el-table-column>
        <el-table-column prop="trip_detail" label="行程描述"></el-table-column>
        <el-table-column fixed="right" label="操作" width="150">
            <template slot-scope="scope">
                <el-button @click="editFunc(scope.row)" type="text"><i class="el-icon-edit"></i>编辑</el-button>
                <el-button @click="deleteFunc(scope.row)" type="text"><i class="el-icon-delete"></i>删除</el-button>
            </template>
        </el-table-column>
    </el-table>


    <el-dialog title="新增出车排班" :visible.sync="dialogVisible">
        <el-form :model="form"  ref="roleForm" :rules="rules" :inline="true" class="demo-form-inline">
            <el-form-item label="车牌号" :label-width="formLabelWidth" prop="trafficId">
                <el-select v-model="form.trafficId" filterable placeholder="车牌号">
                    <el-option v-for="item in carOptions" :key="item.id" :label="item.carNumber" :value="item.id"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="负责司机" :label-width="formLabelWidth" prop="staffId">
                <el-select v-model="form.staffId" filterable placeholder="负责司机">
                    <el-option v-for="item in driverOptions" :key="item.id" :label="item.name" :value="item.id"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="开始时间" :label-width="formLabelWidth" prop="startTime">
                <el-date-picker type="date" placeholder="选择日期" v-model="form.startTime" value-format="yyyy-MM-dd"></el-date-picker>
            </el-form-item>
            <el-form-item label="结束时间" :label-width="formLabelWidth" prop="endTime">
                <el-date-picker type="date" placeholder="选择日期" v-model="form.endTime" value-format="yyyy-MM-dd"></el-date-picker>
            </el-form-item>
            <el-form-item label="类型" :label-width="formLabelWidth" prop="type">
                <el-input v-model="form.type" autocomplete="off" placeholder="类型"></el-input>
            </el-form-item>
            <el-form-item label="行程描述" :label-width="formLabelWidth" prop="tripDetail">
                <el-input  v-model="form.tripDetail" autocomplete="off" placeholder="行程描述"></el-input>
            </el-form-item>
            <el-form-item label="备注" :label-width="formLabelWidth">
                <el-input v-model="form.remark" type="textarea" :rows="3"></el-input>
            </el-form-item>
        </el-form>
        <div slot="footer" class="dialog-footer">
            <el-button @click="dialogVisible = false">取 消</el-button>
            <el-button type="primary" @click="addFunc">确 定</el-button>
        </div>
    </el-dialog>

    <el-dialog :title="dialogDetailTitle" :visible.sync="dialogDetailVisible">
        <template>
            <el-table :data="tableData" height="250" border style="width: 100%">
                <el-table-column prop="number" label="车牌号" width="180"></el-table-column>
                <el-table-column prop="driver" label="司机" width="180"></el-table-column>
                <el-table-column prop="tel" label="联系电话" width="180"></el-table-column>
                <el-table-column prop="tripDetail" label="行程描述" width="180"></el-table-column>
            </el-table>
        </template>
        <div slot="footer" class="dialog-footer">
            <el-button @click="dialogDetailVisible = false">关 闭</el-button>
        </div>
    </el-dialog>

</div>
</body>
<script>
    new Vue({
        el: '#app',
        data() {
            return {
                selectDay:new Date(),
                switchValue:true,
                calendarVisible:true,
                searchDay:[],
                driver:'',
                number:'',
                tel:'',
                jsonData:[],
//                [{day:'2023-06-05',children: [{driver:'张三',number:'浙AXXXXX',tel:'11111111111'}]}],
                tableData:[],
                dialogVisible:false,
                form: {
                    trafficId: null,
                    staffId:null,
                    startTime:null,
                    endTime:null,
                    type:null,
                    tripDetail:null,
                    remark:null,
                },
                rules: {
                    trafficId: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    staffId: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    startTime: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    endTime: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    type: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    tripDetail: [{ required: true, message: '不能为空', trigger: 'blur' },],
                },
                formLabelWidth: '120px',
                carOptions:[],
                driverOptions:[],
                dialogDetailVisible:false,
                dialogDetailTitle:'',
                dataText:'',
                tableData:[],
                historyData:[],
            };
        },
        methods: {
            chooseDay(item){
                this.selectDay=item.day;
            },
            show(){
              let me=this;
                me.dialogDetailVisible=true;
                me.dialogDetailTitle=me.selectDay+"——排班详情";
                me.jsonData.forEach(v=>{
                    if(v.day==me.selectDay){
                        me.tableData=v.children;
                    }
                })
            },
            initDIV(item){
                let data=this.jsonData;
                for(let i=0;i<data.length;i++){
                    if(data[i].day == item.day && data[i].children.length>0){
                        return data[i].children;
                    }
                }
            },
            intDOT(item){
               if(this.searchDay.indexOf(item.day)>-1) return true;
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
            search(type){
                this.searchDay=[];
                this.jsonData.forEach(v=>{
                    let children=v.children;
                    children.forEach(t=>{
                        if(t[type].indexOf(this[type])>-1) this.searchDay.push(v.day);

                    })
                })
            },
            initData(){
                let me=this;
                me.jsonData=[];
                let tm=dateConversion(me.selectDay);
                axios({
                    type: 'post',
                    url: '../../demo/getScheduleTableListForCalendar',
                    params: {month:tm}
                }).then(res=>{
                    if(res.data!=''){
                        me.jsonData=res.data;
                    }else{
                        alert(err);
                    }
                });
                axios({
                    type: 'post',
                    url: '../../demo/getScheduleTableList',
                    params: {month:tm}
                }).then(res=>{
                    if(res.data!=''){
                        me.tableData=res.data;
                    }else{
                        alert(err);
                    }
                });
                axios.get('../../demo/getScheduleHistory').then(res=>{
                    if(res.data!=''){
                       me.historyData=res.data;
                    }
                });
            },
            add(){
                let me=this;
                me.dialogVisible=true;
                if(me.$refs['roleForm']!=undefined) me.$refs['roleForm'].resetFields();
            },
            addFunc(){
                let me=this;
                let v=me.form;
                v.createTime=getNow();
                this.$refs['roleForm'].validate((valid) => {
                    if (valid) {
                        axios.post('../../demo/addScheduleTable',v).then(res=>{
                            if(res.data!=''){
                                me.initData();
                                me.dialogVisible = false;
                                me.$message({
                                    type: 'success',
                                    message: '新增数据成功！'
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
            this.initOptions();
            this.initData();
        }
    });
</script>
</html>
