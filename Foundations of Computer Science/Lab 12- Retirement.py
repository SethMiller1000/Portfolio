# The Retirement Problem- Lab 12: CIS 1033
# Determines the salary of a person when they retire at 65 based on
# their current salary, its growth rate, and their current age
# Author: Seth Miller

# Asks user for current annual salary and current age
salary = float(input("Please enter your current annual salary: "))
age = int(input("Please enter your current age: "))

# Initializes salary growth rate variable
GROWTH_RATE = 0.03

# Updates salary and age when age is less than 65
while (age < 65):
    salaryIncrease = salary * GROWTH_RATE
    salary = salary + salaryIncrease
    age = age + 1

# Displays salary
print("Salary at retirement at age 65: $", format(salary, '.2f'))
