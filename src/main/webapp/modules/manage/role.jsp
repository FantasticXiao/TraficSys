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
                    <el-input placeholder="名称查询" autocomplete="false" v-model="input" prefix-icon="el-icon-search" @change="search"></el-input>
                </el-col>
                <el-col :span="4">
                    <el-button type="primary" icon="el-icon-plus" @click="dialogFormVisible= true ">增加</el-button>
                </el-col>
            </el-row>
        </el-header>
        <el-main style="padding-top: 0px">
            <el-table :data="tableData" ref="myTable" height="440" border>
                <template slot="empty">
                    <p>{{dataText}}</p>
                </template>
                <el-table-column label="状态">
                    <template slot-scope="scope">
                    <!-- scope.row 包含表格里当前行的所有数据 -->
                    <el-tag :type="scope.row.deleteFlag==1 ? 'danger' : 'success'">{{scope.row.deleteFlag==1 ? '无效' : '有效'}}</el-tag>
                    </template>
                </el-table-column>
                <el-table-column prop="roleName" label="角色名称"></el-table-column>
                <el-table-column prop="roleCode" label="角色代码"></el-table-column>
                <el-table-column prop="remark" label="备注"></el-table-column>
                <el-table-column label="操作" width="250">
                <template slot-scope="scope">
                    <el-button @click="editFunc(scope.row,0)" type="text"><i class="el-icon-refresh-left"></i>恢复</el-button>
                    <el-button @click="editFunc(scope.row,1)" type="text"><i class="el-icon-switch-button"></i>禁用</el-button>
                    <el-button @click="deleteFunc(scope.row)" type="text"><i class="el-icon-delete"></i>删除</el-button>
                    <el-button @click="configFunc(scope.row)" type="text"><i class="el-icon-setting"></i>配置</el-button>
                </template>
                </el-table-column>
            </el-table>
        </el-main>
    </el-container>

    <el-dialog title="增加角色" :visible.sync="dialogFormVisible">
        <el-form :model="form"  ref="roleForm" :rules="rules">
            <el-form-item label="角色名称" :label-width="formLabelWidth">
                <el-input v-model="form.roleName" autocomplete="off"></el-input>
            </el-form-item>
            <el-form-item label="角色代码" :label-width="formLabelWidth">
                <el-input v-model="form.roleCode" autocomplete="off"></el-input>
            </el-form-item>
            <el-form-item label="备注" :label-width="formLabelWidth">
                <el-input v-model="form.remark" type="textarea" :rows="3"></el-input>
            </el-form-item>
        </el-form>
        <div slot="footer" class="dialog-footer">
            <el-button @click="dialogFormVisible = false">取 消</el-button>
            <el-button type="primary" @click="add">确 定</el-button>
        </div>
    </el-dialog>

    <el-dialog title="配置菜单" :visible.sync="dialogMenuVisible">
        <template>
            <el-transfer v-model="treeValue" :data="treeData" ref="myTransfer"
                         :titles="['未配置权限', '已配置权限']" :button-texts="['取消配置', '确认配置']"></el-transfer>
        </template>
        <div slot="footer" class="dialog-footer">
            <el-button @click="dialogMenuVisible = false">取 消</el-button>
            <el-button type="primary" @click="roleMenuSave">确 定</el-button>
        </div>
    </el-dialog>
</div>
</body>
<script>
    new Vue({
        el: '#app',
        data() {
            return {
                jsonData:[],
                tableData:[],
                dataText:'',
                input:'',
                dialogFormVisible: false,
                form: {
                    roleName: '',
                    roleCode:'',
                    remark:null,
                },
                rules: {
                    roleName: [
                        { required: true, message: '请输入角色名称', trigger: 'blur' },
                    ],
                    roleCode: [
                        { required: true, message: '请输入角色代码', trigger: 'blur' },
                    ],
                },
                formLabelWidth: '120px',
                dialogMenuVisible:false,
                menuList:[],
                treeData:[],
                treeValue:[],
                selectRoleId:null,
            };
        },
        methods: {
            initTable(){
                let me=this;
                axios.get('../../demo/getSysRoleList').then(res=>{
                    if(res.data!=''){
                        me.jsonData=me.tableData=res.data;
                    }
                });
                axios.get('../../demo/getSysMenuList').then(res=>{
                    if(res.data!=''){
                        let menu=res.data;
                        me.menuList=menu;
                        me.initTreeData(menu);
                    }else{
                        alert(err);
                    }
                });
            },
            initTreeData(menu){
                let me=this;
                menu.forEach(v=>{
                    if(v.parentId>0){
                        me.treeData.push({label:v.name,key:v.menuId});
                    }
                })
            },
            add(){
                let me=this;
                let v=me.form;
                let tableData=me.jsonData;
                if(this.$refs['roleForm']!=undefined) this.$refs['roleForm'].resetFields();
                v.createTime=getNow();
                v.deleteFlag=0;
                this.$refs['roleForm'].validate((valid) => {
                    if (valid) {
                        axios.post('../../demo/addSysRole',v).then(res=>{
                            if(res.data!=''){
                                tableData.push(v);
                                me.tableData=me.jsonData=tableData;
                                me.dialogFormVisible = false;
                            }
                        },err=>{
                            alert("新增数据失败！");
                        });
                    } else {
                        return false;
                    }
                });
            },
            editFunc(item,flag){
                let me=this;
                let tableData=me.jsonData;
                item.deleteFlag=flag;
                item.updateTime=getNow();
                axios.post('../../demo/editSysRole',item).then(res=>{
                    if(res.data!=''){
                        tableData.forEach((v)=>{
                            if(v.id === item.id){
                                v=item;
                            }
                        });
                        me.tableData=me.jsonData=tableData;
                        if(flag==0){
                            me.$message({
                                type: 'success',
                                message: '恢复成功！'
                            });
                        }else{
                            me.$message({
                                type: 'warning',
                                message: '禁用成功！'
                            });
                        }
                    }
                },err=>{
                    alert("编辑数据失败！");
                });
            },
            deleteFunc(item) {
                 let me=this;
                 me.$confirm('此操作将永久删除该记录, 是否继续?', '提示', {
                     confirmButtonText: '确定',
                     cancelButtonText: '取消',
                     type: 'warning'
                 }).then(() => {
                     axios.post('../../demo/deleteSysRole',item).then(res=> {
                         if (res.data != '') {
                             me.$message({
                                 type: 'success',
                                 message: '删除成功!'
                             });
                         }
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
            configFunc(item) {
                let me=this;
                me.dialogMenuVisible=true;
                me.selectRoleId=item.id;
                me.treeValue=[];
                me.checkArray=[];
                if(me.$refs['myTransfer']!=undefined){
                    me.$refs['myTransfer'].$children["0"].checked=[];
                    me.$refs['myTransfer'].$children["3"].checked=[];
                }
                axios({
                    type: 'post',
                    url: '../../demo/selectRoleMenuByRoleId',
                    params: {roleId:item.id}
                }).then(res=>{
                    if(res.data!=''){
                        res.data.forEach(v=>{
                            me.treeValue.push(parseInt(v.menuId));
                        });
                    }
                });
            },
            roleMenuSave(){
                let me=this;
                let roleMenuList=[];
                if(me.treeValue.length>0){
                    me.menuList.forEach(v=>{
                        me.treeData.forEach(t=>{
                            if(v.menuId==t.key && me.treeValue.indexOf(v.parentId)==-1){
                                me.treeValue.push(v.parentId);
                            }
                        })
                    });
                    me.treeValue.forEach(v=>{
                        roleMenuList.push({roleId:me.selectRoleId,menuId:v,createTime:getNow(),deleteFlag:1});
                    });
                    axios.post('../../demo/roleMenuSave',roleMenuList).then(res=>{
                        if(res.data==0){
                            me.dialogMenuVisible=false;
                            me.$message({
                                type: 'success',
                                message: '配置成功!'
                            });
                        }
                    },err=>{
                        alert("配置权限失败！");
                    });
                }else{
                    me.$message({
                        type: 'info',
                        message: '没有选中的配置！'
                    });
                }
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
                        if(v.roleName.indexOf(text)>-1){
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
        }
    });
</script>
</html>
