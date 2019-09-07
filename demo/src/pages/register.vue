<template>
  <div class="register-container">
    <div class="register-top">
      <el-card header="请先注册" class="login-card">
        <el-form @submit.native.prevent="register">
          <div style="color:red;" v-show="this.error.errors">{{this.error.errors}}</div>
          <el-form-item label="用户名">
            <el-input typr="text" v-model="user.username" placeholder="请输入用户名"></el-input>
            <div class="prompt" v-show="this.error.nameerr"><i>{{this.error.nameerr}}</i> </div>
          </el-form-item>
          <el-form-item label="密码">
            <el-input type="password" v-model="user.password" placeholder="请输入密码"></el-input>
            <i  class="prompt" v-if="this.error.passworderr">{{this.error.passworderr}}</i>
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
  data() {
    return {
      user: {
        username: "",
        password: ""
      },
      error: {
        nameerr: "",
        passworderr: "",
        errors: ""
      }
    };
  },
  methods: {
    register() {
      if (this.user.username == "") {
        this.error.nameerr = "用户名不能为空";
        return false;
      } else {
        this.error.nameerr = "";
      }
      if (this.user.password == "") {
        this.error.passworderr = "密码不能为空";
        return false;
      } else {
        this.error.passworderr = "";
      }
      this.$axios
        .post("http://orcahrd.natapp1.cc/YaRui/user/doRegister.do", {
          name: this.user.username,
          password: this.user.password
        })
        .then(res => {
          if (res.data.state == 0) {
            if (res.data.message) {
              this.error.errors = res.data.message;
            }
          } else {
            this.$message({
              type: "success",
              message: "注册成功 已跳转登陆页面  请登录"
            });
            this.$router.push("/login");
          }
        });
    }
  }
};
</script>

<style>
.register-container {
  background: url("http://www.cn-hydroponics.com/uploadfile/2018/0102/20180102071551498.jpg")-136px 1px;
  height: 610px;
  display: flex;
  justify-content: flex-end;
}
.login-card {
  width: 25rem;
  /* margin: 5rem auto; */
  border: none;
  border-radius: 8%;
  background: gainsboro;
}
.prompt{
  color: rgb(218, 39, 39);
  position: absolute;
}
.register-top {
  width: 500px;
  height: 100%;
  background: rgba(134, 124, 124, 0.6);
  display: flex;
  align-items: center;
  justify-content: center;
}
.el-input__inner {
  border-radius: 8px;
}
.el-button--primary {
  color: #fff;
  background-color: #409eff;
  border-color: #409eff;
  /* margin-left: 75px; */
  width: 45%;
  font-size: 18px;
  text-align: center;
  margin-left: 81px;
  margin-top: 10px;
}
.login-card .radio {
  margin-left: 40px;
  color: rgb(97, 97, 97);
  cursor: pointer;
}
.radio:hover {
  color: rgb(170, 44, 44);
}
</style>