<template>
  <div>
    <div class="about" v-for="item in fleit" :key="item.id">
      <div class="about-top">
        <div class="conten">
          <div class="conten-left">
            <div class="conten-lefta">
              <h3>{{hederTitle}}</h3>
              <h4>{{hederTitles}}</h4>
              <div class="conten-left-all">
                <div class="line"></div>
                <div class="line-right">
                    {{item.introduction}}
                </div>
              </div>
            </div>
          </div>
          <div class="conten-right">
            <div class="boc">
              <h3>{{rightTltle}}：</h3>
              <div class="items">
                <ul>
                  <li v-for="item in List" :key="item.id">{{item.title}}</li>
                </ul>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="about-center">
        <div class="Img">
          <img src="http://www.cn-hydroponics.com/uploadfile/2018/0104/20180104035100727.jpg" alt />
        </div>
      </div>
      <div class="about-foot">
        <div class="conten">
          <div class="conten-left">
            <div class="heights">
              <h3>{{footTitle}}</h3>
              <div class="title-file">
              {{item.direction}}
              </div>
              <div class="Imgss">
                <div class="file file-a">
                  <h2>专业</h2>
                  <p>职业</p>
                </div>
                <div class="file file-b">
                  <h2>激情</h2>
                  <p>热情</p>
                </div>
                 <div class="file file-c">
                  <h2>执行</h2>
                  <p>行动</p>
                </div>
              </div>
            </div>
          </div>
          <div class="conten-right">
            <div>
              <img
                src="http://www.cn-hydroponics.com/uploadfile/2018/0104/20180104035121335.jpg"
                alt
              />
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      hederTitle: "深圳市新丝路科技有限公司",
      hederTitles: "基本信息:",
      rightTltle: "使命",
      footTitle: "发展主题",
      List: [
        { title: "拳头级产品价格合理" },
        { title: "先服务" },
        { title: "交货时间短" },
        { title: "交货时间短" }
      ],
  
      fleit: []
    };
  },
   created() {
     this.$axios.get("http://www.orchardteam.com/enterprise/findInformation.do").then((res)=>{
     console.log(res.data)

       this.fleit = res.data.informationList
       console.log( this.fleit)
     })
   },
};
</script>


<style scoped>
.Img{
  overflow: hidden;
}
.about {
  font-size: 18px;
  color: rgb(66, 66, 66);
}
.about-center {
  display: flex;
  justify-content: center;
}
.about-top,
.about-foot {
  display: flex;
  justify-content: center;
}
.conten {
  width: 1100px;
  display: flex;
  justify-content: space-between;
  margin: 30px 30px;
}
.conten-right {
  flex: 1;
  margin-left: 30px;
}
.conten-left {
  flex: 1;
}
.conten-lefta {
  height: 198.81px;
  width: 750px;
  display: flex;
  flex-direction: column;
  align-content: space-around;
  justify-content: space-around;
}
.conten-lefta h4 {
  margin-left: 150px;
}
.conten-left-all {
  width: 750px;
  height: 94px;
  display: flex;
}
.line {
  width: 233px;
  height: 100%;
  border-top: 1px solid rgb(14, 9, 9);
  margin-left: 5px;
}
.boc {
  background: rgb(76, 176, 80);
  height: 100%;
  width: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
}
.items ul {
  margin-left: 50px;
  list-style-type: disc;
}
.items li {
  height: 34px;
  color: white;
}
.boc h3 {
  color: aliceblue;
  margin-left: 20px;
}
.heights {
  height: 538px;
  display: flex;
  flex-direction: column;
  justify-content: space-evenly;
}
.heights h3 {
  font-size: 25px;
}
.Imgss {
  display: flex;
}
.file {
  width: 170px;
  height: 196px;
  border: 1px;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
  color: aliceblue;
  margin-left: 15px;
  color: rgb(248, 240, 240);
}

.file-a {
  background: rgb(0, 177, 80);
}
.file-b {
  background: rgb(255, 0, 0);
}
.file-c {
  background: rgb(0, 112, 193);
}
</style>