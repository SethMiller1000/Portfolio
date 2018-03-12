# Lab 6- Phone Number Program (CIS 1033)
# Converts a ten-digit phone number into a more readable format
# Author: Seth Miller

# Input: enter ten-digit phone number string with no formatting
phoneNumber = "8162881381"

# Process: extract each character of phone number string and assign it to a variable
char1 = phoneNumber[0]
char2 = phoneNumber[1]
char3 = phoneNumber[2]
char4 = phoneNumber[3]
char5 = phoneNumber[4]
char6 = phoneNumber[5]
char7 = phoneNumber[6]
char8 = phoneNumber[7]
char9 = phoneNumber[8]
char10 = phoneNumber[9]

# Process: concatenate first 3 digit characters to make first part of phone number
part1PhoneNumber = char1 + char2 + char3

# Process: concatenate next 3 digit characters to make second part of phone number
part2PhoneNumber = char4 + char5 + char6

# Process: concatenate last 4 digit characters to make third part of phone number
part3PhoneNumber = char7 + char8 + char9 + char10

readablePhoneNumber = "(" + part1PhoneNumber + ") " + part2PhoneNumber + "-" + part3PhoneNumber

# Output: Display phone number in new format
print(readablePhoneNumber)
