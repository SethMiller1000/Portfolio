# The Gradebook Problem- Grade Analyzer
# Lab 22- Operations on Lists: CIS 1033
# Author: Seth Miller

# Open file
inFile = open( "studentgrades.txt", "r" )

# Read line of text from file
line = inFile.readline()

# While line of text is not empty
while line != "":

    # Divide line of text into list of names
    list = line.split()

    # Store first value in list as student name
    name = list[0]

    # Initialize total points to 0
    total = 0

    # Start counter at 1
    count = 1

    # While there are less than 3 test scores to analyze
    while (count <= 3):

        # Get score from the list
        score = int(list[count])

        # Add score to total points
        total = total + score

        # Increment test score counter
        count = count + 1

    # Determine average of three test scores
    avg = total // 3

    # Display name of student and average
    print(name + ": " + str(avg))

    # Read line of text from file
    line = inFile.readline()

# Close file
inFile.close()
