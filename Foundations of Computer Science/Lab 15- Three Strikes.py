# The Three Strikes Problem
# Lab 15 -Nested Loops- CIS 1033
# Authors: Seth Miller & Justin Dalka

strikeCount = 0
outCount = 0

while ( outCount < 3 ):
    
    while ( strikeCount < 3 ):
        
        strikeCount = strikeCount + 1
        print("Strike", strikeCount)
        
    outCount = outCount + 1
    strikeCount = 0
    print("Out number", outCount)
    
print("End of the inning")
