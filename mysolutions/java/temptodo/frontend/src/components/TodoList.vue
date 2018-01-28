<template>
  <div>
    <h1>Todo List</h1>
    <div v-for="todo in todos">
      <input type="text" v-model="todo.text" v-on:keyup.enter="saveTodo(todo)">
      <button>Delete</button>
    </div>
    <button v-on:mouseup="addTodo()" >
      Add Todo
    </button>
  </div>
</template>

<script>
  import TodoService from "../services/TodoService";

  const todoService = new TodoService();
  export default {
    name: 'TodoList',
    data() {
      return {
        todos: [],
        id: this.$route.params.id
      }
    },
    methods: {
        addTodo: function () {
          todoService.addTodo(this.id, "Example Todo").then(() => {
            this.getTodos();
          });
        },
        getTodos: function () {
          todoService.getTodos(this.id).then((json) => {
            this.todos = json;
          });
        },
        saveTodo: function (todo) {
          todoService.updateTodo(this.id, todo).then(() => {
            this.getTodos();
          })

        },
      deleteTodo: function () {

      }
    },
    created: function () {
      todoService.getTodos(this.id).then((json) => {
        this.todos = json;
      });

    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  h1, h2 {
    font-weight: normal;
  }

  ul {
    list-style-type: none;
    padding: 0;
  }

  li {
    display: inline-block;
    margin: 0 10px;
  }

  a {
    color: #42b983;
  }
</style>
