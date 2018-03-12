# The Password Problem- Lab 9 CIS 1033
# Author: Seth Miller

# Input: Set default password
PASSWORD = "veggietales"

# Input: Prompt for and retrieve user password
userWord = input("Enter the password: ")

# Process: Update the value of userWord to its lower-case version
userWord = userWord.lower()

# Process: Check to see if user password matches default password
if userWord == PASSWORD:
    # Access to system is granted
    accessStatus = "Password Accepted"
else:
    # Access to system is denied
    accessStatus = "Password Rejected"
    
# Output: Display result of password entry and evaluation
print(accessStatus)
