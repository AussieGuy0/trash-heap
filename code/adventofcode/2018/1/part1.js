const fs = require('fs')

const data = fs.readFileSync('./data.txt', 'UTF-8')
const totalFrequency = data.split('\n').reduce((prev, curr) => {
    if (curr === '') { //empty line
        return prev
    }
    const currNumber = parseInt(curr.substr(1))
    const firstChar = curr.charAt(0)
    if (firstChar === '-') {
        return prev - currNumber
    } else {
        return prev + currNumber
    }

}, 0)
console.log('The current total frequency is: ' + totalFrequency)