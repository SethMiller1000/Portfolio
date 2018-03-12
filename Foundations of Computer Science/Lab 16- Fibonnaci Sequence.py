# The Fibonacci Problem
# Lab 16- CIS 1033
# Author: Seth Miller

# Explain purpose of program to user
print("Hello! This program calculates and identifies the number")
print("at a certain position in the Fibonacci number sequence.")
print( "" )

# Ask user for position of term to identify
lastNumPosition = int(input("Enter the position of the term to be calculated: "))
print( "" )

# Intialize variables
number1 = 1
number2 = 1

# Calculate sum of number 1 and number2
numberNew = number1 + number2

# For loop that updates number1, number2, and numberNew value
# until the term to be calculated (lastNumPosition) has been reached
for counter in range ( 3, lastNumPosition ):
    number1 = number2
    number2 = numberNew
    numberNew = number1 + number2

# Display value of lastNumPosition
print( "The number at position", lastNumPosition, "is " + str(numberNew) + "." )
