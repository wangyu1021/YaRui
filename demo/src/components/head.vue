<template>
  <div class="coco">
    <div class="vi1">
      <div class="logo">
        <img src="../assets/imgs/coco.jpg" />
      </div>
      
      <div class="ge">
        
        <router-link class="login" to="/login">登录</router-link>
        <router-link class="login" to="/register">注册</router-link>


       
        <img src="../assets/imgs/te.jpg" />
        <a>0755-89568384</a>&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;
        <img src="../assets/imgs/ojb.jpg" />&nbsp;&nbsp;&nbsp;
        <a>中文简体</a>&nbsp;&nbsp;
        <a>|</a>&nbsp;&nbsp;&nbsp;
        <img src="../assets/imgs/obk.jpg" />&nbsp;&nbsp;&nbsp;
        <a>ENGLISH</a>
      </div>
    
      <div class="ro">
        <input type="tet" />
      </div>
      <div class="tee">
        <img src="../assets/imgs/see.jpg" />
      </div>
      <div id="cei">
        <img src="../assets/imgs/code_ewm.png" />
      </div>
    </div>
  </div>
</template>

<script>
export default {};
</script>

<style scoped>
.login{
  margin-right: 10px;
}
.coco {
  /* width: 1366px; */
  height: 90px;
}
.vi1 {
  width: 1200px;
  margin: 0 auto;
  height: 90px;

}
.logo {
  width: 62px;
  height: 85px;
  float: left;
  margin-top: 5px;
}
.ge {
  width: 560px;
  height: 30px;
  float: right;
  margin-top: 10px;

}
#ee {
  margin-top: 10px;
}
.ro {
  width: 400px;
  height: 40px;
  position: absolute;
  margin-top: 40px;
  margin-left: 850px;
}
.ro input {
  border-radius: 15px;
  background: #f5f5f5;
  padding: 0 10px;
  width: 220px;
  height: 32px;
  border-radius: 32px;
  border: none;
  outline: none;
  margin-top: 10px;
}
.tee {
  float: right;
  margin-top: 38px;
  position: absolute;
  margin-left: 1040px;
  font-size: 40px;
}
#cei {
  width: 68px;
  height: 77px;
  position: absolute;
  margin-left: 1145px;
}
#cei img {
  width: 68px;
  height: 77px;
  margin-top: 5px;
}
</style>