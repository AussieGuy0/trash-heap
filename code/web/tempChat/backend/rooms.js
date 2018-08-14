
class Rooms {

    constructor() {
        this.map = new Map()
    }

    add(roomId, ws) {
        const websockets = this.map.get(roomId)
        if (websockets == null) {
            this.map.set(roomId, [ws])
        } else {
            websockets.add(ws)
        }
    }

    sendMessage(roomId, data) {
        this.getWebSockets(roomId).forEach(ws => {
           ws.send(JSON.stringify(data));
        });
    }

    getWebSockets(roomId) {
        const websockets = this.map.get(roomId)
        if (websockets == null) {
            return []
        }
        return websockets;
    }

}

module.exports = Rooms