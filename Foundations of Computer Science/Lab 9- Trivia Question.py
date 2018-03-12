# The Trivia Question Problem- Lab 9 CIS 1033
# Author: Seth Miller

# Input: asks the user to enter answer to trivia question
# and sets correct answer to Titanic
userAnswer = input("Which movie won the Academy Award for Best Picture in 1997? ")
CORRECT_ANSWER = "Titanic"

# Process/Output: tests if user answered correctly
# and displays answer result
if (userAnswer == CORRECT_ANSWER):
    print("You are correct. Congratulations; you've won $1,000,000!!!")
else:
    print("You are incorrect. Better luck next time. :)")
    
