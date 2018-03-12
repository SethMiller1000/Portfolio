# The Coin Toss Problem
# Lab 16- CIS 1033
# Author: Seth Miller

# Explain purpose of program to user
print( "Hello! This program calculates the result of 100 coin tosses." )
print( "" )

# Import randint
from random import randint

# Initialize heads count and tails count
headsCount = 0
tailsCount = 0

# for loop that calculates coin face for 100 coin flips
for coinCount in range( 0, 100 ):
    
    # If statement that assigns heads or tails as value to coinFace
    # based on value of coinNum and updates heads or tails count
    
    coinNum = randint( 1,2 )
    if coinNum == 1:
        coinFace = "heads"
        headsCount = headsCount + 1
    else:
        coinFace = "tails"
        tailsCount = tailsCount + 1

# Display heads count and tails count
print("Number of heads:", headsCount)
print("Number of tails:", tailsCount)
