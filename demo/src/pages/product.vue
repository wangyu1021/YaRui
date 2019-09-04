<template>
  <div>
    <!--二级导航栏-->
    <div class="conter">
      <ul>
        <li>
          <a href="#">生长灯具</a>
        </li>
        <li>
          <a href="#">成长数字镇流器</a>
        </li>
        <li>
          <a href="#">种植碳空气过滤器</a>
        </li>
        <li>
          <a href="#">种植绳子棘轮</a>
        </li>
        <li>
          <a href="#">种植风扇</a>
        </li>
        <li>
          <a href="#">五金配件</a>
        </li>
      </ul>
    </div>
    <div class>
      <ul>
        <li></li>
      </ul>
    </div>
    <div class="navlet">
      <!--左边导航栏-->
      <ul>
        <li>产品中心</li>
        <li v-for="(item,index) in arr" @click="logan(item,index)" :key="index">
          <span>{{item.classification}}</span>
        </li>
      </ul>
    </div>

    <div class="conterone">
      <ul>
        <li v-for="(time,index) in obje" :key="index">
          <p>{{time.name}}</p>
        </li>
      </ul>
    </div>
  </div>
</template>
		
<script>
export default {
  data: function() {
    return {
      arr: [],
      obje: {},
      newuser: {
        pageCurrent: "",
        id: ""
      },
      arrone: [],
      arrtwo: {}
    };
  },
  mounted() {
    this.logan();
  },
  methods: {
    logan: function(item, index) {
      this.$axios
        .get("http://orcahrd.natapp1.cc/YaRui/product/findProductCenter.do")
        .then(res => {
          this.arr = res.data.productCenterList;
          for (let i of this.arr) {
          }
          for (let y of this.arr) {
            this.arrone.unshift(y.id);
          }
          if (index == 0) {
            const _this = this;
            this.newuser.id = this.arrone[5];
            this.newuser.pageCurrent = this.arrone[5];
            this.$axios
              .get(
                "http://orcahrd.natapp1.cc/YaRui/product/findProductByProductCenterId.do",
                {
                  params: {
                    pageCurrent: this.newuser.pageCurrent,
                    id: this.newuser.id
                  }
                }
              )
              .then(res => {
                this.obje = res.data.data.records;
                console.log(res.data.data.records);
              });
          } else if (index == 1) {
            this.newuser.id = this.arrone[4];
            this.newuser.pageCurrent = this.arrone[4];
            this.$axios
              .get(
                "http://orcahrd.natapp1.cc/YaRui/product/findProductByProductCenterId.do",
                {
                  params: {
                    pageCurrent: this.newuser.pageCurrent,
                    id: this.newuser.id
                  }
                }
              )
              .then(res => {
                this.obje = res.data.data.records;
                console.log(res.data.data.records);
              });
          } else if (index == 2) {
            this.newuser.id = this.arrone[3];
            this.newuser.pageCurrent = this.arrone[3];
          } else if (index == 3) {
            this.newuser.id = this.arrone[2];
            this.newuser.pageCurrent = this.arrone[2];
          } else if (index == 4) {
            this.newuser.id = this.arrone[1];
            this.newuser.pageCurrent = this.arrone[1];
          } else {
            this.newuser.id = this.arrone[0];
            this.newuser.pageCurrent = this.arrone[0];
          }
          console.log(this.newuser.id, this.newuser.pageCurrent);
        })
        .catch(err => {
          console.log("错误");
        });
    }
  }
};
</script>


<style scoped>
.navlet {
  margin-top: 80px;
  padding-left: 80px;
}
.navlet li {
  width: 270px;
  height: 59px;
  border-bottom: 1px solid rgb(220, 220, 220);
  line-height: 59px;
  padding-left: 20px;
}
.navlet li:hover {
  color: rgb(76, 176, 80);
}
.navlet li:nth-last-child(7) {
  width: 270px;
  height: 80px;
  background-color: rgb(76, 176, 80);
  padding-left: 20px;
  line-height: 80px;
  color: rgb(255, 255, 255);
  font-size: 26px;
}
.conterone {
  width: 900px;
  height: 900px;
  border: 1px solid red;
  float: right;
  margin-top: -434px;
  margin-right: 50px;
}
.conterone ul {
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
}
.conterone li {
  width: 270px;
  height: 190px;
  border: 1px solid red;
}
.conterone p {
  text-align: center;
  padding-top: 160px;
}
</style>
