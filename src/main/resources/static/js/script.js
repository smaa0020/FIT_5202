Vue.component("caret-stat", {
  template: "#caret-statistic",
  props: ["direction"]
});

Vue.component("circle-stat", {
  template: "#circle-statistic",
  props: ["percentage", "color", "strokeValue", "title", "id"],
  methods: {
    calculateStrokeValue: function(precentage) {
      this.strokeValue = 330 * (precentage / 100);
    },
    test: function() {
      $("#" + this.id).animate(
        {
          "stroke-dashoffset": 0
        },
        2000
      );
    }
  },
  created: function() {
    this.calculateStrokeValue(this.percentage);
  },
  mounted: function() {
    this.test();
  }
});

var app = new Vue({
  el: "#app",
  data: {openState: false},
  methods: {
    toggleNav: function() {
      var t = this;
      switch (this.openState) {
        case false:
          this.openState = true;
          $("#nav").width(250);
          return;
        case true:
          this.openState = false;
          $("#nav").width(0);
      }
    }
  }
});