<template>
  <div class="home">
    <div class="trotting-img">
      <el-carousel indicator-position="outside" height="500px"> 
        <el-carousel-item v-for="(item,index) in carouselList" :key="index">
          <img width="100%" height="100%" :src="item.img" alt />
        </el-carousel-item>
      </el-carousel>
    </div>
    <div class="content-al">
      <div class="wrap flex">
        <div class="wrap-list">
          <a href="javascript">
           <img  src="">
            <p>补光灯</p>
           </a>
       </div>
        <div class="wrap-list"></div>
        <div class="wrap-list"></div>
        <div class="wrap-list"></div>
      </div>
    </div>

    <div class="product_box">
      <ul class="product_tab flex">
        <li v-for="(item,index) in productList" :key="index">Grow Light Fixture</li>
      </ul>
      <div class="to_left slider_icon flex flex-vc flex-hc" @click="toTeft()">
        <a class="sPrev" href="javascript:void(0)"></a>
      </div>
      <div class="to_right slider_icon flex flex-vc flex-hc" @click="toRight()">
        <a class="sNext" href="javascript:void(0)"></a>
      </div>
      <div style="width:1150px;overflow: hidden;margin:auto">
        <ul class="content-category-con-r" :style="sliderValue">
          <li class="product_item" v-for="(item,index) in productList" :key="index">
            <img
              src="http://www.cn-hydroponics.com/uploadfile/2018/0116/20180116040404291.jpg "
              alt
            />
          </li>
        </ul>
      </div>
    </div>

    <div class="main-con">
      <div class="main-box flex">
        <div class="main-list">
          <img src="http://www.cn-hydroponics.com/uploadfile/2018/0109/20180109024507603.png" alt />
          <h5>质量保证</h5>
          <p>每个生产细节都有专业的质量控制。</p>
        </div>
        <div class="main-list">
          <img src="http://www.cn-hydroponics.com/uploadfile/2018/0109/20180109024530537.png" alt />
        </div>
        <div class="main-list">
          <img src="http://www.cn-hydroponics.com/uploadfile/2018/0109/20180109024545396.png" alt />
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
          <a href="javascript">联系我们 &nbsp;+</a>
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
      productList: [{}, {}, {}, {}, {}, {}],
      carouselList: [
        {
          img:
            "http://cn.cn-hydroponics.com/uploadfile/2018/0122/20180122053719604.jpg"
        },
        {
          img:
            "http://cn.cn-hydroponics.com/uploadfile/2018/0118/20180118100014303.jpg"
        },
        {
          img:
            "http://cn.cn-hydroponics.com/uploadfile/2018/0122/20180122060035138.jpg"
        }
      ]
    };
  },
  computed: {
    sliderValue() {
      return "transform:translate(" + -(this.currIndex * 287.5) + "px)";
    }
  },
  mounted() {
    // let that = this
    // this.$axios.get('http://orcahrd.natapp1.cc/YaRui/enterprise/findInformation.do')
    //   .then(function(res) {
    //     console.log(res.data)
    //     that.listday = res.data.dynamicList
    //   })
  },
  methods: {
    toTeft() {
      if (this.currIndex > 0) {
        this.currIndex--;
      }
    },
    toRight() {
      const length = this.productList.length;
      if (this.currIndex < length - 1) {
        this.currIndex++;
      }
    }
  }
};
</script>


<style scoped lang="less">

.product_item {
  width: 270px;
  height: 190px;
  position: relative;
  float: left;
  margin: 0 13px;
  text-align: center;
  img {
    width: 100%;
  }
}

.trotting-img {
  width: 100%;
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


.el-carousel__item:nth-child(2n) {
  background-color: #99a9bf;
}

.el-carousel__item:nth-child(2n + 1) {
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
  width: 173px;
  text-align: center;
  height: 202px;
  margin: 28px 63px;
  transition: 0.1s;
  border: 1px solid red;
  p {
    font-size: 18px;
    color: #666666;
  }


    &:hover {
      background-color: #5db661;
      p { 
        color: #fff;
      }
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
      padding: 20px 25px;
      margin: 0 5px;
      text-align: center;
      background: #efefef;
      cursor: pointer;
      font-size: 15px;
      color: #666;
      &:hover {
        background: #5db661;
        color: #fff;
      }
    }
  }
}
</style>
