<template>
    <div class="navigation">
        <div class="content">
            <ul class="flex">
               <li><router-link :to="{name:'Index'}">首页</router-link></li>
               <li><router-link :to="{name:'About'}">关于我们</router-link></li>
               <li @mouseover="logan()" @mouseout="loganone()"><router-link :to="{name:'Product'}">产品中心</router-link></li>
               <li><router-link :to="{name:'News'}">新闻中心</router-link></li>
               <li><router-link :to="{name:'JoinUs'}">加入我们</router-link></li>
               <li><router-link :to="{name:'RelationUs'}">联系我们</router-link></li>
            </ul>
        </div>
    </div>
</template>

<script>
export default {
    data() {
     return {
      routerList: [
        {
          routerName: "首页",
          routerUrl: "/Home/index"
        },
        {
          routerName: "关于我们",
          routerUrl: "/Home/about"
        },
        {
          routerName: "产品中心",
          routerUrl: "/Home/product"
        },
        {
          routerName: "新闻中心",
          routerUrl: "/Home/news"
        },
        {
          routerName: "加入我们",
          routerUrl: "/Home/joinUs"
        },
        {
          routerName: "联系我们",
          routerUrl: "/Home/relationUs"
        }
      ]
    };

    },
    methods: {
        checkRouter(item) {
            this.$router.push(item.routerUrl)
        },
        logan:function(){
        	this.$store.state.count=true
        },
        loganone:function(){
        	this.$store.state.count=false
        }
    }
}
</script>

<style scoped>
.content li {
    width: 200px;
    height: 60px;
    line-height: 60px;
    text-align: center;
    cursor: pointer;
    font-size:18px;
    font-weight: bold;
    font-family: arial;
}

.content {
    margin: auto;
    width: 1200px;
}

.content ul li:hover {
    background-color: #089A47;
   
}

.content ul li a {
   color: rgb(254, 255, 254);
   text-decoration: none;
}

.navigation {
    background-color: #4CB050;
    height: 61px;
}
</style>
