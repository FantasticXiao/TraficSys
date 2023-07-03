<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>出车订单管理</title>
    <%@include file="../config.jsp"%>
</head>
<style>
    .el-input, .el-select, .el-date-editor{
        width:150px!important;
    }
</style>
<body>
<div id="app">
    <el-container>
        <el-header>
            <el-date-picker v-model="date" type="month" placeholder="选择年月"
                            value-format="yyyy-MM" @change="initTable"></el-date-picker>
            <el-input placeholder="负责司机" autocomplete="false" v-model="driver"
                      prefix-icon="el-icon-search" @change="search('driver')"></el-input>
            <el-input placeholder="车牌号" autocomplete="false" v-model="number"
                      prefix-icon="el-icon-search" @change="search('number')"></el-input>
            &nbsp;&nbsp;
            <el-button type="primary" icon="el-icon-refresh" @click="initTable">刷新</el-button>
        </el-header>
        <el-main style="padding-top: 0px">
            <el-table :data="tableData" height="440" border>
                <template slot="empty">
                    <p>{{dataText}}</p>
                </template>
                <el-table-column prop="carNumber" label="车牌号" width="100"></el-table-column>
                <el-table-column prop="driver" label="跟车司机"></el-table-column>
                <el-table-column prop="driverTel" label="联系方式" width="130"></el-table-column>
                <el-table-column prop="status" label="行程简述" width="130"></el-table-column>
                <el-table-column prop="startAddress" label="出发地"></el-table-column>
                <el-table-column prop="endAddress" label="目的地"></el-table-column>
                <el-table-column prop="startTime" label="出发时间" width="200"></el-table-column>
                <el-table-column prop="endTime" label="返车时间" width="200"></el-table-column>
                <el-table-column prop="passengerCapacity" label="座位数"></el-table-column>
                <el-table-column prop="travelAgency" label="对接旅行社"width="130"></el-table-column>
                <el-table-column prop="travelAgencyResponsibility" label="旅行社联系人"width="130"></el-table-column>
                <el-table-column prop="price" label="车价"></el-table-column>
                <el-table-column label="操作" width="170" fixed="right" >
                    <template slot-scope="scope">
                        <el-button @click="editFunc(scope.row)" type="text"><i class="el-icon-edit"></i>修改</el-button>
                        <el-button @click="editPriceFunc(scope.row)" type="text"><i class="el-icon-money"></i>费用管理</el-button>
                       <%-- <el-button @click="deleteFunc(scope.row)" type="text"><i class="el-icon-delete"></i>删除</el-button>--%>
                    </template>
                </el-table-column>
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
                driver:'',
                number:'',
                jsonData:[],
                tableData:[],
                dataText:'',
            };
        },
        methods: {
            initTable(){
                let me=this;
                console.log(me.date);
                axios({
                    type: 'post',
                    url: '../../demo/getCarScheduleTableList',
                    params: {date:me.date}
                }).then(res=>{
                    if(res.data!=''){
                        me.jsonData=me.tableData=res.data;
                    }
                });
            },
            search(type){
                this.searchDay=[];
                this.tableData.forEach(v=>{
                    if(v[type].indexOf(this[type])>-1) this.tableData.push(v);
                })
            },
            editFunc(item){
                let me=this;
              /*  me.dialogFormVisible = true;
                me.form=item;*/
            },
       /*     deleteFunc(item) {
                let me=this;
                me.$confirm('此操作将永久删除该记录, 是否继续?', '提示', {
                    confirmButtonText: '确定',
                    cancelButtonText: '取消',
                    type: 'warning'
                }).then(() => {
                    axios.post('../../demo/deleteCarScheduleTable',item).then(res=>{
                        me.$message({
                            type: 'success',
                            message: '删除成功!'
                        });
                        me.initTable();
                    },err=>{
                        alert("删除数据失败！");
                    });
                }).catch(() => {
                    me.$message({
                        type: 'info',
                        message: '已取消删除'
                    });
                });
            },*/
        },
        computed: {

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
