<template>
  <div>
    <!--二级导航栏-->
    <div class="conter" v-show="this.$store.state.count" @mouseover="dianji()" @mouseout="dianjione()">
     <ul>
     	 <li v-for="(item,index) in arr" @click="logan(item,index)" :key="item.id">
          <span><a href="#">{{item.classification}}</a></span>
        </li>
     </ul>
    </div>
<div class="radio">
	<ul>
		<li><router-link :to="{name:'Index'}" tag="a">首页 > </router-link></li>
		<li><router-link :to="{name:'Product'}" tag="a">产品中心 > </router-link></li>
		<li><a href="#">{{push.classification}}</a></li>
	</ul>
</div>    
<div class="contertwo">    
    <div class="navlet">
      <!--左边导航栏-->
      <ul>
        <li>产品中心</li>
        <li v-for="(item,index) in arr" @click="logan(item,index)" :key="item.id">
          <span>{{item.classification}}</span>
        </li>
      </ul>
    </div>
    <div class="conterone">
      <ul>
      
        <li v-for="(time,index) in obje" @mouseover="show(index)" @mouseout="showone(index)" :key="time.id" @click="loage(index)">
          <div :class="{active:tr&&index==current}"><router-link :to="{name:'ProductDetails'}" tag="a">{{time.introduction}}</router-link></div>
         	<img :src="time.image" />
          <p>{{time.name}}</p>
        </li>
       
      </ul>
    </div>
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
      arrtwo: {},
      num:1,
      tr:false,
      current:0,
      push:"",
      currentone:null,
      objeone:{
      	image:'',
      	introduction:'',
      },
      indexone:[],
      nameone:null,
    }
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
            this.push=this.arr[0]
            this.newuser.pageCurrent = this.num
            this.nameone=this.arr[0].classification
    	localStorage.setItem("nameone",JSON.stringify(this.nameone))
            this.$axios.get("http://orcahrd.natapp1.cc/YaRui/product/findProductByProductCenterId.do",{
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
            this.push=this.arr[1]
            this.newuser.pageCurrent =  this.num
                  this.nameone=this.arr[1].classification
    	localStorage.setItem("nameone",JSON.stringify(this.nameone))
            this.$axios
              .get("http://orcahrd.natapp1.cc/YaRui/product/findProductByProductCenterId.do",{
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
             this.push=this.arr[2]
            this.newuser.pageCurrent =  this.num
                  this.nameone=this.arr[2].classification
    	localStorage.setItem("nameone",JSON.stringify(this.nameone))
            this.$axios
              .get("http://orcahrd.natapp1.cc/YaRui/product/findProductByProductCenterId.do",{
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
          } else if (index == 3) {
             this.newuser.id = this.arrone[2];
             this.push=this.arr[3]
            this.newuser.pageCurrent =  this.num
                  this.nameone=this.arr[3].classification
    	localStorage.setItem("nameone",JSON.stringify(this.nameone))
            this.$axios
              .get("http://orcahrd.natapp1.cc/YaRui/product/findProductByProductCenterId.do",{
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
          } else if (index == 4) {
            this.newuser.id = this.arrone[1];
            this.push=this.arr[4]
            this.newuser.pageCurrent =  this.num
                  this.nameone=this.arr[4].classification
    	localStorage.setItem("nameone",JSON.stringify(this.nameone))
            this.$axios
              .get("http://orcahrd.natapp1.cc/YaRui/product/findProductByProductCenterId.do",{
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
          } else {
             this.newuser.id = this.arrone[0];
             this.push=this.arr[5]
            this.newuser.pageCurrent =  this.num
                  this.nameone=this.arr[5].classification
    	localStorage.setItem("nameone",JSON.stringify(this.nameone))
            this.$axios
              .get("http://orcahrd.natapp1.cc/YaRui/product/findProductByProductCenterId.do",{
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
          }
          console.log(this.newuser.id, this.newuser.pageCurrent);
        })
        .catch(err => {
          console.log("错误");
        });
    },
    dianji:function(){
    	this.$store.state.count=true
    },
    dianjione:function(){
    	this.$store.state.count=false
    },
    show:function(index){
    	this.tr=true
    	this.current=index
    },
    showone:function(){
    	this.tr=false
    	this.current=null
    },
   loage:function(index){
   	this.currentone=index
   	if(this.currentone==index){
   		this.objeone.image=this.obje[index].image
   		this.objeone.introduction=this.obje[index].introduction
			localStorage.setItem("details",JSON.stringify(this.objeone))
			console.log(this.objeone)
   	}
   }
  }
}
</script>

<style scoped>
a{text-decoration: none;}
.navlet {
  padding-left: 80px;
  cursor: pointer;
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
  cursor: pointer;
}
.conterone a{display: none;}
.conterone img{width:270px;height:190px;}
.conterone ul {
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
}
.conterone li {
  width: 270px;
  height: 240px;
}
.conterone div{transition:0.4s ease-in-out;}
.conterone p {
  text-align: center;
  z-index:9999;
  font-size:16px;
}
.conter{width:100%;height:140px;border:1px solid rgb(255,255,255);position:absolute;top:149px;background-color: rgb(255,255,255);}
.conter ul{display: flex;justify-content: space-around;}
.conter li{width:200px;height:140px;text-align: center;line-height:140px;}
.conter li a:hover{color:rgb(76, 176, 80);}
.conter li:nth-last-child(6){background-image: url(../assets/imgs/icon_03.png);background-repeat: no-repeat;background-position:49% 35%;}
.conter li:nth-last-child(5){background-image:url(../assets/imgs/icon_05.png);background-repeat: no-repeat;background-position:49% 35%;}
.conter li:nth-last-child(4){background-image:url(../assets/imgs/icon_07.png);background-repeat: no-repeat;background-position:49% 35%;}
.conter li:nth-last-child(3){background-image: url(../assets/imgs/icon_09.png);background-repeat: no-repeat;background-position:49% 35%;}
.conter li:nth-last-child(2){background-image:url(../assets/imgs/icon_11.png);background-repeat: no-repeat;background-position:49% 35%;}
.conter li:nth-last-child(1){background-image:url(../assets/imgs/icon_13.png);background-repeat: no-repeat;background-position:49% 35%;}
.conter li a{color: rgb(102,102,102);padding-top:45px;display: block;}
.conter li:hover{background-color:#ececec;}
.conter li:hover{color: rgb(76,176,80);}
.contertwo{display: flex;justify-content: space-around;}
.active a{width:270px;height:190px;background-color: rgba(0,146,63,0.5);position: absolute;
text-align: center;line-height:190px;color: rgb(255,255,255);display: block;font-size:15px;transition:0.4s ease-in-out;z-index:9999;}
.radio{width:1200px;height:90px;margin-left:103px;}
.radio a{color: rgb(51,51,51);}
.radio ul{display: flex;line-height:90px;}
</style>
