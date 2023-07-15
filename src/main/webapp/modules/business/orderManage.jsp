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
            <el-input placeholder="驾驶员" autocomplete="false" v-model="driver"
                      prefix-icon="el-icon-search" @change="search('driver')"></el-input>
            <el-input placeholder="车牌号" autocomplete="false" v-model="carNumber"
                      prefix-icon="el-icon-search" @change="search('carNumber')"></el-input>
            <el-select v-model="status" filterable @change="search('status')">
                <el-option label="所有状态" value="" selected></el-option>
                <el-option label="未收款" value="未收款"></el-option>
                <el-option label="已收款" value="已收款"></el-option>
            </el-select>
            &nbsp;&nbsp;
            <el-button type="primary" icon="el-icon-refresh" @click="initTable">刷新</el-button>
        </el-header>
        <el-main style="padding-top: 0px">
            <el-table :data="tableData" border v-loading="loading" :height="TableHeight">
                <template slot="empty">
                    <p>{{dataText}}</p>
                </template>
                <el-table-column type="index" label="序号" width="80"></el-table-column>
                <el-table-column prop="orderName" label="团号" width="100"></el-table-column>
                <el-table-column prop="carNumber" label="车牌号" width="100"></el-table-column>
                <el-table-column prop="driver" label="驾驶员"></el-table-column>
                <el-table-column prop="driverTel" label="联系方式" width="130"></el-table-column>
                <el-table-column prop="description" label="行程简述" width="130"></el-table-column>
                <el-table-column prop="startAddress" label="出发地"></el-table-column>
                <el-table-column prop="endAddress" label="目的地"></el-table-column>
                <el-table-column prop="startTime" label="出发时间" width="200"></el-table-column>
                <el-table-column prop="endTime" label="返车时间" width="200"></el-table-column>
                <el-table-column prop="passengerCapacity" label="座位数"></el-table-column>
                <el-table-column prop="travelAgency" label="对接旅行社"width="130"></el-table-column>
                <el-table-column prop="travelAgencyResponsibility" label="旅行社联系人"width="130"></el-table-column>
                <el-table-column prop="price" label="车价"></el-table-column>
                <el-table-column label="操作" width="140" fixed="right" >
                    <template slot-scope="scope">
                        <el-button v-if="scope.row.showOpr" @click="editFunc(scope.row,'出车安排修改')" type="text"><i class="el-icon-edit"></i>修改</el-button>
                        <el-button v-if="scope.row.showOpr" @click="editFunc(scope.row,'费用管理')" type="text"><i class="el-icon-money"></i>管理</el-button>
                        <el-button v-if="!scope.row.showOpr" @click="goBack(scope.row)" type="text"><i class="el-icon-money"></i>回退</el-button>
                       <%-- <el-button @click="deleteFunc(scope.row)" type="text"><i class="el-icon-delete"></i>删除</el-button>--%>
                    </template>
                </el-table-column>
            </el-table>
        </el-main>
    </el-container>

    <el-dialog :title="title" :visible.sync="dialogVisible">
    <el-form :model="form"  ref="roleForm" :rules="rules" :inline="true" class="demo-form-inline" >
        <el-form-item v-if="!payVisible" label="行程简述" :label-width="formLabelWidth" prop="description">
            <el-input  v-model="form.description" autocomplete="off" placeholder="行程简述" :disabled="true"></el-input>
        </el-form-item>
        <el-form-item v-if="!payVisible" label="团号" :label-width="formLabelWidth" prop="orderName">
            <el-input  v-model="form.orderName" autocomplete="off" placeholder="团号" :disabled="true"></el-input>
        </el-form-item>
        <el-form-item label="详细描述" :label-width="formLabelWidth" prop="detail">
            <el-input type="textarea" v-model="form.detail" style="width: 435px;" :disabled="true"></el-input>
        </el-form-item>
        <el-form-item v-if="!payVisible" label="车牌号" :label-width="formLabelWidth" prop="carNumber">
            <el-select v-model="form.carNumber" filterable placeholder="车牌号" @change="getResDriver">
                <el-option v-for="item in carOptions" :key="item.carNumber" :label="item.carNumber" :value="item.carNumber"></el-option>
            </el-select>
        </el-form-item>
        <el-form-item v-if="!payVisible" :label-width="formLabelWidth" label="出车时间" required>
            <el-date-picker
                    v-model="form.time"
                    type="datetimerange"   @change="editJudgeFunc"
                    align="right"  value-format="yyyy-MM-dd HH:mm:ss"
                    start-placeholder="出发时间"
                    end-placeholder="返车时间"
                    :default-time="['08:00:00', '17:00:00']">
            </el-date-picker>
        </el-form-item>
        <el-form-item v-if="!payVisible" label="负责司机" :label-width="formLabelWidth" prop="resDriver">
            <el-input v-model="form.resDriver" :disabled="true"></el-input>
        </el-form-item>
        <el-form-item v-if="!payVisible" label="座位数" :label-width="formLabelWidth" prop="passengerCapacity">
            <el-input v-model="form.passengerCapacity" :disabled="true"></el-input>
        </el-form-item>
        <el-form-item v-if="!payVisible" label="车辆供应商" :label-width="formLabelWidth" prop="carSupply">
            <el-select v-model="form.carSupply" filterable placeholder="车辆供应商" >
                <el-option label="公营" value="公营"></el-option>
                <el-option label="外调" value="外调"></el-option>
            </el-select>
        </el-form-item>
        <el-form-item v-if="!payVisible" label="跟车司机" :label-width="formLabelWidth" prop="driver">
            <el-select v-model="form.driver" filterable placeholder="跟车司机">
                <el-option v-for="item in driverOptions" :key="item.name" :label="item.name" :value="item.name"></el-option>
            </el-select>
        </el-form-item>
        <el-form-item v-if="payVisible" label="收款状态" :label-width="formLabelWidth" prop="status">
            <el-select v-model="form.status" filterable placeholder="收款状态" >
                <el-option label="未收款" value="未收款"></el-option>
                <el-option label="已收款" value="已收款"></el-option>
            </el-select>
        </el-form-item>
        <el-form-item v-if="payVisible" label="支付方式" :label-width="formLabelWidth" prop="payWay">
            <el-select v-model="form.payWay" filterable placeholder="支付方式" >
                <el-option label="挂账" value="挂账"></el-option>
                <el-option label="现收" value="挂账"></el-option>
                <el-option label="现付" value="挂账"></el-option>
            </el-select>
        </el-form-item>
        <el-form-item v-if="payVisible" label="公务结算单" :label-width="formLabelWidth" prop="officialSettlementForm">
            <el-select v-model="form.officialSettlementForm" filterable placeholder="公务结算单" >
                <el-option label="是" value="是"></el-option>
                <el-option label="否" value="否"></el-option>
            </el-select>
        </el-form-item>
        <el-form-item v-if="payVisible" label="公里数" :label-width="formLabelWidth" prop="kilometerFees">
            <el-input v-model.number="form.kilometerFees" autocomplete="off" placeholder="公里数" ></el-input>
        </el-form-item>
        <el-form-item v-if="payVisible" label="路桥费" :label-width="formLabelWidth" prop="roadFees">
            <el-input v-model.number="form.roadFees" autocomplete="off" placeholder="路桥费" ></el-input>
        </el-form-item>
        <el-form-item v-if="payVisible" label="停车费" :label-width="formLabelWidth" prop="parkingFees">
            <el-input v-model.number="form.parkingFees" autocomplete="off" placeholder="停车费" ></el-input>
        </el-form-item>
        <el-form-item v-if="payVisible" label="住宿费" :label-width="formLabelWidth" prop="hotelFees">
            <el-input v-model.number="form.hotelFees" autocomplete="off" placeholder="住宿费" ></el-input>
        </el-form-item>
        <el-form-item v-if="payVisible" label="餐费" :label-width="formLabelWidth" prop="foodFees">
            <el-input v-model.number="form.foodFees" autocomplete="off" placeholder="餐费" ></el-input>
        </el-form-item>
        <el-form-item v-if="payVisible" label="水费" :label-width="formLabelWidth" prop="waterFees">
            <el-input v-model.number="form.waterFees" autocomplete="off" placeholder="水费" ></el-input>
        </el-form-item>
        <el-form-item v-if="payVisible" label="杂费" :label-width="formLabelWidth" prop="otherFees">
            <el-input v-model.number="form.otherFees" autocomplete="off" placeholder="杂费" ></el-input>
        </el-form-item>
        <el-form-item v-if="payVisible" label="付出车价" :label-width="formLabelWidth" prop="price2">
            <el-input v-model.number="form.price2" autocomplete="off" placeholder="付出车价" ></el-input>
        </el-form-item>
        <el-form-item v-if="payVisible" label="是否入账" :label-width="formLabelWidth" prop="accountingFlag">
            <el-select v-model="form.accountingFlag" filterable placeholder="是否入账" >
                <el-option label="是" :value='1' ></el-option>
                <el-option label="否" :value='0' ></el-option>
            </el-select>
        </el-form-item>
    </el-form>
        <div slot="footer" class="dialog-footer">
            <el-button @click="dialogVisible = false; payVisible= false;">取 消</el-button>
            <el-button type="primary" @click="editSubmitFunc">确 定</el-button>
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
                carNumber:'',
                status:'',
                jsonData:[],
                tableData:[],
                loading: false,
                dataText:'',
                dialogVisible:false,
                payVisible:false,
                title:'',
                form: { "carNumber": null, "description": null, "carSupply":null,
                     "price": null, "driver": null, "driverTel": null,"orderName":null,
                    "orderResponse":null,"time":[],
                },
                rules: {
                    carSupply: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    carNumber: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    time: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    price: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    description: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    driver: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    orderResponse: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    orderName: [{ required: true, message: '不能为空', trigger: 'blur' },],
                },
                formLabelWidth: '120px',
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
                    me.loading=false;
                    me.jsonData=me.tableData=[];
                    if(res.data!=''){
                        res.data.forEach(v=>{
                            if(v.accountingFlag==null || v.accountingFlag==0){
                                v.showOpr=true;
                            }else{
                                v.showOpr=false;
                            }
                        });
                        me.jsonData=me.tableData=res.data;
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
            search(type){
                this.searchDay=[];
                this.tableData=[];
                this.jsonData.forEach(v=>{
                    if(v[type].indexOf(this[type])>-1) this.tableData.push(v);
                })
            },
            editFunc(item,type){
                let me=this;
                me.dialogVisible = true;
                me.payVisible=false;
                me.form=item;
                item.detail=item.startTime+"-"+item.endTime+","+item.passengerCapacity+"座,"
                    +item.startAddress+"-"+item.endAddress+",联系人："+item.travelAgencyResponsibility;
                me.title=type;
                me.$set(item, "time", [item.startTime,item.endTime]);
                if(type=="出车安排修改"){
                    axios.post('../../demo/judgeIfEmpty',{carNumber:"",startTime:item.startTime,endTime:item.endTime,id:0}).then(res=> {
                        if(res.data!='' && res.data.length>0) {
                            me.carOptions = [];
                            for(let i=0;i<me.cars.length;i++){
                                let flag=0;
                                for(let j=0;j<res.data.length;j++){
                                    if(me.cars[i].carNumber==res.data[j].carNumber && res.data[j].carNumber!=item.carNumber){
                                        flag=1;break;
                                    }
                                }
                                if(flag==0) me.carOptions.push(me.cars[i]);
                            }
                        }
                    });
                }else{
                    me.payVisible=true;
                }
            },
            editJudgeFunc(){
                let v=this.form;
                if(v.carNumber!=null && v.time!=null){
                    axios.post('../../demo/judgeIfEmpty',{carNumber:v.carNumber,startTime:v.time[0],endTime:v.time[1],id:v.id}).then(res=> {
                        if(res.data!='' && res.data.length>0){
                            alert("该时段车辆"+v.carNumber+"已有出车安排，请重新规划调配！");
                            v.time=null;
                        }
                    });
                }
            },
            editSubmitFunc(){
                let me=this;
                let item=me.form;
                me.payVisible=false;
                item.startTime=item.time[0];
                item.endTime=item.time[1];
                axios.post('../../demo/editCarScheduleTable',item).then(res=>{
                    if(res.data!=''){
                        me.dialogVisible = false;
                        me.initTable();
                        me.$message({
                            type: 'success',
                            message: '编辑数据成功！'
                        });
                    }
                },err=>{
                    alert("编辑数据失败！");
                });
            },
            goBack(item){
                let me=this;
                item.accountingFlag=0;
                axios.post('../../demo/editCarScheduleTable',item).then(res=>{
                    if(res.data!=''){
                        me.initTable();
                        me.$message({
                            type: 'success',
                            message: '回退成功！'
                        });
                    }
                },err=>{
                    alert("回退失败！");
                });
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
