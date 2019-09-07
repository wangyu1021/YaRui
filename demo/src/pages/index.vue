<template>
  <div class="home">
    <div class="trotting-img">
      <el-carousel indicator-position="outside" height="548px">
        <el-carousel-item v-for="(item,index) in carouselList" :key="index">
          <img style="height:548px" :src="item.imageAddress" alt="">
        </el-carousel-item>
      </el-carousel>
    </div>
    <div class="content-al">

      <div class="wrap flex">
        <div class="wrap-list">
          <a class="list1" href="javascript">
            <p>补光灯</p>
          </a>
        </div>
        <div class="wrap-list">
          <a class="list2" href="javascript">
            <p>促进增长</p>
          </a>
        </div>
        <div class="wrap-list">
          <a class="list3" href="javascript">
            <p>节能</p>
          </a>
        </div>
        <div class="wrap-list">
          <a class="list4" href="javascript">
            <p>双赢的好处</p>
          </a>
        </div>
      </div>
    </div>

    <div class="product_box">
      <ul class="product_tab flex">
        <li v-for="(item,index) in TabList" :class="tabIndex==index?'active':''" @mouseover="tabChange(item,index)" :key="index">{{item.classification}}</li>
      </ul>
      <div class="to_left slider_icon flex flex-vc flex-hc" @click="toTeft()">
        <a class="sPrev" href="javascript:void(0)"></a>
      </div>
      <div class="to_right slider_icon flex flex-vc flex-hc" @click="toRight()">
        <a class="sNext" href="javascript:void(0)"></a>
      </div>
      <div style="width:1150px;overflow: hidden;margin:30px auto">
        <ul class="content-category-con-r" :style="sliderValue">
          <li class="product_item" v-for="(item,index) in productList.records" @click="rtproDet(item, index)"  @mouseover="show(index)" @mouseout="showone(index)"  :key="index">
             <img :src="item.image" alt=""   >
            <div :class="{active1:tr&&index==current}">
              <a href="javascript">{{item.introduction}}</a>
            </div>
          </li>
        </ul>
      </div>
    </div>

    <div class="main-con">
      <div class="main-box flex">
        <div class="main-list">
          <img src="http://www.cn-hydroponics.com/uploadfile/2018/0109/20180109024507603.png" alt="">
          <h5>质量保证</h5>
          <p>每个生产细节都有专业的质量控制。</p>
        </div>
        <div class="main-list">
          <img src="http://www.cn-hydroponics.com/uploadfile/2018/0109/20180109024530537.png" alt="">
          <h5>非常棒的服务</h5>
          <p>专业的客户服务24小时在线为您解决任何问题</p>
        </div>
        <div class="main-list">
          <img src="http://www.cn-hydroponics.com/uploadfile/2018/0109/20180109024545396.png" alt="">
          <h5> 专业制造商</h5>
          <p>拥有经验丰富的设计，研究和生产团队的专业生长灯具制造商。</p>
        </div>
      </div>

    </div>
    <div class="main-bottom">
      <div class="txt flex">
        <div style="width:900px;">
          <p>有什么问题吗？</p>
          <h6>请及时与我们联系，我们会有人来处理。</h6>
        </div>
        <div class="link" style="line-height: 140px;margin-top: 58px;">
          <router-link to="/Home/relationUs">联系我们 &nbsp;+</router-link>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {

  data() {
    return {
      currIndex: 0,
      productList: [],
      TabList: [],
      carouselList: [],
      tabIndex: 0,
      pageCurrent: 1,
      tr: false,
      current: 0,
    }
  },
  computed: {
    sliderValue() {
      return "transform:translate(" + -(this.currIndex * 287.5) + "px)";
    }
  },
  mounted() {
    this.getcarouselList(),
    this.getTabList()
  },
  methods: {
    //图片轮播
    getcarouselList() {
      let that = this
      this.$axios.get('http://orcahrd.natapp1.cc/YaRui/index/findShuffling.do')
        .then(function(res) {
          console.log(res.data.shuffling,'res.data')
          that.carouselList = res.data.shuffling
        })
    },
    //tab获取
    getTabList() {
      let that = this
      this.$axios.get('http://orcahrd.natapp1.cc/YaRui/product/findProductCenter.do')
        .then(function(res) {
          that.TabList = res.data.productCenterList
          that.getproductList()
        })

    },
    //获取商品列表
    getproductList(item) {
      let that = this
      this.$axios.get('http://orcahrd.natapp1.cc/YaRui/product/findProductByProductCenterId.do?', {
        params: {
          id: item && item.id || that.TabList[0].id,
          pageCurrent: item && item.id ||that.pageCurrent
        }
      })
        .then(function(res) {
          that.productList = res.data.data
        })
    },

    tabChange(item, index) {
      this.tabIndex = index
      this.getproductList(item)
    },

    toTeft() {
      if (this.currIndex > 0) {
        this.currIndex--;
      }

    },
    toRight() {
      const length = this.productList.length
      if (this.currIndex < length - 1) {
        this.currIndex++;
      }
    },
    show(index) {
      this.tr = true
      this.current = index
    },
    showone() {
      this.tr = false
      this.current = null
    },
    rtproDet(item, index) {
      console.log(this.productList.pageCurrent,'this.productList.pageCurrent111')
      console.log(item.id,'item.id')
     this.$router.push({ path: '/Home/productDetails', query: { pageCurrent:this.productList.pageCurrent,id:item.productcenterId } });
    }
  }
}
</script>
<style scoped lang="less">
@keyframes mymove {
  from {
    opacity: 0;
    transform: translateY(150px)
  }
  to {
    opacity: 1;
    transform: translateY(0px)
  }
}

.product_item {
  width: 270px;
  height: 190px;
  position: relative;
  float: left;
  margin: 0 13px;
  text-align: center;
      line-height: 190px;
  img {
    width: 100%;
    height: 100%;
  }
  .active1 {
    width: 270px;
    height: 190px;
    background-color: rgba(0, 146, 63, 0.5);
    position: absolute;
    line-height: 190px;
    top: 0;
    left: 0;
  }

  .trotting-img {
    width: 100%;
    text-align: center;
  }

  .el-carousel__item {
    img {
      color: #475669;
      font-size: 18px;
      opacity: 0.75;
      line-height: 584px;
      margin: 0;
    }
  }
}

.el-carousel__item:nth-child(2n) {
  background-color: #99a9bf;
}

.el-carousel__item:nth-child(2n+1) {
  background-color: #d3dce6;
}

.el-carousel .el-carousel__container {
  height: 548px;
}


.content-al {
  width: 1200px;
  margin: auto;
}

.wrap-list {
  width: 170px;
  text-align: center;
  height: 186px;
  margin: 28px 63px;
  transition: 0.1s;

  p {
    padding: 125px 0 0 0;
    font-size: 18px;
    color: #666666;
    &:hover {
      color: #62BB69
    }
  }
  a {
    display: block;
    height: 186px;
    width: 170px;
  }
  .list3 {
    background: url(http://www.cn-hydroponics.com/statics/huidaxin/images/icon4_05.jpg) no-repeat center 31px;
  }


  .list1 {
    background: url(http://www.cn-hydroponics.com/statics/huidaxin/images/icon4_03.jpg) no-repeat center 31px;
    z-index: 999;
  }

  .list2 {
    background: url(http://www.cn-hydroponics.com/statics/huidaxin/images/icon4_13.jpg) no-repeat center 31px;
  }

  .list4 {
    background: url(http://www.cn-hydroponics.com/statics/huidaxin/images/icon4_11.jpg) no-repeat center 31px;
  }
}


.main-con {
  height: 450px;
  background: url(../assets/imgs/list-bg_02.jpg) no-repeat center;
  padding-top: 133px;
  .main-list {
    width: 370px;
    height: 268px;
    background-color: #fff;
    margin: 0 15px;
    text-align: center;
    animation-name: mymove;
    animation-duration: .8s;
    img {
      margin-top: -47px;
    }
    h5 {
      font-size: 24px;
      color: #666;
      font-weight: 300;
      margin-top: 20px;
    }
    p {
      font-size: 14px;
      color: #999;
      margin: 20px 40px;
      line-height: 24px;
    }
    &:hover h5 {
      color: #5DB661
    }
    &:hover p {
      color: #5DB661
    }
  }
}


.main-box {
  width: 1200px;
  margin: auto;
}


.main-bottom {
  height: 140px;
  background: #5db661;
  .txt {
    width: 1200px;
    margin: auto;
    color: #fff;
    height: 112px;
    padding-left: 84px;
    background: url(../assets/imgs/question_03.jpg) no-repeat left 45px;
    animation-name: mymove;
    animation-duration: .8s;
    p {
      display: block;
      font-size: 18px;
      padding: 45px 0 12px;
    }
    h6 {
      font-size: 24px;
      font-weight: 500;
    }
  }
}


.link a {
  font-size: 18px;
  color: #fff;
  text-transform: uppercase;
  display: block;
  width: 176px;
  text-align: center;
  height: 46px;
  line-height: 46px;
  border: 2px solid #fff;
  right: 0;
  top: 48px;
}

.slideGroups {
  width: 1200px;
  margin: auto;
}

.product_box {
  width: 100%;
  overflow: hidden;
  padding: 5px 0;
  position: relative;
  margin: 0 auto;
  .sPrev {
    height: 68px;
    width: 68px;
    background: #ff0000 url(../assets/imgs/btn_03.jpg) no-repeat center;
    position: absolute;
    top: 65px;
  }
  .sNext {
    height: 68px;
    width: 68px;
    background: #ff0000 url(../assets/imgs/btn_05.jpg) no-repeat center;
    position: absolute;
    top: 65px;
  }
  .to_left {
    left: 45px;
    position: absolute;
    z-index: 9;
    i {
      margin-left: 13px;
    }
  }
  .to_right {
    right: 45px;
    position: absolute;
    z-index: 9;
    i {
      margin-right: 13px;
    }
  }
  li {
    margin: 0 20px 10px 0;
  }
  .content-category-con-r {
    width: 5000px;
    margin: 0 auto;
    overflow: hidden;
    position: relative;
    transition: all 2s;
    -webkit-transition: all 1s;
  }
  .product_tab {
    width: 1150px;
    margin: 20px auto;
    li {
      display: inline-block;
      width: 190px;
      margin: 0 2px;
      height: 57px;
      line-height: 57px;
      text-align: center;
      background: #efefef;
      cursor: pointer;
      font-size: 15px;
      color: #666;
    }
    .active {
      color: #fff;
      background-color: #5DB661
    }
  }
}
</style>
