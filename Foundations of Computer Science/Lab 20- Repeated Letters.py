# The Repeated Letters Problem
# Lab 20- Lists II : CIS 1033
# Author: Seth Miller

# Explain purpose of program to user
print( "           Hello! This program takes a series of words that you enter" )
print( "            and displays all of them that repeat their first letter." )
print( "" )

# Ask user for string
print( "Please enter a series of words or \"done\" to quit: " )
print( "" )
userInput = input( "Please enter a word: " )
userString = userInput.lower()

# Declare a new list for words that repeat their first letter
repeatFirst = []

# While loop that tests if the word the user entered repeats its first letter
# and appends world to repeatFirst list if so
while ( userString != "done" ):

    # Create variable with first character in user string as value
    firstLetter = userString[0]

    # Test if first character is found again in user string
    if ( firstLetter in userString [1: len(userString)] ):
        repeatFirst.append(userString)

    # Ask user for another string
    userInput = input( "Please enter a word: " )
    userString = userInput.lower()
    
# Display list of words that repeat their first letter
print( "" )
print( "The list of words that repeat their first letter:" )
print( repeatFirst )




        
    
