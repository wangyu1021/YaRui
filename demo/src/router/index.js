import Vue from "vue";
import Router from "vue-router";

const About = resolve => require(["../pages/about.vue"], resolve);
const JoinUs = resolve => require(["../pages/joinUs/joinUs.vue"], resolve);
const JoinUsCatid = resolve => require(["../pages/joinUs/joinUsCatid.vue"], resolve);
const News = resolve => require(["../pages/news.vue"], resolve);
const Product = resolve => require(["../pages/product.vue"], resolve);
const RelationUs = resolve => require(["../pages/relationUs.vue"], resolve);
const Index = resolve => require(["../pages/index.vue"], resolve);
const ProductDetails = resolve => require(["../pages/product/productDetails.vue"], resolve);
const newss = resolve => require(["../pages/News/newss.vue"], resolve);
const newsss = resolve => require(["../pages/News/newsss.vue"], resolve);
const login = resolve => require(["../pages/login.vue"], resolve);
const register = resolve => require(["../pages/register.vue"], resolve);
const Home = resolve => require(["../components/Home.vue"], resolve);


Vue.use(Router);

export default new Router({
  routes: [
    {
      path:"/Home",
      name:"Home",
      component:Home,
      children: [
        {
          path: "index",
          name: "Index", //网站首页
          component: Index,
        },
        {
          
          path: "about", //关于我们
          name: "About",
          component: About
        },
        {
          path: "joinUs", //加入我们
          name: "JoinUs",
          component: JoinUs
        },
        {
          path: "news", //新闻中心
          name: "News",
          component: News
        },
        {
          path: "product", //产品中心
          name: "Product",
          component: Product
        },
        {
          path: "relationUs", //联系我们
          name: "RelationUs",
          component: RelationUs
        },
        {
          path: "joinUsCatid",
          name: "JoinUsCatid",
          component: JoinUsCatid
        },

        { path: "newss", name: "newss", component: newss },
        { path: "newsss", name: "newss", component: newsss }
      ]
     },

    {
      path: "/",
      name: "Home",
      component: Home,
      redirect:"/Home/Index",
   },
   {
    path: "/productDetails",
    name: "ProductDetails",
    component: ProductDetails
},
    {
      path:"/login", name:"login",component:login
    },
    {
      path:"/register", name:"register",component:register
    },
  ]
});
