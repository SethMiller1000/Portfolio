# Rock Paper Scissors- Program 3: CIS 1033
# Author: Seth Miller

# Import randInt function
from random import randint

# Explain purpose of program to user
print( "                WELCOME TO THE ROCK PAPER SCISSORS PROGRAM" )
print( "" )
print( "Hello! This program simulates a \"best out of five\" game of rock paper scissors" )
print( "       between you and another player that is actually your computer." )
print( "" )

# Ask user to select number for rock paper scissors
# where 1 = rock, 2 = paper, and 3 = scissors
print( "To play, choose the corresponding number for your \"weapon\":\n\t1 = Rock\n\t2 = Paper\n\t3 = Scissors")
print( "" )
print( "-" * 80 )
print( "" )
userChoice = int(input( "Please enter your selection: " ))
print( "" )

# Initialize user and computer win count variables
userWinCount = 0
cpuWinCount = 0

# While loop that calculates game result, displays information,
# and starts new game until user or computer wins 3 total games
while ( userWinCount != 3 ) & ( cpuWinCount != 3 ):

    # While loop that tests if user input is between 1 and 3 and prints error
    # and asks user for another selection until input is between 1 and 3
    while ( userChoice < 1 ) or ( userChoice > 3 ):
        print( "Error! Your selection must be between 1 and 3." )
        print( "" )
        print( "-" * 80 )
        print( "" )
        print( "1 = Rock   2 = Paper   3 = Scissors" )
        print( "" )
        userChoice = int(input( "Please make another selection: " ))
        print( "" )

    # Random integer generator for the computer's choice
    cpuChoice = randint( 1, 3 )

    # If/else statements that assigns string value to user and computer choice

    # 1 = Rock,  2 = Paper, &  3 = Scissors

    userWeapon = ""
    cpuWeapon = ""

    if ( userChoice == 1 ):
        userWeapon = "rock"
    elif ( userChoice == 2 ):
        userWeapon = "paper"
    elif ( userChoice == 3 ):
        userWeapon = "scissors"

    if ( cpuChoice == 1 ):
        cpuWeapon = "rock"
    elif( cpuChoice == 2 ):
        cpuWeapon = "paper"
    elif( cpuChoice == 3 ):
        cpuWeapon = "scissors"

    # Print user and computer choice
    print( "User choice:      " + str(userWeapon) )
    print( "Computer choice:  " + str(cpuWeapon) )
    print( "" )

    # If/else statement that compares user and computer's choices,
    # displays who won, and updates that player's win count
    
    if ( cpuChoice == 1 ) and ( userChoice == 2 ):
        # computer chose rock and user chose paper
        print( "Paper beats rock. User wins." )
        userWinCount = userWinCount + 1
        
    elif ( cpuChoice == 2 ) and ( userChoice == 1 ):
        # computer chose paper and user chose rock
        print( "Paper beats rock. Computer wins." )
        cpuWinCount = cpuWinCount + 1
        
    elif ( cpuChoice == 1 ) and ( userChoice == 3 ):
        # computer chose rock and user chose scissors
        print( "Rock beats scissors. Computer wins." )
        cpuWinCount = cpuWinCount + 1
        
    elif ( cpuChoice == 3 ) and ( userChoice == 1 ):
        # computer chose scissors and user chose rock
        print( "Rock beats scissors. User wins." )
        userWinCount = userWinCount + 1
        
    elif ( cpuChoice == 2 ) and ( userChoice == 3 ):
        # computer chose paper and user chose scissors
        print( "Scissors beats paper. User wins." )
        userWinCount = userWinCount + 1
        
    elif ( cpuChoice == 3 ) and ( userChoice == 2 ):
        # computer chose scissors and user chose paper
        print( "Scissors beats paper. Computer wins." )
        cpuWinCount = cpuWinCount + 1
        
    else:
        # User and computer chose same weapon
        print( "User and computer chose same \"weapon\". Match is a tie." )

    # Display current score
    print( "" )
    print( "Score: User- " + str(userWinCount) + "  Computer- " + str(cpuWinCount) )
    print( "" )
    print( "-" * 80 )
    print( "" )

    # Ask user to select a "weapon" again if user or computer win count
    # has not reached 3 yet
    if (userWinCount == 3):
        print( "                      Congratulations. You won the game!" )
    elif(cpuWinCount == 3):
        print( "           Sorry, the computer won the game. Better luck next time!" )
    else:
        print( "1 = Rock   2 = Paper   3 = Scissors" )
        print( "" )
        userChoice = int(input( "Please make another selection: " ))
        print( "" )
