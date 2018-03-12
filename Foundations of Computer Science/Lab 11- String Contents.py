# The String Contents Problem- Lab 11: CIS 1033
# Seth Miller and Kaitlin Coker

# Explains purpose of program to user
print("Hello! This program takes a string that you enter in and tells you what the string contains.")

# Ask user for string
userString = input("Please enter a string ---> ")

# Tests if it contains only letters
if userString.isalpha():
    print("This string contains only letters.")

# Tests if it contains only uppercase letters
if userString.isupper():
    print("This string contains only uppercase letters.")

# Tests if it contains only lowercase letters
if userString.islower():
    print("This string contains only lowercase letters.")

# Tests if it contains only digits
if userString.isdigit():
    print("This string contains only digits.")

# Tests if it contains only letters and digits
if userString.isalnum():
    print("This string contains only letters and digits.")

# Tests if it starts with an uppercase letter
firstCharacter = userString[0]
if firstCharacter.isupper():
    print("This string starts with an uppercase letter.")

# Tests if it ends with a period
if userString.endswith("."):
    print("This string ends with a period.")
