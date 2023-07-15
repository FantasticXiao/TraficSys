<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>驾驶员端口/旅行社端口</title>
    <%@include file="../config.jsp"%>
    <style>
        .button-item-group{
            position: absolute;
            right: 35%;
        }
    </style>
</head>
<body>
<div id="app">
    <el-container>
        <el-header>
            <el-select v-model="orderName" filterable @change="search">
                <el-option v-for="item in orderNameOptions" :label="item.orderName" :value="item.orderName" :key="item.orderName"></el-option>
            </el-select>
        </el-header>
        <el-main style="padding-top: 0px">
            <el-descriptions class="margin-top" title="驾驶员端口/旅行社端口" border>
                <el-descriptions-item>
                    <template slot="label"><i class="el-icon"></i>用车单位</template>
                    {{orderInfo.travelAgency}}
                </el-descriptions-item>
                <el-descriptions-item>
                    <template slot="label"><i class="el-icon"></i>订车负责人</template>
                    {{orderInfo.travelAgencyResponsibility}}
                </el-descriptions-item>
                <el-descriptions-item>
                    <template slot="label"><i class="el-icon"></i>团号</template>
                    {{orderInfo.orderName}}
                </el-descriptions-item>
                <el-descriptions-item>
                    <template slot="label"><i class="el-icon"></i>车牌号</template>
                    {{orderInfo.carNumber}}
                </el-descriptions-item>
                <el-descriptions-item>
                    <template slot="label"><i class="el-icon"></i>订单负责人</template>
                    {{orderInfo.orderResponse}}
                </el-descriptions-item>
                <el-descriptions-item>
                    <template slot="label"><i class="el-icon"></i>跟车司机</template>
                    {{orderInfo.driver}}
                </el-descriptions-item>
                <el-descriptions-item>
                    <template slot="label"><i class="el-icon"></i>用车时间</template>
                    {{orderInfo.time}}
                </el-descriptions-item>
                <el-descriptions-item>
                    <template slot="label"><i class="el-icon"></i>领队/导游</template>
                    {{orderInfo.travelAgencyResponsibility}}
                </el-descriptions-item>
                <el-descriptions-item>
                    <template slot="label"><i class="el-icon"></i>用车概述</template>
                    {{orderInfo.description}}
                </el-descriptions-item>
                <el-descriptions-item>
                    <template slot="label"><i class="el-icon"></i>详细行程</template>
                    {{orderInfo.detail}}
                </el-descriptions-item>
            </el-descriptions>
            <el-divider><i class="el-icon-edit"></i>驾驶员/旅行社填写（附件只能上传jpg/png文件，且不超过500kb）</el-divider>
            <el-form v-if="formVisible" :model="form"  ref="roleForm" :rules="rules" :inline="true" class="demo-form-inline" :disabled="formDisabled">
                <el-form-item label="公务结算单" :label-width="formLabelWidth" prop="officialSettlementForm">
                    <el-select v-model="form.officialSettlementForm" filterable placeholder="公务结算单" >
                        <el-option label="是" value="是"></el-option>
                        <el-option label="否" value="否"></el-option>
                    </el-select>
                </el-form-item>
                <el-form-item prop="officialSettlementFormFile">
                    <el-upload
                            class="upload-demo"
                            action="../../demo/upload"
                            multiple
                            :limit="1">
                        <el-button type="info" plain><i class="el-icon-upload"></i>上传附件</el-button>
                    </el-upload>
                </el-form-item>

                <el-form-item label="公里数" :label-width="formLabelWidth" prop="kilometerFees">
                    <el-input v-model.number="form.kilometerFees" autocomplete="off" placeholder="公里数" ></el-input>
                </el-form-item>
                <el-form-item label="路桥费" :label-width="formLabelWidth" prop="roadFees">
                    <el-input v-model.number="form.roadFees" autocomplete="off" placeholder="路桥费" ></el-input>
                </el-form-item>
                <el-form-item label="停车费" :label-width="formLabelWidth" prop="parkingFees">
                    <el-input v-model.number="form.parkingFees" autocomplete="off" placeholder="停车费" ></el-input>
                </el-form-item>
                <el-form-item label="住宿费" :label-width="formLabelWidth" prop="hotelFees">
                    <el-input v-model.number="form.hotelFees" autocomplete="off" placeholder="住宿费" ></el-input>
                </el-form-item>
                <el-form-item label="餐费" :label-width="formLabelWidth" prop="foodFees">
                    <el-input v-model.number="form.foodFees" autocomplete="off" placeholder="餐费" ></el-input>
                </el-form-item>
                <el-form-item label="水费" :label-width="formLabelWidth" prop="waterFees">
                    <el-input v-model.number="form.waterFees" autocomplete="off" placeholder="水费" ></el-input>
                </el-form-item>
                <el-form-item label="杂费" :label-width="formLabelWidth" prop="otherFees">
                    <el-input v-model.number="form.otherFees" autocomplete="off" placeholder="杂费" ></el-input>
                </el-form-item>
                <el-form-item label="付出车价" :label-width="formLabelWidth" prop="price2">
                    <el-input v-model.number="form.price2" autocomplete="off" placeholder="付出车价" ></el-input>
                </el-form-item>

                <br/>
                <el-form-item class="button-item-group" v-if="!formDisabled">
                    <el-button type="primary" @click="submitForm('roleForm')">暂存</el-button>
                    <el-button type="primary" @click="submitForm2('roleForm')">上报</el-button>
                    <el-button @click="resetForm('roleForm')">重置</el-button>
                </el-form-item>
            </el-form>
        </el-main>
    </el-container>

<%--   officialSettlementForm;
   officialSettlementFormFile;
   kilometerFees;
   kilometerFeesFile;
   roadFees;
   roadFeesFile;
   parkingFees;
   parkingFeesFile;
   hotelFees;
   hotelFeesFile;
   foodFees;
   foodFeesFile;
   waterFees;
   waterFeesFile;
   otherFees;
   otherFeesFile;
   price2;--%>
</div>
</body>
<script>
    new Vue({
        el: '#app',
        data() {
            return {
                orderName:'',
                orderNameOptions:null,
                orderInfo:{},
                formVisible:false,
                formDisabled:false,
                form: {
                    "officialSettlementForm": 0,"kilometerFees":0,"roadFees":0,"parkingFees":0,"hotelFees":0,
                    "foodFees":0,"waterFees":0,"otherFees":0,"price2":0,
                },
                rules: {
                    officialSettlementForm: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    kilometerFees: [{ required: true, message: '不能为空'}, { type: 'number', message: '必须为数字值'}],
                    roadFees: [{ required: true, message: '不能为空'}, { type: 'number', message: '必须为数字值'}],
                    parkingFees: [{ required: true, message: '不能为空'}, { type: 'number', message: '必须为数字值'}],
                    hotelFees: [{ required: true, message: '不能为空'}, { type: 'number', message: '必须为数字值'}],
                    foodFees: [{ required: true, message: '不能为空'}, { type: 'number', message: '必须为数字值'}],
                    waterFees: [{ required: true, message: '不能为空'}, { type: 'number', message: '必须为数字值'}],
                    otherFees: [{ required: true, message: '不能为空'}, { type: 'number', message: '必须为数字值'}],
                    price2: [{ required: true, message: '不能为空'}, { type: 'number', message: '必须为数字值'}],
                 },
                formLabelWidth: '120px',
                fileList:[],
            };
        },
        methods: {
            initOptions(){
                let me=this;
                axios.get('../../demo/getOrderNameList').then(res=>{
                    if(res.data!=''){
                        me.orderNameOptions=res.data;
                    }
                });
            },
            search(){
                let me=this;
                axios({
                    type: 'post',
                    url: '../../demo/getCarScheduleByOrderNumber',
                    params: {orderName:me.orderName}
                }).then(res=>{
                    if(res.data!=''){
                        let item=me.orderInfo=res.data[0];
                        item.time=item.startTime.substring(0,13)+"至"+item.endTime.substring(0,13);
                        item.detail=item.time+"，"+item.passengerCapacity+"座，"
                            +item.startAddress+"-"+item.endAddress+"，联系人："+item.travelAgencyResponsibility;
                        item.resDriver=item.resDriver+item.resDriverTel;
                        item.driver=item.driver+item.driverTel;
                        me.formVisible=true;
                        me.resetForm('roleForm');
                        me.form=item;
                        if(item.accountingFlag==null){
                            me.formDisabled=false;
                            me.resetForm('roleForm');
                        }else{
                            me.formDisabled=true;
                        }
                    }
                });
            },
            submitForm(formName) {
                let me=this;
                me.$refs[formName].validate((valid) => {
                    if (valid) {
                        axios.post('../../demo/editCarScheduleTable',me.form).then(res=>{
                            if(res.data!=''){
                                me.orderName='';
                                me.orderInfo={};
                                me.$refs[formName].resetFields();
                                me.formVisible=false;
                                me.$message({
                                    type: 'success',
                                    message: '暂存成功！'
                                });
                            }
                        },err=>{
                            alert("暂存失败！");
                        });
                    } else {
                        console.log('error submit!!');
                        return false;
                    }
                });
            },
            submitForm2(formName) {
                let me=this;
                me.$refs[formName].validate((valid) => {
                    if (valid) {
                        me.form.accountingFlag=0;
                        axios.post('../../demo/editCarScheduleTable',me.form).then(res=>{
                            if(res.data!=''){
                                me.orderName='';
                                me.orderInfo={};
                                me.$refs[formName].resetFields();
                                me.formVisible=false;
                                me.$message({
                                    type: 'success',
                                    message: '上报金额成功！'
                                });
                            }
                        },err=>{
                            alert("上报金额失败！");
                        });
                    } else {
                        console.log('error submit!!');
                        return false;
                    }
                });
            },
            resetForm(formName) {
                if(this.$refs[formName]!=undefined) this.$refs[formName].resetFields();
            }
        },
        computed: {

        },
        mounted() {
            this.initOptions();
        }
    });
</script>
</html>
