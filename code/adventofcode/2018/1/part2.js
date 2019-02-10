const fs = require('fs')

const data = fs.readFileSync('./data.txt', 'UTF-8')
const lines = data.split('\n')
const foundFrequencies = new Set()
let totalFrequency = 0;
let i = 0;
while (true) {
    const curr = lines[i]
    if (i === lines.length - 1) {
        i = 0
    } else {
        i++
    }
    if (curr === '') { //empty line
        continue
    }

    const currNumber = parseInt(curr.substr(1))
    const firstChar = curr.charAt(0)

    if (firstChar === '-') {
        totalFrequency -= currNumber
    } else {
        totalFrequency += currNumber
    }
    if (foundFrequencies.has(totalFrequency)) {
        console.log('Found common frequency: ' + totalFrequency)
        break;
    } else {
        foundFrequencies.add(totalFrequency);
    }
}