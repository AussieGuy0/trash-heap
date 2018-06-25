
const baseUrl = `ws:/localhost:8081/room/`

class ChatRoom {
  constructor (messageHandler) {
    this.messageHandler = messageHandler
  }

  connect (roomId) {
    this.roomId = roomId
    this.roomUrl = baseUrl + roomId

    this.socket = new WebSocket(baseUrl + roomId)
    this.socket.onopen = () => {
      this.messageHandler.connected()
    }

    this.socket.onmessage = (msg) => {
      console.log(msg)
    }
  }

  sendMessage (user, message) {
    const data = {user: user, message: message}
    this.socket.send(JSON.stringify(data))
  }
}

export default ChatRoom
