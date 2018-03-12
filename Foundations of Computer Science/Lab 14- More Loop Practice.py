# More Loops Practice Program- Lab 14: CIS 1033
# Author: Seth Miller

## Step 1

# Explain purpose of program to user
print( "The first part of the program takes a string that you enter" )
print( "and reverses it." )
print( )

# Initialize new string and index variables
newString = ""
index = 0

# Ask user for string
userString = input( "Please enter a string > " )

# reverse order of characters with while loop
while ( index < len(userString) ):
    character = userString[index]
    newString = character + newString
    index = index + 1

# Display new string
print( "Your string reversed: " + newString )
print( )

## Step 2

# Explain purpose of program to user
print( "The second part of this program takes a string that you enter" )
print( "and tells you how many of each vowel there is in it." )
print( )

# Initialize vowel count and index variables
aCount = 0
eCount = 0
iCount = 0
oCount = 0
uCount = 0

index2 = 0

# Ask user for string
userString2 = input( "Please enter a string > " )

# Analyze each character and tests if each variable is a vowel,
# then updates that vowel's count variable
while ( index2 < len(userString2) ):
    character = userString2[index2]
    if character.lower() == "a":
        aCount = aCount + 1
    elif character.lower() == "e":
        eCount = eCount + 1
    elif character.lower() == "i":
        iCount = iCount + 1
    elif character.lower() == "o":
        oCount = oCount + 1
    elif character.lower() == "u":
        uCount = uCount + 1
    index2 = index2 + 1   

# Display each vowel count variable and its amount
print( "Number of \"A\"s: ", aCount )
print( "Number of \"E\"s: ", eCount )
print( "Number of \"I\"s: ", iCount )
print( "Number of \"O\"s: ", oCount )
print( "Number of \"U\"s: ", uCount )
print( )

## Step 3

# Explain purpose of program to user
print( "The third part of this program takes the sum of a series of fractions,")
print( "starting with 1/3, then increasing the numerator and denominator by 2.")
print( )

# Initialize numerator, and sum variables
numerator = 1
denominator = numerator + 2
sumOfNumbers = 0

# While the denominator is less than 100, divide numerator by denominator
# add result to sum, and update variables
while ( denominator < 100 ):
    quotient = numerator / denominator
    sumOfNumbers = sumOfNumbers + quotient
    numerator = denominator
    denominator = denominator + 2

# Display sum of numbers
print("The sum is", sumOfNumbers)

