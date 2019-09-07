<template>
  <div class="register-container">
    <el-card header="请先注册" class="login-card">
      <el-form @submit.native.prevent="register">
        <el-form-item label="用户名">
          <el-input v-model="model.username"></el-input>
        </el-form-item>
        <el-form-item label="密码">
          <el-input type="password" v-model="model.password"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" native-type="submit">注册</el-button>
        </el-form-item>
        
      </el-form>
    </el-card>
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
     register(){
      //  this.$axios.post("http://orcahrd.natapp1.cc/YaRui/user/doRegister.do",this.model).then((res)=>{
             
      //  })
      alert(this.model)
     }
  }
}
</script>

<style>
.login-card{
  width: 25rem;
  margin: 5rem auto;
}
</style>