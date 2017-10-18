/**
 * API服务
 */
(function (sb) {
  sb.APIs = {
    // 在这里封装所有API调用方法
    message: {
      list: function (obj) {
        obj.api = '/MessageController/getMsg';
        sb.get(obj)
      }
    },
    meeting: {
      list: function (obj) {
        obj.api = '/MeetingController/list';
        sb.get(obj)
      }
    },
    user: {
      login: function (obj) {
        obj.api = 'login';
        sb.post(obj)
      },

      list: function (obj) {
        obj.api = '/user/getListByPower';
        sb.get(obj)
      }

    }
  }
}(window.sandBox))
