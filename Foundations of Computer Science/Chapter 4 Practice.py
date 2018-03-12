# Python for Everyone Chapter 4 -Loops- Self Check
# Author: Seth Miller

RATE = 10.0
INITIAL_BALANCE = 10000.0
TARGET = 2 * INITIAL_BALANCE

balance = INITIAL_BALANCE
year = 0

while balance < TARGET :
    year = year + 1
    interest = balance * RATE / 100
    balance = balance + interest
    print(balance)

print("The investment doubled after", year, "years.")
