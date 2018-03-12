# The Vowel Counting Problem
# CIS 1033: Lab 18- Functions Part 2
# Author: Seth Miller

## Function that counts the vowels in a string ##
def countVowels(string):

    # Initialize counter and vowel count variables
    vowelCount = 0
    counter = 0

    # while loop that runs until counter >= length of string
    while ( counter < len(string) ):

        # If statement that tests if index at string[counter]
        # is in string of vowels, updates vowel count if so
        if ( string[counter] == 'a' ) or ( string[counter] == 'A' ):
            vowelCount = vowelCount + 1
        elif ( string[counter] == 'e' ) or ( string[counter] == 'E' ):
            vowelCount = vowelCount + 1
        elif ( string[counter] == 'i' ) or ( string[counter] == 'I' ):
            vowelCount = vowelCount + 1
        elif ( string[counter] == 'o' ) or ( string[counter] == 'O' ):
            vowelCount = vowelCount + 1
        elif ( string[counter] == 'u' ) or ( string[counter] == 'U' ):
            vowelCount = vowelCount + 1

        # Increase counter by 1
        counter = counter + 1

    # Return vowel count value
    return vowelCount

## MAIN METHOD ##

# Explain purpose of program to user
print( "       Hello! This program takes a phrase that you enter and displays" )
print( "                  the total number of vowels inside it." )
print( "" )

# Ask user for string
userString = input( "Please enter a phrase: " )
print( "" )

# Call vowel count function and assign it to variable
result = countVowels( userString )

# Display vowel count
print( "Vowel Count: " + str(result) )

