# Seth helping Zeke.
# Foundations of Computer Science
# 12/03/2018

inFile = open( "roman.txt", "r")

# Reading line
line = inFile.readline()

# while line isn't empty go again
while ( line != "" ):
    lineNumber = 0
    for x in range( len(line) ):
        if( line[x] == 'M' ):
            lineNumber += 1000
        elif( line[x] == 'D' ):
            lineNumber += 500
        elif( line[x] == 'C' ):
            lineNumber += 100
        elif( line[x] == 'L' ):
            lineNumber += 50
        elif( line[x] == 'X' ):
            lineNumber += 10
        elif( line[x] == 'V' ):
            lineNumber += 5
        elif( line[x] == 'I' ):
            lineNumber += 1

    print( line )
    print( lineNumber )
    line = inFile.readline()
