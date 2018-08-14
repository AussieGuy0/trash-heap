import Vue from 'vue'
import Router from 'vue-router'
import HomePage from '@/components/HomePage'
import TodoList from '@/components/TodoList'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HomePage
    },
    {
      path: '/todos/:id',
      name: 'TodoList',
      component: TodoList
    }
  ]
})
