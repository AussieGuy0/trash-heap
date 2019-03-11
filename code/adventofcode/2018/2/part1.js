const fs = require('fs')

const data = fs.readFileSync('./data.txt', 'UTF-8')
const lines = data.split('\n')

let twoLetterCount = 0;
let threeLetterCount = 0;
lines.forEach((line) => {
    const foundChars = {}
    line.split('').forEach((char) => {
        if (foundChars[char] == null) {
            foundChars[char] = 1;
        } else {
            foundChars[char]++;
        }
    })
    let hasTwoLetter = false;
    let hasThreeLetter = false;
    Object.keys(foundChars).forEach((key) => {
        if (foundChars[key] === 2) {
            hasTwoLetter = true;
        } else if (foundChars[key] === 3) {
            hasThreeLetter = true
        }
    })
    if (hasTwoLetter) {
        twoLetterCount++
    } 
    if (hasThreeLetter) {
        threeLetterCount++
    }
})
const checksum = twoLetterCount * threeLetterCount

console.log('checksum is: ' + checksum)