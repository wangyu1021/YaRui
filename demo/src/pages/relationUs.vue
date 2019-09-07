<template>
  <div class="us">
    <div class="conten">
      <div class="conten-a">
        <div class="texts">
          <h2>联系我们</h2>
          <p>
            如果您需要更多详细信息或有关我们的任何疑问，
            <br />请随时与我们联系。
            <br />您的任何疑问都将在12小时内收到专业回复。
          </p>
          <div class="dl" v-for="item in us" :key="item.id">
            <h2>{{item.title}}</h2>
            <ul>
              <li>{{item.name}}</li>
            </ul>
          </div>
        </div>
      </div>
      <div class="conten-b">
        <div class="shuan" style="width:100%; height:100%;" >
          <maps/>
        </div>
        <div class="shuan">
          <div class="inputs">
            <h2 style="margin-left:20px;">保持联系</h2>
            <div class="in">
              <input type="text" placeholder="  name" />
            </div>
            <div class="in">
              <input type="text" placeholder=" email" />
            </div>
            <div class="in">
              <input type="text" placeholder=" phone" />
            </div>
            <div class="in">
              <input type="text" placeholder=" countoy" />
            </div>
            <div class="in">
              <input type="text" placeholder=" your Message" />
            </div>
            <input
              type="button"
 
              style=" background: rgb(79, 146, 79); color:#fff;  width:200px; line-height:1px;"
              value="确认"
            />
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import maps from "../pages/apis/map"
export default {
  data() {
    return {
      us: [
        { title: "深圳新丝路技术制造商" },
        { name: "销售经理：Ada Yuan" },
        { name: "电话：+ 086-13682533490" },
        { name: "PH值：+ 086-755-89568384" },
        { name: "电子邮件：Ada@cn-hydroponics.com" },
        { name: "Skype的：Adaywy1" },
        { name: "地址：广东省深圳市龙城街道1号彩云路新潮工业区4号楼518172" }
      ]
    };
  },
  components:{
    maps
  }
};
</script>

<style scoped>
.us {
  background: url("http://www.cn-hydroponics.com/statics/huidaxin/images/contact-bg_02.jpg");
  height: 690px;
  display: flex;
  align-items: center;
}
.conten {
  width: 1200px;
  height: 494px;
  margin: 0 auto;
  display: flex;
}
.conten-a {
  flex: 2;
  display: flex;
  align-items: center;
}
.conten-b {
  flex: 2;
  display: flex;
  align-items: center;
}
.shuan {
  height: 100%;
  width: 100%;
  overflow: hidden;
  border-radius: 8px;
}
.texts {
  height: 100%;
  width: 100%;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  color: aliceblue;
 }
.inputs {
  /* margin-left: 10px; */
  line-height: 60px;
  background: white;
  height: 100%;
}
.inputs input {
  width: 300px;
  height: 40px;
  border-radius: 10px;
  background: rgba(234, 238, 241, 0.5);
  margin-left: 20px;
  margin-top: 20px;
  outline: none;
  border: none;
}
</style>
