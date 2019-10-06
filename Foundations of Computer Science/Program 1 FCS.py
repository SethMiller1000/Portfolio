# Program that calculates the wind chill
# based on the temperature and windspeed the user enters
# Program 1- CIS 1033
# Author: Seth Miller

# Prints a statement that explains what the program does to the user
print("             Hello! This program calculates the wind chill")
print("         based on the temperature and wind speed that you enter.")
print()

# Input: Asks user to enter in temperature between -58 & +41 degrees
#        Fahrenheit and wind speed greater than or equal to
#        2 miles per hour, and assigns them to variables

temperatureInput = input("Please enter a numeric temperature between -58 and +41 degrees Fahrenheit: ")
windSpeedInput = input("     Please enter a numeric wind speed of 2 or more miles per hour: ")

# Process: Converts inputs into floating point values

temperature = float(temperatureInput)
windSpeed = float(windSpeedInput)

# Process: Calculates wind chill using temperature and wind speed
#          and assigns it to a variable

windChill = 35.74 + (0.6215 * temperature) - (35.75 * (windSpeed ** 0.16)) + (0.4275 * temperature * (windSpeed ** 0.16))

# Output: Displays windchill in clean format

print()
print("                        Wind chill: %4.1f" % windChill, "degrees.")
