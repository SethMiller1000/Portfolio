# Repetition with the while loop- Lab 12: CIS 1033
# Author: Seth Miller

# Initializes variables
numGames = 3
counter = 0
totalScore = 0

# Asks user for bowling score three times and updates total score and counter
while (counter < numGames):
    bowlingScore = int(input("Enter a bowling score: "))
    totalScore = totalScore + bowlingScore
    counter = counter + 1

# Calculates average
avgScore = totalScore / numGames

# Displays average
print("Average score: ", format(avgScore, '.1f'))
