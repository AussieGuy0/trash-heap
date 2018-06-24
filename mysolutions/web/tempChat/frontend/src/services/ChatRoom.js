
class ChatRoom {
  constructor (roomHandler) {
    this.roomHandler = roomHandler
  }

  connect (roomId) {
    this.roomId = roomId
  }
}

export default ChatRoom
