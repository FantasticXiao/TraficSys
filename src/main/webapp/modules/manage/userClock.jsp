<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>考勤管理</title>
    <%@include file="../config.jsp"%>
</head>
<style>
    .el-input, .el-select, .el-date-editor{
        width:150px!important;
    }
    .el-form-item__content .el-date-editor{
        width:360px!important;
    }
</style>
<body>
<div id="app">
    <el-container>
        <el-header>
            <el-date-picker v-model="date" type="month" placeholder="选择年月"
                            value-format="yyyy-MM" @change="initTable"></el-date-picker>
            <el-input placeholder="姓名" autocomplete="false" v-model="userName"
                      prefix-icon="el-icon-search" @change="search('userName')"></el-input>
            &nbsp;&nbsp;
            <el-button type="primary" icon="el-icon-refresh" @click="initTable">刷新</el-button>
        </el-header>
        <el-main style="padding-top: 0px">
            <el-table id="myElTable" :data="tableData" border v-loading="loading" :height="TableHeight">
                <el-table-column type="index" label="序号" width="80"></el-table-column>
                <el-table-column prop="userName" label="姓名"></el-table-column>
                <el-table-column prop="type" label="打卡类型"></el-table-column>
                <el-table-column prop="createTime" label="打卡时间"></el-table-column>
            </el-table>
        </el-main>
    </el-container>
</div>
</body>
<script>
    new Vue({
        el: '#app',
        data() {
            return {
                date:'',
                userName:'',
                jsonData:[],
                tableData:[],
                loading: false,
                dataText:'',
            };
        },
        methods: {
            initTable(){
                let me=this;
                me.loading=true;
                axios({
                    type: 'post',
                    url: '../../demo/getUserClockList',
                    params: {date:me.date}
                }).then(res=>{
                    me.jsonData=me.tableData=[];
                    me.loading=false;
                    if(res.data!=''){
                        me.jsonData=me.tableData=res.data;
                    }
                });
            },
            search(type){
                this.searchDay=[];
                this.tableData=[];
                this.jsonData.forEach(v=>{
                    if(v[type].indexOf(this[type])>-1) this.tableData.push(v);
                })
            },
        },
        computed: {
        },
        created() {
            //动态计算表格高度
            let windowHeight = document.documentElement.clientHeight || document.bodyclientHeight;
            this.TableHeight = windowHeight - 100;
        },
        mounted() {
            let me=this;
            me.$nextTick(function () {
                me.date=getNowMonth();
                me.initTable();
            });
        }
    });
</script>
</html>
