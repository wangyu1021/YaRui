<template>
  <div class="mapbox">
    <baidu-map
      :center="center"
      :zoom="zoom"
      :scroll-wheel-zoom="true"
      style="height:100vh"
      @ready="handler"
      @click="getClickInfo"
    >
      <bm-navigation anchor="BMAP_ANCHOR_TOP_RIGHT"></bm-navigation>
      <bm-geolocation anchor="BMAP_ANCHOR_BOTTOM_RIGHT" :showAddressBar="true" :autoLocation="true"></bm-geolocation>
      <bm-city-list anchor="BMAP_ANCHOR_TOP_LEFT"></bm-city-list>
    </baidu-map>
  </div>
</template>
<script>
export default {
  name: "mapbox",
  data() {
    return {
      center: { lng: 0, lat: 0 },
      zoom: 13 
    };
  },
  methods: {
    handler({ BMap, map }) {
      console.log(BMap, map);
      this.center.lng = 113.6313915479;
      this.center.lat = 34.7533581487;
      this.zoom = this.zoom;
    },
    getClickInfo(e) {
      console.log(e.point.lng);
      console.log(e.point.lat);
      this.center.lng = e.point.lng;
      this.center.lat = e.point.lat;
    }
  }
};
</script>
