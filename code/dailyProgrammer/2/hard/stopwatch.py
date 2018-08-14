import time

print("Stopwatch program")
print("Enter 'S' to start, or 'Q' to quit")

while True:
    response = input()
    if (response == 'S' or response == 'Q'):
        break
    else:
        print("Enter 'S' to start, or 'Q' to quit")

startTime = time.time()
lastTime = -1
print("Starting timer. Enter 'S' to start/stop, press 'L' to lap")  # TODO: this
while True:
    elapsedTime = int(time.time() - startTime)
    if (lastTime != elapsedTime):
        print(elapsedTime, end="\r")
        lastTime = elapsedTime
