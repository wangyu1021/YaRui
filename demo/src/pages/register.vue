<template>
  <div class="register-container">
    <div class="register-top">
          <el-card header="请先注册" class="login-card">
      <el-form @submit.native.prevent="register">
        <el-form-item label="用户名">
          <el-input  v-model="model.username" placeholder="请输入用户名"></el-input>
        </el-form-item>
        <el-form-item label="密码">
          <el-input type="password" v-model="model.password" placeholder="请输入密码"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" native-type="submit">注册</el-button>
           <span class="radio">
             <router-link to="/login">返回登录</router-link>
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
      model:{
        username:"",
        password:""

      },
      error:{}
    }
  },
  methods: {
     register(){
       this.$axios.get("http://orcahrd.natapp1.cc/YaRui/user/doRegister.do",
       {
        // params:{
        //      name:this.model.username,
        //      password:this.model.password
        // }
       })
       .then((res)=> {
          console.log(res.data)
          if (res.data.state == 0) {
              this.$message({
              type: "success",
              message: "注册成功"
            });
            this.$router.push("/login");
          } else {
            this.error = res.data.message
            console.log(this.error)
          }
         
        });
       
     }
  }
}
</script>

<style>
.register-container{
 
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
.register-top{
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
.login-card .radio{
  margin-left: 40px;
  color: rgb(97, 97, 97);
  cursor: pointer;
}
.radio:hover{
  color: rgb(170, 44, 44);
}
</style>