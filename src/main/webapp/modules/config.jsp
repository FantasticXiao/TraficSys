<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
    <link rel="stylesheet" href="../../element-ui/index.css">
    <style>
        .el-dialog {
            width: 80%;
        }
       /* .el-dialog__header {
            background: #03133;;
        }*/
    </style>
</head>
<!-- 必须先引入vue，  后使用element-ui -->
<script type="text/javascript" charset="UTF-8" src="../../js/vue.js"></script>
<script type="text/javascript" charset="UTF-8" src="../../js/axios.js"></script>
<%--<!-- 引入组件库 -->
<script type="text/javascript" charset="UTF-8" src="../../js/element-ui-index.js"></script>--%>

<!-- 引入组件库 -->
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<script>

    function getNow(){
        return new Date(+new Date(new Date()) + 8 * 3600 * 1000).toISOString().replace(/T/g, ' ').replace(/\.[\d]{3}Z/, '');
    }
    /**
     *复制下面的方法 直接调用就行 value 就传对应的时间  如：Thu Jun 13 2019 10:41:09 GMT+0800 (中国
     *标准时间)
     */
    function dateConversion(value){
        var d = new Date(value);
        let month=(d.getMonth() + 1);
        var date = d.getFullYear() + '-' + (month>9 ? month : '0'+month);
            //+ '-' + d.getDate();
           // + ' ' + d.getHours() + ':' + d.getMinutes() + ':' + d.getSeconds();
        return date;
    }
</script>
</html>
