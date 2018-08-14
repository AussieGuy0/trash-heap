const express = require('express')
const app = express()
const expressWs = require('express-ws')(app);
const Rooms = require('./rooms')
const logger = require('./logger')

const event = {
    MESSAGE: 'MESSAGE',
    USER_JOINED: 'USER_JOINED',
    USER_LEFT: 'USER_LEFT',
    USER_REGO: 'USER_REGO'
}

let rooms = new Rooms();

app.ws('/room/:id', (ws, req) => {
    const roomId = req.params.id;
    const ip = req.headers['x-forwarded-for'] || req.connection.remoteAddress;
    logger.debug(`Adding ${ip} to roomId ${roomId}`) 
    rooms.add(roomId, ws)
    ws.on('message', (msg) => {
        const data = JSON.parse(msg)
        if (data.event === event.MESSAGE) {
            logger.debug(`Received message from user ${data.user}`) 
            rooms.sendMessage(roomId, {event: event.MESSAGE, user: data.user, message: data.message})
        }
    })

    ws.on('error', (err) => {
        logger.debug(err)
    })
})

app.use(express.static('./dist/'))

app.listen(8081, () => {
    console.log('Listening on port 8081');
})
