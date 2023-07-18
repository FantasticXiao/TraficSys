<%@ page  contentType="text/html;charset=UTF-8" import="java.util.*" %>
<html style="overflow: hidden">
<head>
    <title>部门信息管理</title>
    <%@include file="../config.jsp"%>
</head>
<body>
<div id="app">
    <el-container>
        <el-header>
            <el-row :gutter="20">
                <el-col :span="6">
                    <el-input placeholder="部门名称查询" autocomplete="false" v-model="input" prefix-icon="el-icon-search" @change="search"></el-input>
                </el-col>
                <el-col :span="4">
                    <el-button type="primary" icon="el-icon-plus" @click="addFunc">增加</el-button>
                </el-col>
            </el-row>
        </el-header>
        <el-main style="padding-top: 0px">
            <el-table :data="tableData" :height="TableHeight" border v-loading="loading">
                <template slot="empty">
                    <p>{{dataText}}</p>
                </template>
                <el-table-column prop="name" label="部门名称"></el-table-column>
                <el-table-column prop="projectName" label="负责项目"></el-table-column>
                <el-table-column prop="remark" label="备注"></el-table-column>
                <el-table-column label="操作" width="150">
                <template slot-scope="scope">
                    <el-button @click="editFunc(scope.row)" type="text"><i class="el-icon-edit"></i>编辑</el-button>
                    <el-button @click="deleteFunc(scope.row)" type="text"><i class="el-icon-delete"></i>删除</el-button>
                </template>
                </el-table-column>
            </el-table>
        </el-main>
    </el-container>

    <el-dialog :title="flag=='add' ? '增加部门' :'编辑部门'" :visible.sync="dialogFormVisible">
        <el-form :model="form" ref="roleForm" :rules="rules" :inline="true" class="demo-form-inline">
                <el-form-item label="部门名称" :label-width="formLabelWidth" prop="name">
                    <el-input v-model="form.name" autocomplete="off" placeholder="部门名称" :disabled="inputDisable"></el-input>
                </el-form-item>
                <el-form-item label="负责项目" :label-width="formLabelWidth" prop="projectName">
                    <el-input v-model="form.projectName" autocomplete="off" placeholder="负责项目"></el-input>
                </el-form-item>
            <el-form-item label="备注" :label-width="formLabelWidth" prop="remark">
                <el-input v-model="form.remark" autocomplete="off" placeholder="备注"></el-input>
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
                    name:null,projectName:null,remark:null,
                },
                formLabelWidth: '110px',
                // 表单验证规则
                rules: {
                    name: [
                        { required: true, message: '请输入部门名称', trigger: 'blur' },
                    ],
                    projectName: [
                        { required: true, message: '请输入负责项目的名称', trigger: 'blur' },
                    ],
                },
            };
        },
        methods: {
            initTable(){
                let me=this;
                me.loading=true;
                axios.get('../../demo/getStaffDepartmentList').then(res=>{
                    me.loading=false;
                    if(res.data!=''){
                        me.jsonData=me.tableData=res.data;
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
                            axios.post('../../demo/addStaffDepartment',v).then(res=>{
                                if(res.data!=''){
                                    me.dialogFormVisible = false;
                                    me.initTable();
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
                    axios.post('../../demo/editStaffDepartment',item).then(res=>{
                        if(res.data!=''){
                            me.dialogFormVisible = false;
                            me.initTable();
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
                     axios.post('../../demo/deleteStaffDepartment',item).then(res=>{
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
        created() {
            //动态计算表格高度
            let windowHeight = document.documentElement.clientHeight || document.bodyclientHeight;
            this.TableHeight = windowHeight - 100;
        },
        mounted() {
            this.initTable();
        }
    });
</script>
</html>
