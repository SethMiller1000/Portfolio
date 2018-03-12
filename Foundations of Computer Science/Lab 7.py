# Lab 7- CIS 1033
# Author: Seth Miller

# USERNAME PROBLEM

# Input: stores first and last name of user and 3 digit number entered by user
firstName = input("Please enter your first name: ")
lastName = input("Please enter your last name: ")
userDigits = int(input("Please enter a three-digit number: "))

# Process: converts first and last name to lowercase
lowerFirst = firstName.lower()
lowerLast = lastName.lower()

# Process: stores first letter of lowercase first name and first 2 letters of last name
letter1 = lowerFirst[0]
letter2 = lowerLast[0]
letter3 = lowerLast[1]

# Process: multiplies user digits by 2 and multiplies result by 100
userDigits2 = ( userDigits % 2 ) * 100

# Process: converts userDigits2 to string and concatenates several variables to make final username
stringDigits = str(userDigits2)
userName = letter1 + letter2 + letter3 + stringDigits + "@bearcats.net"

# Output: Displays your username is -and- username
print("Your user name is " + userName)

# BOOKSTORE PROBLEM

# Input: stores total book price and number of books as a floating point and an integer respectively
totalPriceOfBooks = float(input("Please enter the total book price: $"))
numberOfBooks = int(input("Please enter the number of books ordered: "))

# Process: creates constants of tax percentage and shipping charge per book
TAX_PERCENTAGE  = 7.5
SHIPPING_CHARGE_PER_BOOK = 2.00

# Process: uses constants and variables entered by user to calculate tax and shipping charge
tax = totalPriceOfBooks * ( TAX_PERCENTAGE / 100 )
shippingCharge = SHIPPING_CHARGE_PER_BOOK * numberOfBooks

# Process: calculats priceOfOrder
priceOfOrder = totalPriceOfBooks + tax + shippingCharge

# Output: displays price of order
print("The price of your order is: $", priceOfOrder)

# MATH PRACTICE PROBLEM
      
# Input: prompts user to enter two integers
number1 = int(input("Please enter an integer: "))
number2 = int(input("Please enter another integer: "))
               
# Process: Calculates different operations with the two integers
sumOfIntegers = number1 + number2
differenceOfIntegers = number1 - number2
productOfIntegers = number1 * number2
averageOfIntegers = (number1 + number2) / 2
absValueDifferenceOfIntegers = abs(number1 - number2)
largestInteger = max(number1, number2)
smallestInteger = min(number1, number2)

# Output: Displays results of all calculations
print("The sum of the two integers is:", sumOfIntegers)
print("The difference of the two integers is:", differenceOfIntegers)
print("Tje product of the two integers is:", productOfIntegers)
print("The average of the two integers is:", averageOfIntegers)
print("The absolute value of the difference of the two integers is:", absValueDifferenceOfIntegers)
print("The largest integer is:", largestInteger)
print("The smallest integer is:", smallestInteger)
                    

                        
