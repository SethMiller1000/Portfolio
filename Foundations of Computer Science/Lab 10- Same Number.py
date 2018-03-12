# Lab 10: CIS 1033
# Calculates and displays if three entered numbers
# are all the same, all different, or neither
# Author: Seth Miller

# Asks user for 3 numbers and assigns them to variables
number1 = int(input("Please enter integer 1 > "))
number2 = int(input("Please enter intger 2 > "))
number3 = int(input("Please enter integer 3 > "))

# Calculates if numbers are all the same & prints statement if they are
if number1 == number2 and number2 == number3:
    print("The integers are all the same")
    
# Calculates if numbers are all different & prints statement if they are
elif number1 != number2 and number2 != number3 and number1 != number3:
    print("The integers are all different")
    
# Prints statement stating that numbers
# are neither all the same nor all different
else:
    print("The integers are neither all the same nor all different.")
