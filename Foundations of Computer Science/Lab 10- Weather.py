# Calculates your location based on the weather
# Lab 10: CIS 1033
# Author: Seth Miller

# Input: Asks user for decimal value for temperature
# and converts to floating point value
temperature = float(input("Please enter the temperature as a floating point value: "))

# Process: Tests whether temperature is 100 degrees or more,
# between 32 & 100 degrees, or below 32 degrees,
# and assigns location value to it
if temperature >= 100:
    location = "Tatooine"
elif temperature >= 32:
    location = "Endor"
else:
    location = "Hoth"

# Displays current location calculated in previous steps
print("Your current location is " + location + ".")
