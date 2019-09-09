<template>
    <div class="ins-main">
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
        <div class="tit">
            <h4>{{arr.title}}</h4>
            <p>薪酬：
                <span class="gray">$ {{arr.minSalary}}-{{arr.maxSalary}}</span>
                <span>- 发布时间
                    <span class="bk-gray">{{utils.transformTime(arr.createdTime)}}</span>
                </span>
            </p>
        </div>
        <div class="tit-list">
            <p>
                <span class="inblock">地点：</span>
                <span class="gray">{{arr.address}}</span>
            </p>
            <p>
                <span class="inblock">工作级别：</span>
                <span class="gray">{{arr.level}}</span>
            </p>
            <p>
                <span class="inblock">工作类型：</span>
                <span class="gray">{{arr.type}}</span>
            </p>
            <p>
                <span class="inblock">招聘：</span>
                <span class="gray">{{arr.number}}人</span>
            </p>
            <p>
                <span class="inblock">教育：</span>
                <span class="gray">{{arr.education}}</span>
            </p>
        </div>
        <div class="list-ms">
            <h6>职位描述</h6>
            <ul>
                <li v-for="(item,index) in arr1" :key="index">{{item}}</li>
            </ul>
        </div>
        <div class="list-ms">
            <h6>工作规范</h6>
            <ul>
                <li v-for="(item1,index) in arrlist" :key="index">{{item1}}</li>
            </ul>
        </div>
        <div class="bot">
            <h5>职能类别：
                <span class="gray">{{arr1[0]}}</span>
            </h5>
            <p>
                <span>TAGS</span>
                <span class="badge">OFFICE</span>
                <span class="badge">CLERK</span>
                <span class="badge">接受</span>
                <span class="badge">新鲜的</span>
                <span class="badge">毕业生</span>
            </p>
        </div>
        <div class="apply">
            <p>申请办公室文员工作</p>
            <div class="jia">
                <router-link to=''>工作申请</router-link>
            </div>
        </div>
    </div>
</template>

<script>
export default {

    data() {
        return {
            joinlist: [],
            arr: {},
            arr1: {},
            arrlist:{}
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
                    for (let i of that.joinlist) {
                        that.arr = i
                        that.arr1 = that.arr.requirements.split('。')
                        that.arrlist=that.arr.content.split(';')
                    }
                })
        }


    },
}
</script>


<style scoped lang="less">
.gray {
    color: #999
}

.ins-main {
    padding: 0 0 50px;
    width: 1200px;
    margin: 0 auto;
    .breadcrumb {
        height: 90px;
        .el-breadcrumb {
            line-height: 90px;
            font-size: 16px;
        }
    }
    .tit {
        h4 {
            font-size: 36px;
            color: #333;
            font-weight: 300;
            margin-bottom: 10px;
        }
    }
    .tit-list {
        margin: 30px 0;
        p {
            position: relative;
            line-height: 26px;
            font-size: 16px;
            color: #333;
            text-transform: uppercase;
            .inblock {
                display: inline-block;
                width: 100px;
            }
        }
    }
    .list-ms {
        h6 {
            font-size: 20px;
        }
        ul {
            margin: 30px 0;
        }
        li {
            font-size: 16px;
            color: #999;
            margin: 10px 0;
            padding-left: 30px;
            background: url(../../assets/imgs/lit3_03.jpg) no-repeat 12px center;
        }
    }
    .bot {
        padding-bottom: 50px;
        border-bottom: 1px solid #dcdcdc;
        h5 {
            margin: 20px 0;
            color: #050505;
            font-weight: 300;
            text-transform: uppercase;
            font-size: 20px;
        }
        p {
            font-size: 20px;
            height: 30px;
            line-height: 30px;
            display: inline-block;
            .badge {
                background-color: #4CB050;
                padding: 5px 10px;
                font-size: 14px;
            }
        }
    }
    .apply {
        padding-bottom: 30px;
        p {
            font-size: 20px;
            color: #333;
            margin: 16px 0;
        }
        .jia {
            background-color: #666666;
            width: 270px;

            a {
                height: 50px;
                line-height: 50px;
                width: 270px;
                display: block;
                text-align: center;
                margin: 20px 0 0;
                font-size: 16px;
                color: #fff;
                background: url(../../assets/imgs/join_07.jpg) no-repeat;
                background-position: 235px 15px;
            }
        }
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
a {
  text-decoration: none;
}
</style>
