<template>
  <div class="newss">
    <div class="container">
      <div class="container-top">
        <div class="title">
          <h2>不段增长的环境</h2>
          <p>由 ADMIN - 2019-09-03</p>
        </div>
        <p>
          您可以在家中，棚屋或车库的任何地方设置室内种植区。
          以下是一些可能适合的地方的建议，并指出了设置时必须考虑的工厂的一些基本需求。
        </p>
        <p>
          要了解您的植物需要什么，想象一个平静的夏日的花园阳光充足的角落。大多数植物将在英国夏季盛行的条件下生长良好，
          这些条件需要在室内种植区重建。我们将生长条件分为四个标题，即温度，湿度和大气压。
        </p>
        <dl v-for="item in newLists" :key="item.id">
          <dt>{{item.title}}</dt>
          <dd v-for="items in item.list" :key="items.id">
              {{items.title}}
          </dd>
        </dl>
      </div>
      <div class="container-center">
         <h4>有关</h4>
          <div class="Img">
              <img src="http://www.cn-hydroponics.com/uploadfile/2018/0319/20180319112114542.jpg" alt="">
              <div class="Imgs">
                  <img src="http://www.cn-hydroponics.com/uploadfile/2017/1216/20171216013721970.jpg" alt="">
                  <p>pl的重要性....</p>
              </div>
          </div>
      </div>
      <div class="container-foot"></div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      newssList: [
        {
          title: "Light",
          list: [
            {
              title: `Light是您需要考虑的最重要的事情。显然，如果你想在你的地下室种植植物，你必须自己提供所有的光，如果你要重建一个夏日的条件，
              你需要提供很多。幸运的是，现代园艺照明不仅能够以高效和经济的方式实现这一目标。
            人们可以从假设您所选择的种植区域没有任何自然光开始。显然，如果你有一个窗户或天窗，这将减少你必须提供的光量，但在大多数情况下，这并不是特别重要。
            使用自然光还存在其他问题，例如无法控制黑暗时间。在室内种植植物最简单，最有效的方法是在黑暗的地方进行，
         并自己提供所有的光。对于温室种植者来说，使用额外光线的需求仅限于一年中较暗的月份。
          在光的标题下要考虑的另一件事是你的成长区域的反射水平。设计良好的种植室将从其中使用的光中获得最大的益处，并且对于获得可用光的最佳反射非常重要`
            }
          ]
        }
      ],
      newLists:[]
    };
  },
    created() {
      this.$axios.get("https://www.easy-mock.com/mock/5d6df8e1acca380c847adc32/shao/texts").then((res)=>{
          this.newLists = res.data.newssList
        //   console.log(this.newLists)
          
      })
  },
};
</script>

<style scoped>
.container {
  width: 1200px;
  margin: 50px auto;
 }
.container-top {
  width: 100%;
  height: 1142px;
  font-size: 14px;
  line-height: 30px;
}
.container-center {
  width: 100%;
  height: 884px;
  margin-top: 147px;
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
    left: 460px;
    text-align: center;
}
</style>