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
    department: {
      list: function (obj) {
        obj.api = '/DepartmentController/list';
        sb.get(obj)
      },
      save: function (obj) {
        obj.api = '/DepartmentController/save';
        sb.post(obj)
      },
      delete: function (obj) {
        obj.api = '/DepartmentController/delete';
        sb.post(obj)
      },
    },
    user: {
      login: function (obj) {
        obj.api = '/UserController/login';
        sb.post(obj)
      },
    }
  }
}(window.sandBox))
