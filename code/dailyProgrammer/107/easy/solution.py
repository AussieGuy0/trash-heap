
def convert(numberStr):
    out = ""
    num = int(numberStr)
    if num >= 1 or num <= 26:
        charCode = num + 96
        out += chr(charCode)
    return out


def decode(numbersStr, built, results):
    if len(numbersStr) >= 2:
        decode(numbersStr[2:], built + convert(numbersStr[0:2]), results)

    if len(numbersStr) >= 1:
        decode(numbersStr[1:], built + convert(numbersStr[0:1]), results)

    if len(numbersStr) == 0:
        results.append(built)


def getDecodes(number):
    out = []
    decode(str(number), '', out)
    return out


res = getDecodes(123)

print(res)
if 'abc' in res and 'aw' in res and 'lc' in res:
    print('Correct')
else:
    print('Incorrect')
