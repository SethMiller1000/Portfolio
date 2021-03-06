# Calculates your income tax based on the U.S. income tax of 1913
# Lab 10: CIS 1033
# Author: Seth Miller

# Input: asks user for income tax in dollars and assigns it to variable
income = float(input("Pleaser enter your income with no commas: $"))

# Input: assigns value to tax rate variables
TAX_RATE1 = 0.01
TAX_RATE2 = 0.02
TAX_RATE3 = 0.03
TAX_RATE4 = 0.04
TAX_RATE5 = 0.05
TAX_RATE6 = 0.06

# Input: assigns value to tax rate limit variables
TAX_LIMIT1 = 50000
TAX_LIMIT2 = 75000
TAX_LIMIT3 = 100000
TAX_LIMIT4 = 250000
TAX_LIMIT5 = 500000

# Process: Calculates tax for income less than or equal to $50,000
if income <= TAX_LIMIT1:
    totalTax = TAX_RATE1 * income

# Process: Calculates tax for income above $50,000 up to $75,000
elif income <= TAX_LIMIT2:
    tax1 = TAX_RATE1 * TAX_LIMIT1
    tax2 = TAX_RATE2 * (income - TAX_LIMIT1)
    totalTax = tax1 + tax2

# Process: Calculates tax for income above $75,000 up to $100,000
elif income <= TAX_LIMIT3:
    tax1 = TAX_RATE1 * TAX_LIMIT1
    tax2 = TAX_RATE2 * (TAX_LIMIT2 - TAX_LIMIT1)
    tax3 = TAX_RATE3 * (income - TAX_LIMIT2)
    totalTax = tax1 + tax2 + tax3

# Process: Calculates tax for income above $100,000 to $250,000
elif income <= TAX_LIMIT4:
    tax1 = TAX_RATE1 * TAX_LIMIT1
    tax2 = TAX_RATE2 * (TAX_LIMIT2 - TAX_LIMIT1)
    tax3 = TAX_RATE3 * (TAX_LIMIT3 - TAX_LIMIT2)
    tax4 = TAX_RATE4 * (income - TAX_LIMIT3)
    totalTax = tax1 + tax2 + tax3 + tax4

# Process: Calculates tax for income above $250,000 to $500,000
elif income <= TAX_LIMIT5:
    tax1 = TAX_RATE1 * TAX_LIMIT1
    tax2 = TAX_RATE2 * (TAX_LIMIT2 - TAX_LIMIT1)
    tax3 = TAX_RATE3 * (TAX_LIMIT3 - TAX_LIMIT2)
    tax4 = TAX_RATE4 * (TAX_LIMIT4 - TAX_LIMIT3)
    tax5 = TAX_RATE5 * (income - TAX_LIMIT4)
    totalTax = tax1 + tax2 + tax3 + tax4 + tax5

# Process: Calculates tax for income greater than $500,000
else:
    tax1 = TAX_RATE1 * TAX_LIMIT1
    tax2 = TAX_RATE2 * (TAX_LIMIT2 - TAX_LIMIT1)
    tax3 = TAX_RATE3 * (TAX_LIMIT3 - TAX_LIMIT2)
    tax4 = TAX_RATE4 * (TAX_LIMIT4 - TAX_LIMIT3)
    tax5 = TAX_RATE5 * (TAX_LIMIT5 - TAX_LIMIT4)
    tax6 = TAX_RATE6 * (income - TAX_LIMIT5)
    totalTax = tax1 + tax2 + tax3 + tax4 + tax5 + tax6

# Output: Displays tax
print("According to your income, your total tax will be $%.2f" %totalTax)
