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
            width:200px!important;
        }
    </style>
</head>
<body>
<div id="app">
    <el-header>
    <el-row :gutter="15">
        <el-col :span="5">
            <el-input placeholder="出车师傅" autocomplete="false" v-model="driver" prefix-icon="el-icon-search" @change="search('driver')"></el-input>
        </el-col>
        <el-col :span="4">
            <el-input placeholder="车牌号" autocomplete="false" v-model="number" prefix-icon="el-icon-search" @change="search('number')"></el-input>
        </el-col>
        <el-col :span="5">
            <el-input placeholder="手机号码" autocomplete="false" v-model="tel" prefix-icon="el-icon-search" @change="search('tel')"></el-input>
        </el-col>
        <el-col :span="2">
            <el-button type="primary" icon="el-icon-plus" @click="dialogVisible= true ">新增排班</el-button>
        </el-col>
    </el-row>
    </el-header>
    <el-calendar>
        <!-- 这里使用的是 2.5 slot 语法，对于新项目请使用 2.6 slot 语法-->
        <template slot="dateCell" slot-scope="{date, data}" >
            <el-badge :is-dot="intDOT(data)" class="item" >
                <p :class="data.isSelected ? 'is-selected' : ''" >
                    {{ data.day.split('-').slice(2).join('-') }}
                    {{ data.isSelected ? chooseDay(data) : ''}}
                </p>
            </el-badge>
                <div>
                    <template v-for="item in initDIV(data)">
                        <el-tag>{{ item.driver }}</el-tag>
                    </template>
                </div>
        </template>
    </el-calendar>

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
                <el-date-picker type="date" placeholder="选择日期" v-model="form.startTime" style="width: 100%;"></el-date-picker>
            </el-form-item>
            <el-form-item label="结束时间" :label-width="formLabelWidth" prop="endTime">
                <el-date-picker type="date" placeholder="选择日期" v-model="form.endTime" style="width: 100%;"></el-date-picker>
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
</div>
</body>
<script>
    new Vue({
        el: '#app',
        data() {
            return {
                selectDay:new Date(),
                searchDay:[],
                driver:'',
                number:'',
                tel:'',
                jsonData:[
                    {day:'2023-06-05',children: [
                        {driver:'张三',number:'浙AXXXXX',tel:'11111111111'},
                        {driver:'王五',number:'浙AXXXXX',tel:'11111111111'},
                        {driver:'李四',number:'浙AXXXXX',tel:'11111111111'},
                    ]},
                    {day:'2023-06-06',children: [
                        {driver:'张三',number:'浙AXXXXX',tel:'11111111111'},
                        {driver:'王五',number:'浙AXXXXX',tel:'11111111111'},
                    ]},
                    {day:'2023-06-07',children: [
                        {driver:'王五',number:'浙AXXXXX',tel:'11111111111'},
                        {driver:'李四',number:'浙AXXXXX',tel:'11111111111'},
                    ]},
                    {day:'2023-06-09',children: [
                        {driver:'李四',number:'浙AXXXXX',tel:'11111111111'},
                    ]},
                ],
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
            };
        },
        methods: {
            chooseDay(item){
                let me=this;
                me.selectDay=item.day;
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
                        if(this[type]==t[type]) this.searchDay.push(v.day);

                    })
                })
            },
            addFunc(){
                let me=this;
            },
        },
        computed: {

        },
        mounted() {
            this.initOptions();
        }
    });
</script>
</html>
