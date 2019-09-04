<template>
  <div class="f">
    <div id="cl">
      <div id="fd">
        <ul>
          <h6 class="why">Navigation</h6>
          <li>Home</li>
          <li>About us</li>
          <li>Product Center</li>
          <li>News Center</li>
          <li>Join us</li>
          <li>Contact us</li>
        </ul>
      </div>
      <div id="fd1">
        <ul>
          <h6 class="why">Product Center</h6>
          <li>Grow Light Fixture</li>
          <li>Grow Digital Ballast</li>
          <li>Grow Carbon Air filter</li>
          <li>Grow Rope Ratchet</li>
          <li>Grow Duct Fan</li>
          <li>Hardware Accessories</li>
        </ul>
      </div>

      <div id="fd33">
        <div class="coco">
          <img src="../assets/imgs/footer-logo_03.jpg" />
          <img src="../assets/imgs/code_ewm.png" />
        </div>
        <div class="coco1">
          <h6>New Silk Road</h6>
          <p>Shenzhen New Silk Road Technology Co., Ltd. located at Longgang center District ,Shenzhen City, Guangdong & Hongkong & Macao Bay</p>
          <h6>Contact Number</h6>
          <span>0755-89568384</span>
        </div>
      </div>
    </div>
    <div id="fei">
      <div id="vie">
        <p>Copyright © 2017 Shenzhen Number Energy Saving Corporation. All Rights Reserved. Technical Support : www.sznbone.com</p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "HelloWorld",
  data() {
    return {};
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.f {
  /* width: 1349px; */
  height: 450px;
  background-color: #1f1f1f;
}
#cl {
  width: 1200px;
  height: 380px;
  margin: 0 auto;
}
#fd {
  width: 394px;
  height: 380px;
  float: left;
  list-style: none;
  font-size: 16px;
  color: #838282;
  padding: 6px 0 20px;
}
#fd1 {
  width: 394px;
  height: 380px;
  float: left;
  list-style: none;
  font-size: 16px;
  color: #838282;
  padding: 6px 0 20px;
}
.why {
  margin-top: 60px;
  margin-bottom: 20px;
  font-size: 18px;
  color: #ffff;
}
#fd ul li {
  margin-bottom: 20px;
}
#fd1 ul li {
  margin-bottom: 20px;
}
#fd33 {
  width: 370px;
  height: 200px;
  float: right;
  display: block;
  margin-top: 60px;
}
.coco {
  width: 72px;
  height: 200px;
  float: left;
}
.coco img {
  margin-bottom: 50px;
}
.coco1 {
  width: 292px;
  height: 194px;
  color: #ffff;
  float: left;
}
.coco1 h6 {
  font-size: 18px;
  color: #fff;
  margin-bottom: 5px;
  padding: 6px 0 10px;
}
.coco1 p {
  font-size: 14px;
  color: #bebebe;
  line-height: 24px;
  margin: 10px 0;
}
.coco1 span {
  display: block;
  font-size: 24px;
  color: #4cb050;
}
#vie {
  width: 1002px;
  height: 70px;
  line-height: 70px;
  margin: 0 auto;
  color: #ffff;
}
#fei {
  height: 70px;
  background-color: black;
}
</style>