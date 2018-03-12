# The Gradebook Problem
# Lab 21- Operations on List: CIS 1033
# Author: Seth Miller

# Create gradebook with a list of students (rows in table)
grades = [['Munroe'],
          ['Summers'],
          ['Pryde'],
          ['Wagner'],
          ['Grey']]

# Add three test scores for each student
for row in range (5):

    # Display the name of the student & prompt for test scores
    print("Scores for " + grades[row][0])

    # Input three scores and place them into students' list
    for x in range(1,4):
        s = int(input("Enter score #" + str(x) + ": "))
        grades[row].append(s)
    print( "" )

# Print entire gradebook (unformatted)
print(grades)
print( "" )

# Add new student to gradebook
newStudent = input( "Enter the name of the new student: " )
newStudentInfo = [newStudent]
print( "" )

# Add three new test scores to gradebook for new student
print ( "Scores for " + newStudent )

newStudentScores = []
for i in range(1,4):
    score = int(input( "Enter score #" + str(i) + ": " ))
    newStudentInfo.append(score)
print( "" )
    
grades.append(newStudentInfo)

# Determine average test scores for each student and add to table
studentAverage = []
for x in range (len(grades)):
    sum = 0   
    for y in range (1,4):
        sum = sum + int(grades[x][y])
        
    average = sum / y
    studentAverage.append(average)

for i in range(len(grades)):
    grades[i].append(studentAverage[i])

# Assign each student letter grade based on average test score
# using traditional grading scale and add to table
for student in range (len(grades)):
    letterGrade = ''
    average = grades[student][4]

    if average >= 90:
        letterGrade = 'A'
    elif average >= 80:
        letterGrade = 'B'
    elif average >= 70:
        letterGrade = 'C'
    elif average >= 60:
        letterGrade = 'D'
    else:
        letterGrade = 'F'

    grades[student].append(letterGrade)

# Display updated table
print( "Updated grade table:" )
print( "" )
print( "Name\tAvg.\tGrade" )
print( "-" * 25 )

for i in range(len(grades)):
    print( grades[i][0] + "\t%.2f" %grades[i][4] + "\t" + grades[i][5])
