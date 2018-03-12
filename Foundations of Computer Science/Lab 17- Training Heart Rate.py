# The Training Heart Rate Problem
# Lab 17: CIS 1033
# Author: Seth Miller

# function that calculates training heart rate
# based on age and resting heart rate
def trainingHeartRate( age, restingHeartRate ) :
    maxHeartRate = 220 - age
    result = maxHeartRate - restingHeartRate
    result2 = result * 0.60
    trainingHeartRate = result2 + restingHeartRate
    return trainingHeartRate

# MAIN METHOD #

# Explain purpose of program to user
print("           Hello! This program calculates your training heart rate")
print("                based on your age and resting heart rate.")
print( "" )

# Ask user for age and resting heart rate
ageInput = int(input("Please enter your age: "))
restingRateInput = int(input("Please enter your heart rate when resting: "))
print( "" )

# Call function to calculate training heart rate
userTrainingRate = trainingHeartRate( ageInput, restingRateInput )

# Display training heart rate of user
print("Your training heart rate is " + str(userTrainingRate) + ".")

