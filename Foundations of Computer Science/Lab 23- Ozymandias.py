# The Ozymandias Problem
# Lab 23- Processing Input Files: CIS 1033
# Author: Seth Miller

# Open text file for reading
inputFile = open( "ozymandias.txt", "r" )

# Initialize word count, character count, and longest word variable
wordCount = 0
charCount = 0
longestWord = ""
wordList = []

# While loop that reads each line, splits up words, and adds them into list
for line in inputFile:
    wordList = wordList + line.split()

# Set word count to length of word list
wordCount = len( wordList )

# Close file
inputFile.close

# For loop that processes each element in wordList list
for i in range( len(wordList) ):

    # For loop that increments charCount for each character that is not a space
    for char in range ( len(wordList[i]) ):
        if ( char != ' ' ):
            charCount = charCount + 1
            
    # Remove punctuation and quotation marks
    wordList[i] = wordList[i].strip( " ' " )
    wordList[i] = wordList[i].strip( ' " ' )
    wordList[i] = wordList[i].strip( '.,?!:' )

    # If word is longer than longest word, set longest word to word
    if ( len(wordList[i]) > len(longestWord) ):
        longestWord = wordList[i]

# Display program description
print( "The Ozymandias Problem Program" )
print(  )
print( "-" * 80 )
print(  )

# Display word count, character count, and longest word
print( "Number of words in the poem :", wordCount )
print(  )
print( "Number of non-space characters in the poem :", charCount )
print(  )
print( "Longest word in the poem : " + longestWord )
