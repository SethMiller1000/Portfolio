# Burn Calories Program
# Author: Seth Miller

# Input

caloriesBurnedHourlyBiking = 200
hoursSpentBiking = 1.5

caloriesBurnedHourlyJogging = 475
hoursSpentJogging = 2

caloriesBurnedHourlySwimming = 275
hoursSpentSwimming = 0.5

CALORIES_BURNED_PER_POUND = 3500

# Process

caloriesBurnedBiking = caloriesBurnedHourlyBiking * hoursSpentBiking
caloriesBurnedJogging = caloriesBurnedHourlyJogging * hoursSpentJogging
caloriesBurnedSwimming = caloriesBurnedHourlySwimming * hoursSpentSwimming

totalCaloriesBurned = caloriesBurnedBiking + caloriesBurnedJogging + caloriesBurnedSwimming
totalPoundsLost = totalCaloriesBurned / CALORIES_BURNED_PER_POUND

# Output

print("Welcome to the Python Exercise Clinic!")
print("Here are the number of hours spent in each activity.")
print()
print("Bicycling:", +hoursSpentBiking, "hour(s)")
print("Jogging:", +hoursSpentJogging, "hour(s)")
print("Swimming:", +hoursSpentSwimming, "hour(s)")
print()
print("Calories burned:", +totalCaloriesBurned)
print("Pounds lost:", +totalPoundsLost)
