<template>
  <div class="box">
    <div class="box_a" v-for="item in boxList" :key="item.id" @click="btn1(i)">
      <div class="box_a-">
        <router-link to="/Home/newss">
          <img
            width="86%"
            class="ar"
            src="http://www.cn-hydroponics.com/uploadfile/2018/0319/20180319112114542.jpg"
            alt
          />
        </router-link>

        <div class="tex">
          <h2>{{item.title}}</h2>
          <p>{{item.times}}</p>
          <p>{{item.files}}</p>
        </div>
      </div>
      <div class="box_a-" v-for="item in boxLists" :key="item.id">
        <router-link to="/Home/newsss">
          <img
            width="100%"
            src="http://www.cn-hydroponics.com/uploadfile/2017/1216/20171216013721970.jpg"
            alt
          />
        </router-link>
        <div class="tex">
          <h2>{{item.titles}}</h2>
          <p>{{item.timess}}</p>
          <p>{{item.filess}}</p>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      boxList: [
        {
          title: "不断增长的环境",
          times: "由管理员 - 2018 - 03 - 19",
          files: "让你的成长室成为植物天堂"
        }
      ],
      boxLists: [
        {
          titles: "不断增长的环境",
          timess: "由管理员 - 2018 - 03 - 19",
          filess: "让你的成长室成为植物天堂"
        }
      ],
      pageCurrent:1
    };
  },
  created() {
    this.$axios.get("http://orcahrd.natapp1.cc/YaRui/findProductByProductCenterId.do",{
      params:{
        pageCurrent:this.pageCurrent
      },
    }).then((res)=>{
      console.log(res)
    })
  },
 
};
</script>


<style scoped>
.box {
  margin: 20px 0;
  color: gray;
}

.box_a {
  width: 1200px;
  height: 415px;
  margin: 0 auto;
  display: flex;
}
.box_a- {
  width: 370px;
  height: 395px;
  margin: 0 10px;
  text-justify: 40px;
}

.tex {
  width: 370px;
  height: 97.49px;
  margin-top: 10px;
  line-height: 35px;
}
.tex p {
  color: rgb(99, 212, 127);
}
</style>
