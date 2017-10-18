import Vue from 'vue'
import Router from 'vue-router'
import Main from '@/pages/Main'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Main',
      component: Main,
      children: [
        {
          path: 'messageMain',
          // 懒加载
          component: resolve => require(['../pages/MyReserve/MyReserveMain.vue'], resolve),
        },
        {
          path: 'myMeetingMain',
          // 懒加载
          component: resolve => require(['../pages/MyMeeting/MyMeetingMain.vue'], resolve),
        },
      ]
    }
  ]
})
