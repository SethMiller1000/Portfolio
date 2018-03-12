# Pennies Problem- Practice: CIS 1033
# Author: Seth Miller

# Explains purpose of program to user
print("Hello! This program calculates how much you will earn over a period of")
print("days when you start with a salary of a pennny a day and your salary")
print("doubles each day.")

# Initializes variables for salary, total earnings and current day
salary = 0.01
earnings = 0.00
currentDay = 0

# Asks user for number of days they worked
days = int(input("Please enter the number of days that you worked: "))

# Tests if entered amount of days is less than 0 and prints error if so;
# Else, runs while loop below
if ( days < 0 ):
    print("Error: amount of days cannot be negative!")
else:
    # Uses loop to update salary and total earnings until the number of days
    # specified by user is met
    while( currentDay < days ):
        earnings = earnings + salary
        salary = salary * 2
        currentDay = currentDay + 1

    # Displays earnings
    print("Your total earnings is", earnings)
