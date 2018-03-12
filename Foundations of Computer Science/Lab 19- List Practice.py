# The List Practice Problem
# Lab 19- CIS 1033
# Author: Seth Miller

### Programming Exercise 6.1 ( page 373 ) ###

# Initialize list
myList = [4, 8, 15, 16, 23, 42, 1, 10, 100, 1000]

## 1ST OUTPUT LINE ##
output = ""

# 1st line loop
for i in range(0, 10, 2):
    output = output + str(myList[i]) + " "

# Display first line
print(output)

## 2ND OUTPUT LINE ##
output = ""

# 2nd line loop
for i in range(10):
    if ( myList[i] % 2 == 0 ):
        output = output + str(myList[i]) + " "

# Display second line
print(output)

## 3RD OUTPUT LINE ##
output = ""

# 3rd line loop
for i in range(9,-1,-1):
    output = output + str(myList[i]) + " "

# Display third line
print(output)

## 4TH OUTPUT LINE ##
output = ""
output = str(myList[0]) + " " + str(myList[len(myList) - 1])

# Display fourth line
print(output)
