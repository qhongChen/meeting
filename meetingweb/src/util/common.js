import Vue from 'vue'

/**
 * 把mtg挂载到window下
 * 使sandBox成为一个全局变量
 */
window.mtg = {
  success: function (msg) {
    Vue.prototype.$message({
      message: msg,
      type: 'success'
    });
  },
  warning: function (msg) {
    Vue.prototype.$message({
      message: msg,
      type: 'warning'
    });
  },
  info: function (msg) {
    Vue.prototype.$message(msg);
  },
  error: function (msg) {
    Vue.prototype.$message.error(msg);
  },
  confirm : function (message, successCallBack, errorCallBack) {
    Vue.prototype.$confirm(message, '提示', {
      confirmButtonText: '确定',
      cancelButtonText: '取消',
      type: 'warning'
    }).then(
      successCallBack
    ).catch(
      () => {
        if (errorCallBack){
          return errorCallBack
        }else {
          mtg.info("取消操作");
        }
    });
  }
}

