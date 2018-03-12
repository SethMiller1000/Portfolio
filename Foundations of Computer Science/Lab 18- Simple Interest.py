# The Simple Interest Problem
# CIS 1033: Lab 18- Functions Part 2
# Author: Seth Miller

# Function that calculates the balance of a bank account with simple interest
# after a given amount of years based on the initial balance and interest rate
def computeSimpleInterest( investment, interestRate, years ):
    interest = ( investment * interestRate * years )
    return interest

## MAIN METHOD ##

# Explain purpose of program to user
print( "Hello! This program calculates the new balance of an amount of money in the bank" )
print( " after a given amount of years based on the initial balance and interest rate." )
print ( "" )

# Ask user for initial balance, interest rate, and years passed
principalInput = float(input( "Please enter the initial balance of the account: " ))
print( "" )
interestRateInput = float(input( "Please enter the interest rate: " ))
print( "" )
yearsInput = int(input( "Please enter the number of years that have passed: " ))
print( "" )

# Call compute simple interest function
interest = computeSimpleInterest( principalInput, interestRateInput, yearsInput )

# Calculate new balance
newBalance = principalInput + interest

# Display new balance
print( "Your account's new balance: $%.2f" %newBalance )
