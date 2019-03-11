const fs = require('fs')


function findDiffCharIndex(firstWord, secondWord) {
    let foundDifference = -1;
    for (let i = 0; i < firstWord.length; i++) {
        if (firstWord.charAt(i) !== secondWord.charAt(i)) {
            if (foundDifference >= 0) {
                return -1;
            }
            foundDifference = i;
        }
    }
    return foundDifference;
}

const data = fs.readFileSync('./data.txt', 'UTF-8')
const lines = data.split('\n')

let firstCommonLine;
let secondCommonLine;
let differenceIndex;
for (let i = 0; i < lines.length; i++) {
    let firstLine = lines[i]
    for (let j = i + 1; j < lines.length; j++) {
        let secondLine = lines[j]
        let index = findDiffCharIndex(firstLine, secondLine)
        if (index >= 0) {
            firstCommonLine = firstLine
            secondCommonLine = secondLine
            differenceIndex = index;
            break;
        }
    }
    if (firstCommonLine) {
        break;
    }
}

let commonChars = firstCommonLine.substring(0, differenceIndex) + firstCommonLine.substring(differenceIndex + 1, firstCommonLine.length)
console.log('Common chars are: ' + commonChars)
