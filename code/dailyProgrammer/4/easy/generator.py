#!/bin/python3

from random import randint


def generateRandomChars(length):
    out = ""
    for i in range(0, length):
        rand = randint(min, max)
        out = out + chr(rand)
    return out


def getIntInput(message):
    out = input(message)
    while (not out.isdigit()):
        print("Numbers only!")
        out = input(message)
    return int(out)


min = 32
max = 122

print("**Random Password Generator**\n")
passNum = getIntInput("How many password do you want to generate? ")
passLength = getIntInput("How many chars do you want each password to be? ")

for i in range(0, passNum):
    print(generateRandomChars(passLength))
