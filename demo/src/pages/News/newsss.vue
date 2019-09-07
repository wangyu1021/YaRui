<template>
  <div class="newsss">
    <div class="container" v-for="item in newsssLista" :key="item.id">
      <div class="container-top">
        <div class="container-top-title">
          <h1>植物补充剂的必要性1</h1>
          <p>由 ADMIN - 2019-09-03</p>
         </div>
 
        <img style="margin-top:20px;" src="http://www.cn-hydroponics.com/uploadfile/2018/0104/20180104030425506.jpg" alt />
         <div class="tops">{{item.tops}}</div>

        <div class="texts">
         <dl v-for="items in item.list" :key="items.id">
          <dt>{{items.title}}</dt>
          <dd class="magins">{{items.file}}</dd>
        </dl>
        </div>
      
      </div>
      <div class="container-center">
         <h4>有关</h4>
          <div class="Img">
              <img width="100%" src="http://www.cn-hydroponics.com/uploadfile/2018/0319/20180319112114542.jpg" alt="">
              <div class="Imgs">
                  <img src="http://www.cn-hydroponics.com/uploadfile/2017/1216/20171216013721970.jpg" alt="">
                  <p>pl的重要性....</p>
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
      newsssLista: []
    };
  },
  created() {
    this.$axios
      .get("https://www.easy-mock.com/mock/5d6df8e1acca380c847adc32/shao/texts")
      .then(res => {
        console.log(res.data.newsssList);
        this.newsssLista = res.data.newsssList;
      });
  }
};
</script>

<style  scoped>
.container {
  width: 1200px;
  margin: 50px auto;
  margin-top: 60px;
}
.container-top {
  height: 980px;
  font-size: 14px;
}
.container-foot {
  height: 998px;
}
.container-top-title {
  width: 100%;
  text-align: center;
}


.tops {
  margin-top: 20px;
}
.texts{
    display: flex;
    flex-direction: column;
    margin-top: 30px;
    line-height: 35px;
}
.container-center {
  width: 100%;
  height: 884px;
  margin-top: 137px;
}
.title {
  width: 100%;
  text-align: center;
}
.Img{
    position: relative;
}
.Imgs{
    position: absolute;
    top:0px;
    left: 410px;
    text-align: center;
}

</style>