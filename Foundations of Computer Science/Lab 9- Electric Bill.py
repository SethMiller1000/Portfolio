# The Electric Bill Problem- Lab 9 CIS 1033
# Author: Seth Miller

# Input: receives the meter reading for the previous
# and current month from the user
prevMonthMeterReading = int(input("Meter reading for previous month: "))
currentMonthMeterReading = int(input("Meter reading for current month: "))

# Input: assigns values to flat monthly fee
# and charge per extra kilowatt hour variable
FLAT_MONTHLY_FEE = 20
CHARGE_PER_EXTRA_KILOWATT_HOUR = 0.03

# Process: calculates usage for the month in kilowatt hours
usageForMonth = currentMonthMeterReading - prevMonthMeterReading

# Process: tests if there is an added fee and calculates total bill
if (usageForMonth > 300):
    addedFee = CHARGE_PER_EXTRA_KILOWATT_HOUR * (usageForMonth - 300)
    totalBill = FLAT_MONTHLY_FEE + addedFee
else:
    totalBill = FLAT_MONTHLY_FEE

# Output: displays the usage and the total bill for the month
print("Usage for the month is " + str(usageForMonth) + " kilowatt hours.")
print("Total bill for the month is $" + str(totalBill) + ".")
