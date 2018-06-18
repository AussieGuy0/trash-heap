<template>
  <div class="hello">
    <button v-on:click="websocket">
      Click Me
    </button>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  },
  methods: {
    websocket: function () {
      console.log(window.location)
      const socket = new WebSocket(`ws:/${window.location.host}/room/123`)
      socket.onopen = () => {
        socket.send('lol')
      }

      socket.onmessage = (event) => {
        console.log(event)
      }
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
