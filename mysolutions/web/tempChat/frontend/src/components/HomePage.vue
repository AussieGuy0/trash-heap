<template>
  <div class="hello">
    <h2>Quick Chat</h2>
    <div>
      <input v-model="room" type="text">
      <button :disabled='!room' v-on:click="openRoom(room)">
         Join Room
      </button>
    </div>
    <div>
      <button> Join Random Room </button>
    </div>
  </div>
</template>

<script>
export default {
  name: 'RoomPage',
  data () {
    return {
      room: ''
    }
  },
  methods: {
    openRoom: function (room) {
      this.$router.push(`/room/${room}`)
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
