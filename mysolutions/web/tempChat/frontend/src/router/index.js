import Vue from 'vue'
import Router from 'vue-router'
import HomePage from '@/components/HomePage'
import RoomPage from '@/components/RoomPage'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HomePage',
      component: HomePage
    },
    {
      path: '/room/:roomId',
      name: 'RoomPage',
      component: RoomPage
    }
  ]
})
