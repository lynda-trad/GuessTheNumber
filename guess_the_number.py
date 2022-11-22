import random

numberToGuess = random.randint(1, 100)
numberGuess = 0
print("\n~ Guess The Number ! ~\n")

while numberGuess != numberToGuess:
    numberGuess = int(input("~ Please enter a number between 1 and 100. ~\n"))
    if numberGuess < numberToGuess:
        print("Too low !")
    elif numberGuess > numberToGuess:
        print("Too high !")
    else:
        print("You won ! The number was indeed", numberToGuess, "!")
        exit(0)