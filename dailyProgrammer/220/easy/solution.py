#!/bin/python3
import re


def test(actual, expected):
    if actual != expected:
        print("x '" + actual + "' did not equal '" + expected + "'") 


def mangle(input):
    out = []
    words = input.split(' ')
    for word in words:
        sortedWord = sorted(word.lower())
        for m in re.finditer(r'[A-Z]', word):
            index = m.start()
            sortedWord[index] = sortedWord[index].upper()

        out.append(''.join(sortedWord))
    return ' '.join(out)


test(mangle("This challenge doesn't seem so hard."),
     "Hist aceeghlln denos't eems os adhr.")
test(mangle("There are more things between heaven and earth, Horatio, than are dreamt of in your philosophy."),
     "Eehrt aer emor ghinst beeentw aeehnv adn aehrt, Ahioort, ahnt aer ademrt fo in oruy hhilooppsy.")
