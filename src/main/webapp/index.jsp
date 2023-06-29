<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>车辆管理系统</title>
    <link rel="stylesheet" href="element-ui/index.css">
    <link rel="stylesheet" href="css/index.css">
  </head>
  <body>
  <el-container id="app">
    <el-header >
      <h1>百佳客运车辆管理平台</h1>
      <div class="top-right">
        <el-menu class="el-menu-demo" mode="horizontal" height="55px" background-color="#232f3e" text-color="#fff" active-text-color="#ffd04b">
          <el-menu-item @click="dialogFormVisible = true">
            <i class="el-icon-s-custom"></i><span>修改密码</span>
          </el-menu-item>
          <el-menu-item @click="dialogFormVisible = true">
            <i class="el-icon-table-lamp"></i><span>打卡</span>
          </el-menu-item>
          <el-menu-item @click="notice">
            <i class="el-icon-message-solid"></i><span>通知</span>
          </el-menu-item>
          <el-menu-item @click="doLogOut">
            <i class="el-icon-switch-button"></i><span>注销</span>
          </el-menu-item>
        </el-menu>
      </div>
    </el-header>

    <el-aside>
      <!-- 侧边导航 -->
      <el-menu :unique-opened="true" background-color="#232f3e" text-color="#fff" active-text-color="#ffd04b"  :default-active="activeIndex">
        <!-- 动态渲染导航 -->
        <template v-for="submenu in menuList">
          <el-submenu :index="submenu.index">
            <template slot="title"> <i :class="submenu.icon"></i>{{ submenu.title }} </template>
            <template v-for="menu in submenu.children">
              <!-- 添加标签页的方法 addTab() -->
              <el-menu-item
                      :index="menu.index"
                      @click="addTab(menu)"
              >
                {{ menu.childtitle }}
              </el-menu-item>
            </template>
          </el-submenu>
        </template>
      </el-menu>
    </el-aside>
      <el-main>
        <!-- 标签栏 -->
        <div class="tabs">
          <el-tabs v-model="activeIndex" @tab-remove="removeTab">
            <!-- :closable 首页不可关闭 -->
            <el-tab-pane v-for="item in openTab" :key="item.childtitle" :label="item.childtitle" :name="item.index" :closable="item.childtitle !== '首页' ">
              <div class="maincontent">
                  <iframe :src="item.module" scrolling="auto" ></iframe>
              </div>
            </el-tab-pane>
          </el-tabs>
        </div>
      </el-main>

    <el-dialog title="修改密码" :visible.sync="dialogFormVisible">
      <el-form :model="form">
        <el-form-item label="账号名称" :label-width="formLabelWidth">
          <el-input v-model="form.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="账号密码" :label-width="formLabelWidth">
          <el-input v-model="form.password" autocomplete="off"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取 消</el-button>
        <el-button type="primary" @click="dialogFormVisible = false">确 定</el-button>
      </div>
    </el-dialog>
  </el-container>
  </body>
  <!-- 必须先引入vue，  后使用element-ui -->
  <script src="js/vue.js"></script>
  <script src="js/axios.js"></script>
  <!-- 引入组件库 -->
  <script src="element-ui/index.js"></script>

  <script>
    let user=JSON.parse(localStorage.getItem('user'));
    let roleId=null;
      if(user==null){
          window.location = "login.jsp";
      }else{
          roleId=user.role_id;
      }
      new Vue({
          el: '#app',
          data: {
              userName:user.name,
              openTab: [],
              activeIndex:"",
              menuList:[],
              dialogFormVisible: false,
              form: {
                  name: '',
                  password:'',
              },
              formLabelWidth: '120px'
          },
          methods:{
              initMenu(){
                  let me=this;
                  axios({
                      type: 'post',
                      url: 'demo/getSysMenuListByRoleId',
                      params: {roleId:roleId}
                  }).then(res=>{
                      if(res.data!=''){
                          let menu=res.data;
                          menu.forEach(v=>{
                              if(v.parentId==0){
                                  me.menuList.push({title:v.name,index:(v.menuId).toString(),icon:v.icon});
                              }
                          })
                          for(let i=0;i<me.menuList.length;i++){
                              let temp=[];
                              menu.forEach(v=>{
                                  if(v.parentId>0 && v.parentId==me.menuList[i].index){
                                      temp.push({childtitle:v.name,index:v.parentId+"-"+v.orderNum,module:v.url});
                                  }
                              })
                              me.menuList[i].children=temp;
                          }
                          me.addTab(me.menuList[0].children[0]);
                      }else{
                          alert(err);
                      }
                  });
              },
              doLogOut(){
                  localStorage.setItem('user',null);
                  window.location = "login.jsp";
              },
              notice(){
                  this.$notify({
                      title: '通知公告',
                      message: '右下角弹出的消息',
                      position: 'bottom-right'
                  });
              },
              // 单击导航栏时添加标签页
              addTab(menu) {
                  let me=this;
                  if (me.openTab.indexOf(menu) == -1) {
                      me.openTab.push(menu);
                      me.activeIndex=menu.index;
                  }else{
                      me.activeIndex=menu.index;
                  }
              },
              // 删除tab，直接在elementUI官网复制的，改了变量名
              removeTab(targetName) {
                  // console.log(targetName);
                  let me=this;
                  let tabs = me.openTab;
                  let activeIndex = me.activeIndex;
                  if (activeIndex === targetName) {
                      tabs.forEach((tab, index) => {
                          if (tab.index === targetName) {
                              let nextTab = tabs[index + 1] || tabs[index - 1];
                              if (nextTab) {
                                  activeIndex = nextTab.index;
                              }else{
                                  activeIndex="";
                              }
                          }
                      });
                  }
                  me.activeIndex = activeIndex;
                  me.openTab = tabs.filter((tab) => tab.index !== targetName);
              },
          },
          computed: {

          },
          mounted() {
              let me=this;
             if(user!=null){
                 me.initMenu();
             }
          }
      })

  </script>
</html>
