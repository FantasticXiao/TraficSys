<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" href="css/login.css">
</head>
<body>
<div id="login_box">
    <h2>LOGIN</h2>
    <div id="input_box">
        <input v-model="user.username" placeholder="请输入用户名"/>
    </div>
    <div class="input_box">
        <input v-model="user.password" placeholder="请输入密码" type="password"/>
    </div>
    <button type="primary" round @click="doLogin" style="cursor: hand">登录</button><br>
</div>
</body>
<!-- 必须先引入vue，  后使用element-ui -->
<script src="js/vue.js"></script>
<script src="js/axios.js"></script>
<script>
    new Vue({
        el: '#login_box',
        data: {
            user:{
                username:'admin',
                password:'123456'
            }
        },
        methods:{
            doLogin(){
                let name=this.user.username;
                let pwd=this.user.password;
                axios({
                    type: 'post',
                    url: 'demo/login',
                    params: {
                        name:name,
                        password:pwd,
                    }
                }).then(res=>{
                    if(res.data!=''){
                        localStorage.setItem('user',JSON.stringify(res.data));
                        window.location = "index.jsp";
                    }
                },err=>{
                    alert(err);
                });
            }
        },
        computed: {

        },
        mounted() {

        }
    })

</script>

</html>
