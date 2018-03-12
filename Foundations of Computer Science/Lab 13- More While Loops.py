## More repetition with while loops- Lab 13: CIS 1033
## Author: Seth Miller

## Loop 1- finds sum of all integers from 10 to 20 including 10 and 20
integer = 10
sum = 0
while ( integer <= 20 ):
    sum = sum + integer
    integer = integer + 1
print( "Sum of integers 10 to 20:", sum )

print()

## Loop 2- concatenates 4 seperate strings entered by user
userString = ""
concatenatedString = ""
stringCount = 0
while ( stringCount < 4 ):
    userString = input("Please enter a string > ")
    if userString == "":
        print("Error: you must enter at least one character!")
    else:
        concatenatedString = concatenatedString + userString
        stringCount = stringCount + 1
print( "Your strings concatenated together: " + concatenatedString )

print()

## Loop 3- Simulates a cashier at a retail store
itemsPurchased = int( input( "Please enter the number of items purchased: " ) )
itemCount = 0
totalPrice = 0
if ( itemsPurchased == 0 ):
    print( "No items purchased." )
else:
    while( itemCount < itemsPurchased ):
        itemPrice = float( input( "Please print the price of an item in dollars and pennies: $" ) )
        totalPrice = totalPrice + itemPrice
        itemCount = itemCount + 1
    formattedTotalPrice = "%.2f" %totalPrice
    print( "Your total price is $" + str( formattedTotalPrice ) )

print()

## Loop 4- Asks user for secret word until user enters actual secret word ( BEARCAT )
secretWord = "BEARCAT"
secretWordInput = input( "Please enter the secret word: " )
while ( secretWordInput != secretWord ):
    secretWordInput = input( "Incorrect! Please enter the secret word: " )
print( "Correct! Access granted." )

print()

## Loop 5- Asks user to enter a string and displays each character on a new line
userMessage = input( "Please enter a single string > " )
i = 0
while ( i< len( userMessage ) ):
    print( userMessage[i] )
    i = i + 1

print()

## Loop 6- Determines whether a series of numbers input by the user are even or odd
enteredNumber = int( input( "Please enter an integer or 0 to stop: " ) )
while ( enteredNumber != 0 ):
    if enteredNumber % 2 == 0:
        numberStatus = "even"
    else:
        numberStatus = "odd"
    print( "This number is " + numberStatus + "." )
    print()
    enteredNumber = int( input( "Please enter an integer or 0 to stop: " ) )
