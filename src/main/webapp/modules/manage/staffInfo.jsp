<%@ page  contentType="text/html;charset=UTF-8" import="java.util.*" %>
<html style="overflow: hidden">
<head>
    <title></title>
    <%@include file="../config.jsp"%>
</head>
<body>
<div id="app">
    <el-container>
        <el-header>
            <el-row :gutter="20">
                <el-col :span="6">
                    <el-input placeholder="姓名查询" autocomplete="false" v-model="input" prefix-icon="el-icon-search" @change="search"></el-input>
                </el-col>
                <el-col :span="4">
                    <el-button type="primary" icon="el-icon-plus" @click="addFunc">增加</el-button>
                </el-col>
            </el-row>
        </el-header>
        <el-main style="padding-top: 0px">
            <el-table :data="tableData" height="440" border v-loading="loading">
                <template slot="empty">
                    <p>{{dataText}}</p>
                </template>
                <el-table-column prop="name" label="姓名"></el-table-column>
                <el-table-column prop="sex" label="性别"></el-table-column>
                <el-table-column prop="account" label="账号"></el-table-column>
                <el-table-column prop="password" label="密码"></el-table-column>
                <el-table-column prop="tel" label="手机"></el-table-column>
                <el-table-column prop="status" label="状态"></el-table-column>
                <el-table-column prop="driverIf" label="是否司机"></el-table-column>
                <el-table-column label="操作" width="150">
                <template slot-scope="scope">
                    <el-button @click="editFunc(scope.row)" type="text"><i class="el-icon-edit"></i>编辑</el-button>
                    <el-button @click="deleteFunc(scope.row)" type="text"><i class="el-icon-delete"></i>删除</el-button>
                </template>
                </el-table-column>
            </el-table>
        </el-main>
    </el-container>

    <el-dialog :title="flag=='add' ? '增加员工' :'编辑员工'" :visible.sync="dialogFormVisible">
        <el-form :model="form" ref="roleForm" :rules="rules" :inline="true" class="demo-form-inline">
                <el-form-item label="姓名" :label-width="formLabelWidth" prop="name">
                    <el-input v-model="form.name" autocomplete="off" placeholder="姓名" :disabled="inputDisable"></el-input>
                </el-form-item>
                <el-form-item label="手机号码" :label-width="formLabelWidth" prop="tel">
                    <el-input v-model="form.tel" autocomplete="off" placeholder="手机号码" :disabled="inputDisable"></el-input>
                </el-form-item>
                <el-form-item label="账号名称" :label-width="formLabelWidth" prop="account">
                    <el-input v-model="form.account" autocomplete="off" placeholder="账号名称" :disabled="inputDisable"></el-input>
                </el-form-item>
                <el-form-item label="性别" :label-width="formLabelWidth" prop="sex">
                    <el-select v-model="form.sex" placeholder="性别">
                        <el-option label="男" value="男"></el-option>
                        <el-option label="女" value="女"></el-option>
                    </el-select>
                </el-form-item>
                <el-form-item label="账号密码" :label-width="formLabelWidth" prop="password">
                    <el-input v-model="form.password" autocomplete="off" placeholder="账号密码"></el-input>
                </el-form-item>
                <el-form-item label="状态" :label-width="formLabelWidth" prop="status">
                    <el-select v-model="form.status" placeholder="状态">
                        <el-option label="在职" value="在职"></el-option>
                        <el-option label="离职" value="离职"></el-option>
                    </el-select>
                </el-form-item>
                <el-form-item label="所属部门" :label-width="formLabelWidth" prop="departmentId">
                    <el-select v-model="form.departmentId" placeholder="所属部门" >
                        <el-option v-for="item in departmentOptions" :label="item.name" :value="item.id" :key="item.id"></el-option>
                    </el-select>
                </el-form-item>
                <el-form-item label="角色权限" :label-width="formLabelWidth" prop="role">
                    <el-select v-model="form.role" placeholder="角色权限">
                        <el-option v-for="item in roleOptions" :label="item.roleName" :value="item.roleName" :key="item.roleName"></el-option>
                    </el-select>
                </el-form-item>
                <el-form-item label="是否是司机" :label-width="formLabelWidth" prop="driverIf">
                    <el-select v-model="form.driverIf">
                        <el-option label="是" value="是"></el-option>
                        <el-option label="否" value="否"></el-option>
                    </el-select>
                </el-form-item>
                <el-form-item label="准驾车型" :label-width="formLabelWidth" prop="vehicleModel">
                    <el-select v-model="form.vehicleModel" placeholder="准驾车型">
                        <el-option v-for="item in vehicleModelOptions" :label="item.attrDescription" :value="item.attrDescription" :key="item.attrDescription"></el-option>
                    </el-select>
                </el-form-item>
                <el-form-item label="驾照到期时间" :label-width="formLabelWidth" prop="licenseExpirationDate">
                    <el-date-picker type="date" placeholder="选择日期" v-model="form.licenseExpirationDate" value-format="yyyy-MM-dd"></el-date-picker>
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
                loading: false,
                dialogFormVisible: false,
                inputDisable:false,
                form: {
                    name:null,sex:null,account:null,password:null,tel:null,status:'在职',
                    departmentId:null,role:null,vehicleModel:'',licenseExpirationDate:null,driverIf:null
                },
                formLabelWidth: '110px',
                // 表单验证规则
                rules: {
                    name: [
                        { required: true, message: '请输入员工姓名', trigger: 'blur' },
                    ],
                    sex: [
                        { required: true, message: '请输入车辆属性名称', trigger: 'blur' },
                    ],
                    account: [
                        { required: true, message: '请输入账号名称', trigger: 'blur' },
                    ],
                    password: [
                        { required: true, message: '请输入账号密码', trigger: 'blur' },
                    ],
                    tel: [
                        { required: true, message: '请输入电话号码', trigger: 'blur' },
                    ],
                    status: [
                        { required: true, message: '请选择员工状态', trigger: 'blur' },
                    ],
                    departmentId: [
                        { required: true, message: '请选择部门', trigger: 'blur' },
                    ],
                    driverIf: [
                        { required: true, message: '请选择员工身份，是否是司机', trigger: 'blur' },
                    ],
                },
                departmentOptions:[],
                roleOptions:[],
                vehicleModelOptions:[],
            };
        },
        methods: {
            initTable(){
                let me=this;
                axios.get('../../demo/getStaffInfoList').then(res=>{
                    if(res.data!=''){
                        me.jsonData=me.tableData=res.data;
                    }
                });
            },
            initOptions(){
              let me=this;
                axios.get('../../demo/selectDepartmentList').then(res=>{
                    if(res.data!=''){
                        me.departmentOptions=res.data;
                    }
                });
                axios.get('../../demo/getTrafficAttrList').then(res=>{
                    if(res.data!=''){
                        res.data.forEach(v=>{
                          if(v.attrType==='车型'){
                              me.vehicleModelOptions.push(v);
                          }
                        })
                    }
                });
                axios.get('../../demo/getSysRoleList').then(res=>{
                    if(res.data!=''){
                        me.roleOptions=res.data;
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
                me.dialogFormVisible = false;
                me.loading=true;
                let tableData=me.jsonData;
                if(me.flag=='add'){
                    let v=me.form;
                    this.$refs['roleForm'].validate((valid) => {
                        if (valid) {
                            axios.post('../../demo/addStaffInfo',v).then(res=>{
                                if(res.data!=''){
                                    me.initTable();
                                    me.loading=false;
                                    me.$message({
                                        type: 'success',
                                        message: '新增数据成功！'
                                    });
                                }
                            },err=>{
                                let flag=0;
                                tableData.forEach(temp=>{
                                    if(temp.account==v.account){
                                        flag=1;
                                    }
                                })
                                if(flag==1){
                                    alert("新增数据失败,填入的账号名称已存在！");
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
                    axios.post('../../demo/editStaffInfo',item).then(res=>{
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
                     axios.post('../../demo/deleteStaffInfo',item).then(res=>{
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
                        if(v.name.indexOf(text)>-1){
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
