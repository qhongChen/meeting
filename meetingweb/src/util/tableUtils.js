export default {
  install(Vue, options) {
    Vue.prototype.getTableAttrs = function () {
      return {
        data() {
          return {
            selections: [],
          }
        },
        methods: {
          tableSelectChange(selection) {
            this.selections = selection;
          }
        }
      }
    }
  }
}
