# Sum of Integers Demonstration- Lab 12: CIS 1033
# Author: Seth Miller

# total has an initial value of 0
total = 0

# get the first integer
# if the value is 0, loop is skipped and total is 0
number = int(input("Enter an ineger (0 to stop): "))

# numbr should be positive or negative integer
while (number !=0):
    # update total by adding value of number
    total = total + number

    # get a new value for number
    # 0 will stop the loop
    number = int(input("Enter an integer (0 to stop): "))

# total will be displayed either as 0 if loop did not run
# or total will be displayed as a positive or negative number
# depending on values entered for number
print("The sum is " + str(total))
