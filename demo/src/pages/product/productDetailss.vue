<template>
    <div class="main-details">
                <div class="ios-nav">
        	<ul>
        		<li><router-link :to="{name:'Index'}" tag="a">首页 > </router-link></li>
				<li><router-link :to="{name:'Product'}" tag="a">产品中心 > </router-link></li>
				<li>{{arrone}}</li>
        	</ul>
        </div>
        <h4>{{arr.name}}</h4>
        <div class="pro-detail-con flex flex-hs">
            <div class="detail-le">
                <img :src="arr.image">
            </div>
            <div class="detail-ri">
                <div class="detail-top" @click="toTop()"></div>
                <div class="detail-main" :style="slider">
                    <ul>
                        <li v-for="(item,index) in detaillist" :key="index">
                            <img :src="item.image" alt="">
                        </li>
                    </ul>
                </div>
                <div class="detail-bott" @click="toBottom()"></div>
            </div>
        </div>
        <div class="description">
            <p>上一篇：
                <span>OE-CMH315W生长Lighit夹具</span>
            </p>
            <p>下一篇：
                <span>CMH950W生长灯具</span>
            </p>
            <div class="tbody-im">
                <img :src="arr.introductionImage">
            </div>
        </div>
        <div class="detail">
            <p>数据处理...</p>
        </div>
    </div>
</template>
<script>
export default {
    data() {
        return {
            detailIndex: 0,
            detaillist: [],
            arr:{},
        }
    },
    mounted() { this.productDetlist() },
    methods: {
        toTop() {
            if (this.detailIndex > 0) {
                this.detailIndex--;
            }

        },
        toBottom() {
            const length = this.detaillist.length
            if (this.detailIndex < length - 1) {
                this.detailIndex++;
            }
        },
        productDetlist() {
            let that = this
            this.$axios.get('http://www.orchardteam.com/YaRui/product/findProductByProductCenterId.do?', {
                params: {
                    pageCurrent: that.$route.query.pageCurrent,
                    id: that.$route.query.id
                }
            })
                .then(function(res) {
                    that.detaillist = res.data.data.records
                    console.log(res.data.data.records)
                    for(let i of that.detaillist){
                        that.arr=i
                    }
                })
        }
    },
    computed: {
        slider() {
            return "transform:translateY(" + -(this.detailIndex * 144) + "px)";
        }
    }

}
</script>

<style scoped lang="less">
.main-details {
    width: 1200px;
    margin: 0 auto;
    padding-bottom: 40px;
    .ios-nav {
        height: 90px;
    }
    h4 {
        font-size: 30px;
        color: #333;
    }
    .pro-detail-con {
        margin: 30px 0;
        .detail-le {
            border: 1px solid #ddd;
            overflow: hidden;
            img {
                display: inline-block;
                transition: 0.3s;
                width: 968px;
                height: 681px;
            }
        }
        .detail-ri {
            width: 170px;
            overflow: hidden;
            position: relative;
            .detail-top {
                background: url(../../assets/imgs/btn5_03.jpg) no-repeat center;
                position: absolute;
                top: 0px;
                right: 0px;
                width: 170px;
                height: 40px;
                z-index: 999;
            }
            .detail-bott {
                background: url(../../assets/imgs/btn5_06.jpg) no-repeat center;
                position: absolute;
                top: 640px;
                right: 0px;
                width: 170px;
                height: 45px;
                z-index: 999;
                margin-bottom: -3px;
            }
            .detail-main {
                height: 600px;
                width: 170px;
                float: left;
                margin-top: 65px;
                transition: all 2s;
                -webkit-transition: all 1s;
                li {
                    width: 168px;
                    height: 144px;
                    margin: 0;
                    overflow: hidden;
                    text-align: center;
                    vertical-align: middle;
                    img {
                        width: 166px;
                        height: 116px;
                        cursor: pointer;
                        border: 1px solid #dddddd;
                    }
                }
            }
        }
    }

    .description {
        background: #f4f4f4;
        padding: 24px 36px 48px 36px;
        p {
            height: 30px;
            line-height: 30px;
            color: #666;
        }
        .tbody-im {
            img {
                display: inline-block;
                width: 716px;
                height: 536px;
            }
        }
    }

    .detail {
        padding-left: 3%;
        margin-top: 30px;
        font-size: 12px;
    }
}
.ios-nav ul{display: flex;line-height:90px;}
.ios-nav li a{color: black;}
</style>