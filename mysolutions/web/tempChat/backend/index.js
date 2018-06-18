const express = require('express')
const app = express()

app.get('/test', (req, res) => {
    res.send('abc');
})

app.use(express.static('../frontend/dist/'))

app.listen(8081, () => {
    console.log('Listening on port 8081');
})