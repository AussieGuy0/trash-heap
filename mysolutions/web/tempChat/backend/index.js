const express = require('express')
const app = express()
const expressWs = require('express-ws')(app);

app.ws('/room/:id', (ws, req) => {
    console.log(req.ip)
    console.log(req.ips)
    ws.on('message', (msg) => {
        ws.send(msg);
    })
})

app.use(express.static('../frontend/dist/'))

app.listen(8081, () => {
    console.log('Listening on port 8081');
})