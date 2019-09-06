<template>
    <div class="ins-main">
        <div class="breadcrumb">
            <el-breadcrumb separator-class="el-icon-arrow-right">
                <el-breadcrumb-item :to="{ path: '/' }">主页</el-breadcrumb-item>
                <el-breadcrumb-item :to="{ path: '/joinUs' }">加入我们</el-breadcrumb-item>
            </el-breadcrumb>
        </div>
        <div class="tit">
            <h4>OFFICE CLERK /接受新鲜的毕业生</h4>
            <p>薪酬：
                <span class="gray">$ 8000-10,000</span>
                <span>- 发布时间
                    <span class="bk-gray">Sep-03-2019</span>
                </span>
            </p>
        </div>
        <div class="tit-list">
            <p>
                <span class="inblock">地点：</span>
                <span class="gray">伦敦金融城</span>
            </p>
            <p>
                <span class="inblock">工作级别：</span>
                <span class="gray">SENIOR</span>
            </p>
            <p>
                <span class="inblock">工作类型：</span>
                <span class="gray">永久性</span>
            </p>
            <p>
                <span class="inblock">招聘：</span>
                <span class="gray">五个人</span>
            </p>
            <p>
                <span class="inblock">教育：</span>
                <span class="gray">大学</span>
            </p>
        </div>
        <div class="list-ms">
            <h6>职位描述</h6>
            <ul>
                <li>主要负责客户接待，登记，礼貌和微笑访问客户。</li>
                <li>负责中心的打印和复印。</li>
                <li>维护和监控中心的健康状况。</li>
                <li>精通工作，精益求精和其他办公软件。</li>
                <li>做六，一，早，晚班。您可以在周一至周五休息一天。</li>
                <li>一个好人可以进行促销。</li>
                <li>相关经验者优先考虑。</li>
            </ul>
        </div>
        <div class="list-ms">
            <h6>工作规范</h6>
            <ul>
                <li>主年龄20-35岁，中学以上学历;</li>
                <li>计算机技能，良好的沟通技巧和责任感;</li>
                <li>执行力强，细致有条理;</li>
                <li>工厂工作经验者优先。</li>
            </ul>
        </div>
        <div class="bot">
            <h5>职能类别：
                <span class="gray">行政经理/主管/办公室主任行政助理/助理</span>
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
            arr:[]
        }
    },

  mounted() {
    let that = this
    this.$axios.get('http://orcahrd.natapp1.cc/YaRui/recruitments/findRecruitment.do')
      .then(function(res) {
        console.log(res.data.data)
        that.arr=res.data.data


        // that.listday = res.data.dynamicList
      })
  }
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
</style>
