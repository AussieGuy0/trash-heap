<template>
  <div class="container">
    <div class="status-bar">
        <strong>{{roomId}}</strong>
    </div>
    <div class="user-list">
      <h4>Users</h4>
    </div>
    <div class="chat">
      <div class="history">
        <div v-for="m in messages" v-bind:key="m.id" class="message">
          <strong>{{m.author}}: </strong> <span> {{m.text}} </span>
        </div>
       </div>
      <div class="chat-input">
        <input v-model='chatMessage' v-on:keyup.enter="sendMessage(chatMessage)" type="text">
        <button :disabled='chatMessage === ""'>Chat</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'RoomPage',
  data () {
    const roomId = this.$route.params.roomId
    return {
      messages: [{ id: 1, text: 'lol', author: 'steven' }],
      roomId: roomId,
      chatMessage: ''
    }
  },
  methods: {
    sendMessage: function (message) {
      console.log(message)
    }
  },
  mounted: function () {
    this.$nextTick(() => {

    })
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1,
h2 {
  font-weight: normal;
}

.container {
  display: grid;
  grid-template-columns: 15% 85%;
  grid-template-rows: 35px;
  height: 100%;
}

.container > div {
  padding: 5px;
}

.status-bar {
  grid-column: span 2;
  background: #16a085;
}

.user-list {
  border-right: 1px solid grey;
}

.chat {
  display: flex;
  flex-direction: column;
}

.chat-input {
  margin-top: auto;
  display: flex;
}

.chat-input input {
  flex-grow: 1;
}

</style>
