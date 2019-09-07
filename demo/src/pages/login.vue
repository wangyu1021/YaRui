<template>
  <div class="login-container">
    <div class="login-top">
          <el-card header="登录" class="login-card">
            
      <el-form @submit.native.prevent="login">
        <el-form-item label="用户名">
          <el-input  v-model="model.username" placeholder="请输入用户名"></el-input>
        </el-form-item>
        <el-form-item label="密码">
          <el-input type="password" v-model="model.password" placeholder="请输入密码"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" native-type="submit">登录</el-button>
           <span class="radio">
             <router-link to="/register">去注册</router-link>
           </span>
        </el-form-item>
        
      </el-form>
    </el-card>
    </div>

  </div>
</template>
<script>
export default {
  data(){
    return {
      model: {}
    }
  },
  methods: {
     login(){
       this.$axios.post("http://orcahrd.natapp1.cc/YaRui/user/dologin.do",this.model).then((res)=>{
         console.log(res)
       })
     }
  }
}
</script>

<style>
.login-container{
 
  background: url("http://www.cn-hydroponics.com/uploadfile/2018/0102/20180102071532429.jpg");
  height: 702px;
  display: flex;
  justify-content: flex-end;
}
.login-card{
  width: 25rem;
  /* margin: 5rem auto; */
  border: none;
  border-radius:8%;
  background: gainsboro;
}
.login-card .radio{
  margin-left: 40px;
  color: rgb(97, 97, 97);
  cursor: pointer;
}
.radio:hover{
  color: rgb(170, 44, 44);
}
.login-top{
  width: 500px;
  height: 100%;
  background: rgba(134, 124, 124, 0.6);
  display: flex;
  align-items: center;
  justify-content: center;
}
.el-input__inner{
  border-radius:8px;
}
.el-button--primary {
    color: #FFF;
    background-color: #409EFF;
    border-color: #409EFF;
    /* margin-left: 75px; */
    width: 45%;
    font-size: 18px;
    text-align: center;
    margin-left: 81px;
}
</style>