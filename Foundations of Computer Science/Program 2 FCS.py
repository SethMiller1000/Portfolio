# Program 2 -This Date In History
# CIS 1033 (Foundations of Computer Science)
# Author: Seth Miller

# Explains purpose of program to user
print( "         Hello, and welcome to the \"This Date in History\" program!" )
print( "      This program determines the day of the week for any day in history" )
print( "                       from the year 1582-4902." )
print( )

# Asks the user for the month number and explains the month number system
print( "For entering the month, enter the corresponding number: \n\tJanuary = 1\n\tFebruary = 2\n\tMarch = 3\n\tApril = 4\n\tMay = 5\n\tJune = 6\n\tJuly = 7\n\tAugust = 8\n\tSeptember = 9\n\tOctober = 10\n\tNovember = 11\n\tDecember = 12" )
print( )
monthInput = int(input( "Please enter the number of the month: " ))
print( )

# Tests if user input for month number is valid, prints error if not,
# and asks for another number; else, continues running program
while ( monthInput < 1 or monthInput > 12 ):
    print( "Error: month number must be from 1-12!" )
    monthInput = int(input( "Please enter the number of the month: " ))
    print( )
    
# Asks user for numeric day from 1-31
dayInput = int(input( "Please enter the day of the month from 1-31: " ))
print( )

# Tests if user input for day number is valid, prints error if not,
# and asks for another number; else, continues running program
while( dayInput < 1 or dayInput > 31 ):
    print( "Error: day number must be from 1-31!" )
    dayInput = int(input( "Please enter the day of the month from 1-31: " ))
    print( )
    
# Asks user for numeric year from 1582-4902
yearInput = int(input( "Please enter a year from 1582-4902: " ))
print( )

# Tests if user input for year number is valid, prints error if not,
# and asks for another number; else, continues running program
while( yearInput < 1582 or yearInput > 4902 ):
    print( "Error: year number must be from 1582-4902!" )
    yearInput = int(input( "Please enter a year from 1582-4902: " ))
    print( )

# Line that separates input from output and a blank line
print("-" * 80)
print( )

# Displays day entered in
print( "This date in history: ", monthInput, "/", dayInput, "/", yearInput )
print( )

# Sets month value to 13 if it is 1 and 14 if it is 2
if ( monthInput == 1 or monthInput == 2 ):
    monthInput = monthInput + 12
    yearInput = yearInput - 1

# Multiplies month by 2 and assigns it to new variable
resultA = monthInput * 2

# Adds 1 to month, mulitplies product by 3, divides that product by 5
# and assigns integer quotient to new variable
resultB = (( monthInput + 1 ) * 3 ) // 5

# Divides year by 4 and assigns integer quotient to new variable
resultC = yearInput // 4

# Divides year by 100 and assigns integer quotient to new variable
resultD = yearInput // 100

# Divides year by 400 and assigns integer quotient to new variable
resultE = yearInput // 400

# Adds day + 2 + year + results of step A through step E
# and assigns it to new variable
resultF = dayInput + 2 + yearInput + resultA + resultB + resultC + resultE

# Subtracts result of step D from result of step F
resultG = resultF - resultD

# Divides result from step G by 7 and assigns integer remainder
# within range of 0-6 to a variable
resultH = int( resultG % 7 )

# Calculates day of week based on value of step H and gives it string
# with name of weekday according to number system:
# // 0 = Saturday // 1 = Sunday // 2 = Monday // 3 = Tuesday //
# // 4 = Wednesday // 5 = Thursday // 6 = Friday //
if resultH == 0:
    dayOfWeek = "Saturday"
elif resultH == 1:
    dayOfWeek = "Sunday"
elif resultH == 2:
    dayOfWeek = "Monday"
elif resultH == 3:
    dayOfWeek = "Tuesday"
elif resultH == 4:
    dayOfWeek = "Wednesday"
elif resultH == 5:
    dayOfWeek = "Thursday"
else:
    dayOfWeek = "Friday"

# Display weekday of day
print( "The day of the week for this date in history is " + dayOfWeek + "." )



