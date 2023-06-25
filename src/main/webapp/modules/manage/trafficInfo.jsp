<%@ page  contentType="text/html;charset=UTF-8" import="java.util.*" %>
<html style="overflow: hidden">
<head>
    <title></title>
    <%@include file="../config.jsp"%>
    <style>
        .el-input, .el-select, .el-date-editor{
            width:200px!important;
        }
    </style>
</head>
<body>
<div id="app">
    <el-container>
        <el-header>
                <el-input placeholder="车牌号查询" autocomplete="false" v-model="input" prefix-icon="el-icon-search" @change="search"></el-input>
                &nbsp;&nbsp;&nbsp;
                <el-button type="primary" icon="el-icon-plus" @click="addFunc">增加</el-button>

            </el-row>
        </el-header>
        <el-main style="padding-top: 0px">
            <el-table :data="tableData" height="440" border>
                <template slot="empty">
                    <p>{{dataText}}</p>
                </template>
                <el-table-column prop="carNumber" label="车牌号"></el-table-column>
                <el-table-column prop="brand" label="车辆品牌"></el-table-column>
                <el-table-column prop="model" label="车型"></el-table-column>
                <el-table-column prop="color" label="车身颜色"></el-table-column>
                <el-table-column prop="passengerCapacity" label="载客数"></el-table-column>
                <el-table-column prop="carType" label="车辆型号"></el-table-column>
                <el-table-column prop="buyDate" label="购入年份"></el-table-column>
                <el-table-column label="操作" width="150">
                    <template slot-scope="scope">
                        <el-button @click="editFunc(scope.row)" type="text"><i class="el-icon-edit"></i>编辑</el-button>
                        <el-button @click="deleteFunc(scope.row)" type="text"><i class="el-icon-delete"></i>删除</el-button>
                    </template>
                </el-table-column>
            </el-table>
        </el-main>
    </el-container>

    <el-dialog :title="flag=='add' ? '增加车辆' :'编辑车辆'" :visible.sync="dialogFormVisible">
        <el-form :model="form" ref="roleForm" :rules="rules" :inline="true" class="demo-form-inline">
            <el-form-item label="负责司机" :label-width="formLabelWidth" prop="driverId">
            <el-select v-model="form.driverId" filterable placeholder="负责司机">
                <el-option v-for="item in driverOptions" :key="item.id" :label="item.name" :value="item.id"></el-option>
            </el-select>
            </el-form-item>
            <el-form-item label="车辆品牌" :label-width="formLabelWidth" prop="brand">
                <el-select v-model="form.brand" placeholder="车辆品牌" >
                    <el-option v-for="item in brandOptions" :label="item.attrDescription" :value="item.attrDescription" :key="item.attrDescription"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="车型" :label-width="formLabelWidth" prop="model">
                <el-select v-model="form.model" placeholder="车型" >
                    <el-option v-for="item in modelOptions" :label="item.attrDescription" :value="item.attrDescription" :key="item.attrDescription"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="车身颜色" :label-width="formLabelWidth" prop="color">
                <el-select v-model="form.color" placeholder="车身颜色" >
                    <el-option v-for="item in colorOptions" :label="item.attrDescription" :value="item.attrDescription" :key="item.attrDescription"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="载客数" :label-width="formLabelWidth" prop="passengerCapacity">
                <el-input v-model="form.passengerCapacity" autocomplete="off" placeholder="载客数"></el-input>
            </el-form-item>
            <el-form-item label="车辆型号" :label-width="formLabelWidth" prop="carType">
                <el-input v-model="form.carType" autocomplete="off" placeholder="车辆型号"></el-input>
            </el-form-item>
            <el-form-item label="购入年份" :label-width="formLabelWidth" prop="buyDate">
                <el-date-picker type="date" placeholder="选择日期" v-model="form.buyDate" value-format="yyyy-MM-dd"></el-date-picker>
            </el-form-item>
            <el-form-item label="里程数" :label-width="formLabelWidth" prop="mileage">
                <el-input v-model="form.mileage" autocomplete="off" placeholder="里程数"></el-input>
            </el-form-item>
            <el-form-item label="车牌号" :label-width="formLabelWidth" prop="carNumber">
                <el-input v-model="form.carNumber" autocomplete="off" placeholder="车牌号" :disabled="inputDisable"></el-input>
            </el-form-item>
            <el-form-item label="车辆经营范围" :label-width="formLabelWidth" prop="businessScope">
                <el-input v-model="form.businessScope" autocomplete="off" placeholder="车辆经营范围"></el-input>
            </el-form-item>
            <el-form-item label="运营证号" :label-width="formLabelWidth" prop="operateNumber">
                <el-input v-model="form.operateNumber" autocomplete="off" placeholder="运营证号"></el-input>
            </el-form-item>
            <el-form-item label="标志牌" :label-width="formLabelWidth" prop="sign">
                <el-input v-model="form.sign" autocomplete="off" placeholder="标志牌"></el-input>
            </el-form-item>
            <el-form-item label="客车等级" :label-width="formLabelWidth" prop="trafficLevel">
                <el-input v-model="form.trafficLevel" autocomplete="off" placeholder="客车等级"></el-input>
            </el-form-item>
            <el-form-item label="车主" :label-width="formLabelWidth" prop="trafficOwner">
                <el-input v-model="form.trafficOwner" autocomplete="off" placeholder="车主"></el-input>
            </el-form-item>
            <el-form-item label="车主电话" :label-width="formLabelWidth" prop="ownerTel">
                <el-input v-model="form.ownerTel" autocomplete="off" placeholder="车主电话"></el-input>
            </el-form-item>
            <el-form-item label="行驶证年检有效期" :label-width="formLabelWidth" prop="drivingLicense">
                <el-date-picker type="date" placeholder="选择日期" v-model="form.drivingLicense" value-format="yyyy-MM-dd"></el-date-picker>
            </el-form-item>
            <el-form-item label="营运证年检有效期" :label-width="formLabelWidth" prop="tradingLicense">
                <el-date-picker type="date" placeholder="选择日期" v-model="form.tradingLicense" value-format="yyyy-MM-dd"></el-date-picker>
            </el-form-item>
            <el-form-item label="营运代理证换证期限" :label-width="formLabelWidth" prop="operatingLicense">
                <el-date-picker type="date" placeholder="选择日期" v-model="form.operatingLicense" value-format="yyyy-MM-dd"></el-date-picker>
            </el-form-item>
            <el-form-item label="核准经营期限" :label-width="formLabelWidth" prop="approvalLicense">
                <el-date-picker type="date" placeholder="选择日期" v-model="form.approvalLicense" value-format="yyyy-MM-dd"></el-date-picker>
            </el-form-item>
            <el-form-item label="车评年检有效期" :label-width="formLabelWidth" prop="evaluationLicense">
                <el-date-picker type="date" placeholder="选择日期" v-model="form.evaluationLicense" value-format="yyyy-MM-dd"></el-date-picker>
            </el-form-item>
            <el-form-item label="备注" :label-width="formLabelWidth">
                <el-input v-model="form.remark" type="textarea" :rows="3" ></el-input>
            </el-form-item>
        </el-form>
        <div slot="footer" class="dialog-footer">
            <el-button @click="dialogFormVisible = false">取 消</el-button>
            <el-button type="primary" @click="submitFunc">确 定</el-button>
        </div>
    </el-dialog>
</div>
</body>
<script>
    new Vue({
        el: '#app',
        data() {
            return {
                flag:'add',
                jsonData:[],
                tableData:[],
                dataText:'',
                input:'',
                dialogFormVisible: false,
                inputDisable:false,
                form: {
                    brand:null,model:null, color:null, passengerCapacity:null, carType:null, buyDate:null,mileage:null,driverId:null, carNumber:null,
                    businessScope:null, operateNumber:null, sign:null, trafficLevel:null, trafficOwner:null, ownerTel:null, drivingLicense:null,
                    tradingLicense:null, operatingLicense:null, approvalLicense:null, evaluationLicense:null, remark:null,
                    },
                formLabelWidth: '150px',
                // 表单验证规则
                rules: {
                    brand: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    model: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    color: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    passengerCapacity: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    carType: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    buyDate: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    mileage: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    driverId: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    carNumber: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    businessScope: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    operateNumber: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    sign: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    trafficLevel: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    trafficOwner: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    ownerTel: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    drivingLicense: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    tradingLicense: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    operatingLicense: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    approvalLicense: [{ required: true, message: '不能为空', trigger: 'blur' },],
                    evaluationLicense: [{ required: true, message: '不能为空', trigger: 'blur' },]
                },
                brandOptions:[],
                modelOptions:[],
                colorOptions:[],
                driverOptions:[],
            };
        },
        methods: {
            initTable(){
                let me=this;
                axios.get('../../demo/getTrafficInfoList').then(res=>{
                    if(res.data!=''){
                        me.jsonData=me.tableData=res.data;
                    }
                });
            },
            initOptions(){
                let me=this;
                axios.get('../../demo/getTrafficAttrList').then(res=>{
                    if(res.data!=''){
                        res.data.forEach(v=>{
                            if(v.attrType==='车辆品牌'){
                                me.brandOptions.push(v);
                            }else if(v.attrType==='车型'){
                                me.modelOptions.push(v);
                            }else if(v.attrType==='颜色'){
                                me.colorOptions.push(v);
                            }
                        })
                    }
                });
                axios.get('../../demo/getStaffInfoList').then(res=>{
                    if(res.data!=''){
                        me.driverOptions=res.data;
                    }
                });
            },
            addFunc(){
                let me=this;
                me.dialogFormVisible=true;
                if(me.$refs['roleForm']!=undefined) me.$refs['roleForm'].resetFields();
                me.flag='add';
                me.inputDisable=false;
            },
            submitFunc(){
                let me=this;
                let tableData=me.jsonData;
                if(me.flag=='add'){
                    let v=me.form;
                    this.$refs['roleForm'].validate((valid) => {
                        if (valid) {
                            axios.post('../../demo/addTrafficInfo',v).then(res=>{
                                if(res.data!=''){
                                    me.initTable();
                                    me.dialogFormVisible = false;
                                    me.$message({
                                        type: 'success',
                                        message: '新增数据成功！'
                                    });
                                }
                            },err=>{
                                let flag=0;
                                tableData.forEach(temp=>{
                                    if(temp.carNumber==v.carNumber){
                                        flag=1;
                                    }
                                })
                                if(flag==1){
                                    alert("新增数据失败,填入的车牌号已存在！");
                                }else{
                                    alert("新增数据失败！");
                                }
                            });
                        } else {
                            return false;
                        }
                    });
                }else{
                    let item=me.form;
                    axios.post('../../demo/editTrafficInfo',item).then(res=>{
                        if(res.data!=''){
                            me.initTable();
                            me.dialogFormVisible = false;
                            me.$message({
                                type: 'success',
                                message: '编辑数据成功！'
                            });
                        }
                    },err=>{
                        alert("编辑数据失败！");
                    });
                }
            },
            editFunc(item){
                let me=this;
                me.flag='edit';
                me.dialogFormVisible = true;
                me.form=item;
                me.inputDisable=true;
            },
            deleteFunc(item) {
                let me=this;
                me.$confirm('此操作将永久删除该记录, 是否继续?', '提示', {
                    confirmButtonText: '确定',
                    cancelButtonText: '取消',
                    type: 'warning'
                }).then(() => {
                    axios.post('../../demo/deleteTrafficInfo',item).then(res=>{
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
            },
            search(){
                let me=this;
                let text=me.input;
                if(text==""){
                    me.tableData=me.jsonData;
                }else{
                    let data=me.tableData;
                    me.tableData=[];
                    data.forEach(v=>{
                        if(v.carNumber.indexOf(text)>-1){
                            me.tableData.push(v);
                        }
                    });
                }
            }
        },
        computed: {

        },
        mounted() {
            this.initTable();
            this.initOptions();
        }
    });
</script>
</html>
