# Lab 10: CIS 1033
# Calculates thesize of tip the restaurant suggests that you give
# Based on the price of the meal and your level of satisfaction
# Author: Seth Miller

# Input: Explains purpose of program to user
print("Hello! This program calculates the size of the tip")
print("a restaurant suggests that you give based on")
print("the price of the meal and your level of satisfaction.")
print( )

# Input: Asks user for price of meal
priceOfMeal = float(input("Please enter the price of the meal: $"))
print( )

# Input: Explains the level of satisfaction system to user
print("For the level of satisfaction system:\n\t1 = totally satisfied\n\t2 = satisfied\n\t3 = dissatisfied")

# Input: Asks user to enter number based on level of satisfaction system
levelSatisfactionNumber = int(input("Please enter your level of sastisfaction: "))

# Process: Assigns mumeric values to different levels of satisfaction and
#          suggested tip percentage of meal for each level of satisfaction
if levelSatisfactionNumber == 1:
    levelOfSatisfaction = "Totally satisfied"
    tipPercentage = 20
elif levelSatisfactionNumber == 2:
    levelOfSatisfaction = "Satisfied"
    tipPercentage = 15
elif levelSatisfactionNumber == 3:
    levelOfSatisfcation = "Dissatisfied"
    tipPercentage = 10
else:
    print("Error: Invalid level of satisfaction entered!")
                          
# Process: Calculates size of tip based on percentage and price of meal
tip = priceOfMeal * (tipPercentage / 100)

# Output: Displays satisfaction level and tip in dollars in cents
print("Satisfaction level: " + levelOfSatisfaction)
print("Tip amount: $%.2f" %tip)
