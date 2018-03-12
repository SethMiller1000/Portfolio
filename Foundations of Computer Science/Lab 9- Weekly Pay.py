# The Weekly Pay Problem- Lab 9 CIS 1033
# Author: Seth Miller

# Get the number of hours worked
hrs = float(input("How many hours did you work? "))

# Get the hourly wage
wage = float(input("What is your hourly wage? "))

# Determine overtime pay for more than 40 hours
if (hrs <= 40):
    # regular pay
    pay = hrs * wage
else:
    # overtime pay
    pay = (40 * wage) + ((hrs - 40) * (wage * 1.5))

# Convert pay to string and format it as currency
paycheck = "$" + format(pay, ".2f")

# Display the pay for the week
print("Your pay this week is " + paycheck)
