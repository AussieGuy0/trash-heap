let wsProtocol = "ws:";
if (window.location.protocol === "https:") {
    wsProtocol = "wss:";
} 

const baseUrl = `${wsProtocol}//${window.location.hostname}/room/`

const event = {
  MESSAGE: 'MESSAGE',
  USER_JOINED: 'USER_JOINED',
  USER_LEFT: 'USER_LEFT',
  USER_REGO: 'USER_REGO'
}

class ChatRoom {
  constructor (roomId, username, messageHandler) {
    this.eventHandler = messageHandler
    this.connect(roomId, username)
  }

  connect (roomId, username) {
    this.roomId = roomId
    this.username = username
    this.roomUrl = baseUrl + roomId

    this.socket = new WebSocket(baseUrl + roomId)
    this.socket.onopen = () => {
    //   this.eventHandler.connected()
      const rego = {username: username, event: event.USER_REGO}
      this.socket.send(JSON.stringify(rego))
    }

    this.socket.onmessage = (msg) => {
      const data = JSON.parse(msg.data)
      if (data.event === event.USER_JOINED) {
        this.eventHandler.userJoined(data.user)
      } else if (data.event === event.USER_LEFT) {
        this.eventHandler.userQuit(data.user)
      } else if (data.event === event.MESSAGE) {
        this.eventHandler.messageReceived(data.user, data.message)
      } else {
        console.warn(`Unregistered event type: '${data.event}'`)
      }
    }

    this.socket.onerror = (err) => {
      console.warn(err)
    }
  }

  sendMessage (message) {
    const username = this.username
    const data = {user: username, message: message, event: event.MESSAGE}
    this.socket.send(JSON.stringify(data))
  }
}

export default ChatRoom
