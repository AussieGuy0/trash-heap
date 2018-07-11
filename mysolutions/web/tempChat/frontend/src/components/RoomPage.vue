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
        <div v-for="(m,index) in messages" v-bind:key="index" class="message">
          <strong>{{m.author}}: </strong> <span> {{m.text}} </span>
        </div>
       </div>
      <div class="chat-input">
        <input v-model='chatMessage' v-on:keyup.enter="sendMessage()" type="text">
        <button :disabled='chatMessage === ""' @click="sendMessage()">Chat</button>
      </div>
    </div>
  </div>
</template>

<script>
import ChatRoom from '@/services/ChatRoom'
export default {
  name: 'RoomPage',
  data () {
    const roomId = this.$route.params.roomId
    return {
      messages: [{ text: 'lol', author: 'steven' }],
      roomId: roomId,
      chatMessage: '',
      username: null
    }
  },
  methods: {
    sendMessage: function () {
      this.chatRoom.sendMessage(this.chatMessage)
      this.chatMessage = ''
    }
  },
  mounted: function () {
    const self = this;
    this.$nextTick(() => {
      let username;
      while(username == null) {
        username = window.prompt("Enter a username")
      }
      this.username = username;
      this.chatRoom = new ChatRoom(this.roomId, username, {
        messageReceived: function(user, text) {
          self.messages.push({author: user, text: text})
        }
      })
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
