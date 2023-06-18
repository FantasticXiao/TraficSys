<%@ page  contentType="text/html;charset=UTF-8" import="java.util.*" %>
<html style="overflow: hidden">
<head>
    <title></title>
    <%@include file="../config.jsp"%>
    <style>
        .el-dialog {
            width: 50%;
        }
    </style>
</head>
<body>
<div id="app">
    <el-container>
        <el-header>
            <el-row :gutter="20">
                <el-col :span="6">
                    <el-input placeholder="模糊查询" autocomplete="false" v-model="input" prefix-icon="el-icon-search" @change="search"></el-input>
                </el-col>
                <el-col :span="4">
                    <el-button type="primary" icon="el-icon-plus" @click="dialogFormVisible= true ">增加</el-button>
                </el-col>
            </el-row>
        </el-header>
        <el-main style="padding-top: 0px">
            <el-table :data="tableData" :span-method="objectSpanMethod" border height="440">
                <template slot="empty">
                    <p>{{dataText}}</p>
                </template>
                <el-table-column prop="attrType" label="类型" ></el-table-column>
                <el-table-column prop="attrDescription" label="名称"></el-table-column>
               <%-- <el-table-column prop="remark" label="备注"></el-table-column>--%>
                <el-table-column fixed="right" label="操作" width="90">
                <template slot-scope="scope">
                    <el-button @click="deleteFunc(scope.row)" type="text"><i class="el-icon-delete"></i>删除</el-button>
                </template>
                </el-table-column>
            </el-table>
        </el-main>
    </el-container>

    <el-dialog title="增加车辆属性" :visible.sync="dialogFormVisible" >
        <el-form :model="form" ref="roleForm" :rules="rules">
            <el-form-item label="类型" :label-width="formLabelWidth" prop="attrType">
                <el-select v-model="form.attrType" placeholder="请选择">
                    <el-option v-for="item in selectOptions" :label="item" :key="item" :value="item"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item label="名称" :label-width="formLabelWidth" prop="attrDescription">
                <el-input v-model="form.attrDescription" autocomplete="off"></el-input>
            </el-form-item>
            <el-form-item label="备注" :label-width="formLabelWidth" prop="remark">
                <el-input v-model="form.remark" type="textarea" :rows="3"></el-input>
            </el-form-item>
        </el-form>
        <div slot="footer" class="dialog-footer">
            <el-button @click="dialogFormVisible = false">取 消</el-button>
            <el-button type="primary" @click="add">确 定</el-button>
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
                    attrType: '',
                    attrDescription:'',
                    remark:null,
                },
                // 表单验证规则
                rules: {
                    attrType: [
                        { required: true, message: '请选择车辆属性', trigger: 'blur' },
                    ],
                    attrDescription: [
                        { required: true, message: '请输入车辆属性名称', trigger: 'blur' },
                    ],
                },
                formLabelWidth: '120px',
                selectOptions:["车辆品牌","车型","颜色"],
                spanArr1: [], // 记录每一行的合并数
                pos1: '', // 记录索引
            };
        },
        methods: {
            // 合并行
            getSpanArr (data) {
                this.spanArr1=[];
                this.pos1='';
                for (let i = 0; i < data.length; i++) { // 第一列
                    if (i === 0) {
                        this.spanArr1.push(1)
                        this.pos1 = 0
                    } else {
                        // 判断当前元素与上一个元素是否相同
                        if (data[i].attrType === data[i - 1].attrType) {
                            this.spanArr1[this.pos1] += 1
                            this.spanArr1.push(0)
                        } else {
                            this.spanArr1.push(1)
                            this.pos1 = i
                        }
                    }
                }
            },
            objectSpanMethod ({ row, column, rowIndex, columnIndex }) {
                if (columnIndex === 0) { // 第一列
                    const _row = this.spanArr1[rowIndex]
                    const _col = _row > 0 ? 1 : 0
                    return {
                        rowspan: _row,
                        colspan: _col
                    }
                }
            },
            initTable(){
                let me=this;
                axios.get('../../demo/getTrafficAttrList').then(res=>{
                    if(res.data!=''){
                        me.jsonData=me.tableData=res.data;
                        me.getSpanArr(me.tableData);
                    }
                });
            },
            add(){
                let me=this;
                let v=me.form;
                this.$refs['roleForm'].validate((valid) => {
                    if (valid) {
                        axios.post('../../demo/addTrafficAttr',v).then(res=>{
                            if(res.data!=''){
                                me.initTable();
                                me.dialogFormVisible = false;
                                this.$refs['roleForm'].resetFields();
                            }
                        },err=>{
                            alert("新增数据失败！");
                        });
                    } else {
                        return false;
                    }
                });
            },
            deleteFunc(item) {
                let me=this;
                me.$confirm('此操作将永久删除该记录, 是否继续?', '提示', {
                    confirmButtonText: '确定',
                    cancelButtonText: '取消',
                    type: 'warning'
                }).then(() => {
                    axios.post('../../demo/deleteTrafficAttr',item).then(res=>{
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
                        if(v.attrType.indexOf(text)>-1 || v.attrDescription.indexOf(text)>-1){
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
