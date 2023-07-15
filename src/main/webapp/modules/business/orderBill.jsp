<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>出车流水账</title>
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
            <el-input placeholder="车牌号" autocomplete="false" v-model="carNumber"
                      prefix-icon="el-icon-search" @change="search('carNumber')"></el-input>
            &nbsp;&nbsp;
            <el-button type="primary" icon="el-icon-refresh" @click="initTable">刷新</el-button>
            <el-button type="success" icon="el-icon-printer" @click="exportFunc">导出</el-button>
        </el-header>
        <el-main style="padding-top: 0px">
            <el-table id="myElTable" :data="tableData" border v-loading="loading" :height="TableHeight">
                <el-table-column type="index" label="序号" width="80"></el-table-column>
                <el-table-column prop="orderName" label="团号" width="100"></el-table-column>
                <el-table-column prop="detail" label="行程" width="250"></el-table-column>
                <el-table-column prop="carNumber" label="车牌号" width="100"></el-table-column>
                <el-table-column prop="travelAgency" label="对接旅行社" width="130"></el-table-column>
                <el-table-column prop="price" label="收进车价" width="120"></el-table-column>
                <el-table-column prop="price2" label="付出车价" width="120"></el-table-column>
                <el-table-column prop="kilometerFees" label="公里数"></el-table-column>
                <el-table-column prop="roadFees" label="路桥费"></el-table-column>
                <el-table-column prop="parkingFees" label="停车费"></el-table-column>
                <el-table-column prop="hotelFees" label="住宿费"></el-table-column>
                <el-table-column prop="foodFees" label="餐费"></el-table-column>
                <el-table-column prop="waterFees" label="水费"></el-table-column>
                <el-table-column prop="otherFees" label="杂费"></el-table-column>
                <el-table-column prop="cost" label="成本"></el-table-column>
                <el-table-column prop="profit" label="利润"></el-table-column>
            </el-table>
        </el-main>
    </el-container>
    <table style="display:none;" id="myTable"></table>
</div>
</body>
<script>
    new Vue({
        el: '#app',
        data() {
            return {
                date:'',
                driver:'',
                carNumber:'',
                status:'',
                jsonData:[],
                tableData:[],
                loading: false,
                dataText:'',
                cars:[],
                carOptions:[],
                driverOptions:[],
            };
        },
        methods: {
            initTable(){
                let me=this;
                me.loading=true;
                axios({
                    type: 'post',
                    url: '../../demo/getCarScheduleTableList',
                    params: {date:me.date}
                }).then(res=>{
                    me.jsonData=me.tableData=[];
                    me.loading=false;
                    if(res.data!=''){
                        let data=[];
                        res.data.forEach(v=>{
                            if(v.accountingFlag!=null && v.accountingFlag==1){
                                v.detail=v.startTime+"-"+v.endTime+","+v.passengerCapacity+"座,"
                                    +v.startAddress+"-"+v.endAddress+",联系人："+v.travelAgencyResponsibility;
                                v.cost=v.roadFees+v.parkingFees+v.hotelFees+v.foodFees+v.waterFees+v.otherFees;
                                v.profit=v.price2-v.cost;
                                data.push(v);
                            }
                        });
                        me.jsonData=me.tableData=data;
                    }
                });
            },
            initOptions(){
                let me=this;
                axios.get('../../demo/getTrafficInfoList').then(res=>{
                    if(res.data!=''){
                        me.cars=me.carOptions=res.data;
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
                this.tableData=[];
                this.jsonData.forEach(v=>{
                    if(v[type].indexOf(this[type])>-1) this.tableData.push(v);
                })
            },
            exportFunc(){
                let me=this;
                var myName =me.date+"出车流水账.xlsx";
                var xlsxParam = { raw: true }; //数据不转换格式
                //获取el-table时得到的是一个DIV，导致方法调用失败，中间处理一下，新建一个table即可实现该功能 Unsupported origin when DIV is not a TABLE
                let thead=document.querySelector("thead");
                let tbody=document.querySelector("tbody");
                document.querySelector("#myTable").appendChild(thead);
                document.querySelector("#myTable").appendChild(tbody);

                var sel = XLSX.utils.table_to_book(document.querySelector("#myTable"), xlsxParam);
                var selIn = XLSX.write(sel, { bookType: 'xlsx', bookSST: true, type: 'array' });
                try {
                    saveAs(new Blob([selIn], { type: 'application/octet-stream' }), myName)
                } catch (e) {
                    if (typeof console !== 'undefined') console.log(e, selIn)
                }

                document.querySelector(".el-table__header").appendChild(thead);
                document.querySelector(".el-table__body").appendChild(tbody);
                return selIn
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
                me.initOptions();
            });
        }
    });
</script>
</html>
