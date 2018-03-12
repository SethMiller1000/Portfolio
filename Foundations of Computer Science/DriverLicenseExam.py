# The Driver's License Exam Problem
# Lab 28- Writing Software from Start to Finish: CIS 1033
# Author: Seth Miller

# Create list of the order of correct answers
answerKey = [ "B", "D", "A", "A", "C",
              "A", "B", "A", "C", "D",
              "B", "C", "D", "A", "D",
              "C", "C", "B", "D", "A" ]

# Initialize constant with value of number of questions needed to pass
# and variable set to 0 for number of correct answers entered by test taker
SCORE_TO_PASS = 15
correctAnswers = 0

# Explain purpose of program to user
print( "                       --DRIVER'S LICENSE EXAM GRADER--" )
print( "                    For use by Springfield DMV staff only!" )
print( )
print( "-" * 80 )
print( )
print( "        For each question, please enter the letter answer entered by the\n"
       + "                test taker, or a single space if left blank." )
print( )

# For each question, ask the user for the letter answer of the test taker
for i in range( len(answerKey) ):
    answer = input( " Question " + str(i + 1) + ": " )

    # While input is not uppercase or lowercase A, B, C, D, or space,
    # display error message, and ask user for answer again
    while (answer != "A") and (answer != "a") and (answer != "B") and (answer!= "b") and (answer != "C") and (answer != "c") and (answer != "D") and (answer != "d") and (answer != " "):
        print( )
        print( "ERROR: Answer entered is not valid test answer! Try again." )
        print( )
        answer = input( " Question " + str(i + 1) + ": " )

    # Capitalize it if is not a space, and append it to list of answers
    # entered by test taker, even if it is a space
    if ( answer != " " ):
        answer = answer.upper()

    # If test taker's answer matches the answer of that question
    # on the answer key list, increment count of correct answers of user
    if ( answer == answerKey[i] ):
        correctAnswers = correctAnswers + 1

# If the count of correct answers entered by user is >= 15 (score to pass),
# display message that the test taker passed; else,
# display message that the user failed along with their test score
print( )
print( "-" * 80 )
print( )
if ( correctAnswers >= SCORE_TO_PASS ):
    print( "   This person PASSED the driver's exam. They earned their driver's license!" )
else:
    print( "\tThis person FAILED the driver's exam. Better luck next time. :)")
