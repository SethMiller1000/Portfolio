# Lab 6- Day Number Program (CIS 1033)
# Calculates the day when given the number of a day
#(with 0 = Sunday, 1 = Monday, etc.)
# Author: Seth Miller


# Define a string called names containing "SunMonTueWedThuFriSat"
names = "SunMonTueWedThuFriSat"

# Give variable -dayNumber- a value of 4
dayNumber = 4

# Compute the starting position as 3 x -dayNumber-
startingPosition = 3 * dayNumber

# Get the characters at starting position, position + 1, & position + 2
char1 = names [startingPosition]
char2 = names [startingPosition + 1]
char3 = names [startingPosition + 2]

# Concatenate them
day = char1 + char2 + char3

# Display the result
print( day )

