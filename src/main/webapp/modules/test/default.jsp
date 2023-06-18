<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>默认页面</title>
    <%@include file="../config.jsp"%>
</head>
<body>
<div id="app">
    <el-empty description="功能未开发"></el-empty>
</div>
</body>
<script>
    new Vue({
        el: '#app',
        data() {
            return {};
        },
        methods: {

        },
        computed: {

        },
        mounted() {
        }
    });
</script>
</html>
