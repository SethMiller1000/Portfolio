# The Just the Ends Problem
# Lab 17: CIS 1033
# Author: Seth Miller

## Define function "JustTheEnds" that has two parameters ( string- String, int- Number ), ##
# where Number = number of characters, and concatenate first -Number- characters of
# string -String- and last -Number- characters of string -String-
def JustTheEnds ( String, Number ):

    # Intialize counter and new string variable
    counter = 0
    newString = ""

    # While loop that assigns first three characters to variables
    # and adds them to new string
    while ( counter < Number ):
        char = String[counter]
        newString = newString + char
        counter = counter + 1

    # While loop that assigns last three characters to variables
    # and adds them to new string
    while ( counter > 0 ):
        char = String[len(String) - counter]
        newString = newString + char
        counter = counter - 1

    # Return new string
    return newString

## MAIN Method ##

# Explain purpose of program to user
print("    Hello! This program displays a string based on the string you enter and")
print("         the number of characters you want to process at each end.")
print( "" )

# Ask user for string and number of characters to process at each end
userString = input("Please enter a phrase: ")
userNumber = int(input("Please enter the amount of characters to process at each end: "))

# Call JustTheEnds function and calculate the new string
newPhrase = JustTheEnds ( userString, userNumber )

# Display the new string
print( "The new phrase is " + newPhrase )
