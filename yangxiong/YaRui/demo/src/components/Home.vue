<template>
  <div id="Home">
    <Head></Head>
    <Navigation></Navigation>

    <!-- <div>
      <div class="navigation">
        <div class="content">
          <ul class="flex">
            <li @click="checkRouter(item)" v-for="(item,index) in routerList" :key="index">
              <a>{{item.routerName}}</a>
            </li>
          </ul>
        </div>
      </div>
    </div> -->
    <router-view />
    <Foot></Foot>
  </div>
</template>

<script>
import Head from "../components/head";
import Foot from "../components/foot";
import Navigation from "../components/navigation";
export default {
  name: "Home",
  components: {
    Head,
    Foot,
    Navigation
  },
  // data() {
  //   return {
  //     routerList: [
  //       {
  //         routerName: "首页",
  //         routerUrl: "/Home/index"
  //       },
  //       {
  //         routerName: "关于我们",
  //         routerUrl: "/Home/about"
  //       },
  //       {
  //         routerName: "产品中心",
  //         routerUrl: "/Home/product"
  //       },
  //       {
  //         routerName: "新闻中心",
  //         routerUrl: "/Home/news"
  //       },
  //       {
  //         routerName: "加入我们",
  //         routerUrl: "/Home/joinUs"
  //       },
  //       {
  //         routerName: "联系我们",
  //         routerUrl: "/Home/relationUs"
  //       }
  //     ]
  //   };
  // },
  // methods: {
  //   checkRouter(item) {
  //     this.$router.push(item.routerUrl);
  //   }
  // }
};
</script>

<style>
.content li {
  width: 200px;
  height: 60px;
  line-height: 60px;
  text-align: center;
  cursor: pointer;
}

.content {
  margin: auto;
  width: 1200px;
}

.content ul li:hover {
  background-color: #089a47;
}

.content ul li a {
  color: rgb(254, 255, 254);
}

.navigation {
  background-color: #4cb050;
}
</style>
