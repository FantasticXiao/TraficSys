<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
    <link rel="stylesheet" href="../../element-ui/index.css">
    <style>
        .el-dialog {
            width: 80%;
        }
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

</script>
</html>
