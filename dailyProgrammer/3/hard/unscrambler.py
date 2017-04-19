def hasSameLetters(firstWord, secondWord):  # Alternative to this: Sort words then simply compare!
    for firstWordChar in firstWord:
        found = False
        for secondWordChar in secondWord:
            if (firstWordChar == secondWordChar):
                found = True
                break
        if (found is False):
            return False
    return True


scrambledFile = open("scrambled.txt", "r")
scrambledList = scrambledFile.read().splitlines()

unscrambledFile = open("unscrambled.txt", "r")
unscrambledList = unscrambledFile.read().splitlines()

for scrambledWord in scrambledList:
    for unscrambledWord in unscrambledList:
        if sorted(scrambledWord) == sorted(unscrambledWord):
            print(scrambledWord + " was unscrambled: " + unscrambledWord)
            break
