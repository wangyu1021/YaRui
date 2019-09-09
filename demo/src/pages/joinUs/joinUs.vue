<template>
  <div class="join-us">
    <div class="ios-nav">
      <ul>
        <li>
          <router-link :to="{name:'Index'}" tag="a">首页 > </router-link>
        </li>
        <li>
          <router-link :to="{name:'JoinUs'}" tag="a">加入我们 > </router-link>
        </li>
      </ul>
    </div>
    <div class="join-zw">
      <p>目前有20个职位列表</p>
    </div>
    <div class="list flex">
      <div class="list-text">
        <p>薪酬：
          <span>$ {{arr.minSalary}}-{{arr.maxSalary}}</span>
          <span>- 发布时间
            <span class="bk-gray">{{utils.transformTime(arr.createdTime)}}</span>
          </span>
        </p>
        <p class="clerk">{{arr.title}}</p>
        <p>{{arr.content}}</p>
      </div>
      <div class="list-btn">
        <div class="btn-yue" style="background-color: #4CB050;">
          <div class="next">
            <router-link style="display: inline-block;width: 270px;" to="/Home/joinUsCatid">阅读更多</router-link>
          </div>
        </div>
        <div class="btn-yue" style="background-color: #666666;">
          <div class="jia">
            <router-link style="display: inline-block;width: 270px;" to=''>工作申请</router-link>
          </div>
        </div>
      </div>
    </div>
    <div class="page-num"></div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      joinlist: [],
      arr: {}
    }
  },
  mounted() {
    this.getTabList()
  },
  methods: {
    getTabList() {
      let that = this
      this.$axios.get('http://www.orchardteam.com/YaRui/recruitments/findRecruitment.do')
        .then(function(res) {
          that.joinlist = res.data.data
          console.log(res.data.data, 'res.data')
          for (let i of that.joinlist) {
            that.arr = i
          }
        })
    }
  }
}
</script>
<style scoped lang="less">
.join-us {
  width: 1200px;
  margin: 0 auto;
  .breadcrumb {
    height: 90px;
    .el-breadcrumb {
      line-height: 90px;
      font-size: 16px;
    }
  }
  .join-zw {
    p {
      font-size: 36px;
      padding-bottom: 37px;
    }
  }

  .list {
    padding: 30px 0;
    border-bottom: 1px solid #dcdcdc;
    border-top: 1px solid #dcdcdc;
    .list-text {
      width: 930px;
      .clerk {
        font-size: 22px;
        margin: 15px 0;
      }
      .bk-gray {
        background-color: #C8C8C8;
      }
    }
    .list-btn {
      .btn-yue {
        height: 50px;
        width: 270px;
        text-align: center;
        line-height: 50px;
        margin-top: 20px;
        .next {
          background: url(../../assets/imgs/join_03.jpg) no-repeat;
          background-position: 240px 15px;
          a {
            color: #fff;
          }
        }
        .jia {
          background: url(../../assets/imgs/join_07.jpg) no-repeat;
          background-position: 235px 15px;
          a {
            color: #fff;
          }
        }
      }
    }
  }
  .page-num {
    border-top: 1px solid #e2e2e2;
    padding: 50px 0 40px;
    text-align: center;
    margin-top: 60px;
  }
}

.ios-nav ul {
  display: flex;
  line-height: 90px;
}

.ios-nav li a {
  color: black;
}

.ios-nav {
  height: 90px;
}
</style>
