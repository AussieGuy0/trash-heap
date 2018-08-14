<template>
  <div>
    <h1>Temp Todo</h1>
    <button v-on:mouseup="createTodoList()">Create Temp Todo</button>
  </div>
</template>

<script>
  export default {
    name: 'HomePage',
    data() {
      return {}
    },
    methods: {
      createTodoList: function () {
        const data = {id: "test"};
        const headers = new Headers({'Content-Type': 'application/json'});
        return fetch('/api/v1/todos', {
          method: 'POST',
          body: JSON.stringify(data),
          headers: headers
        }).then((r) => {
          return r.json();
        }).then((json) => {
          const id = json.id;
          this.$router.push({path: `/todos/${id}`});
        });
      }
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
