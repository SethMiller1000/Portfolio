# The List Exercises
# Lab 19- CIS 1033
# Author: Seth Miller

## Review Exercise 6.2
print( "Review Exercise 6.2" )
print( "" )

# Initialize and declare array "a"
a = [1, 2, 3, 4, 5, 4, 3, 2, 1, 0]

# 6.2 A
total = 0
for i in range (10):
    total = total + a[i]

print( "6.2 A" )
print( total )
print( "" )

# 6.2 B
total = 0
for i in range (0, 10, 2):
    total = total + a[i]
    
print( "6.2 B" )
print( total )
print( "" )

# 6.2 E
total = 0
i = 1
while i < 10:
    total = total + a[i]
    i = 2 * i
    
print( "6.2 E" )
print( total )
print( "" )

# 6.2 F
total = 0
for i in range (9, -1, -1):
    total = total + a[i]

print( "6.2 F" )
print( total )
print( "" )

# 6.2 H
total = 0
for i in range (0, 10):
    total = a[i] - total
    
print( "6.2 H" )
print( total )
print( "" )

## Review Exercise 6.4
print( "Review Exercise 6.4" )
print( "" )

# 6.4 A
print( "6.4 A" )
for i in range (1, 10):
    a[i] = a[i - 1]

for i in range (10):
    print(a[i])
print( "" )

a = [1, 2, 3, 4, 5, 4, 3, 2, 1, 0]

# 6.4 B
print( "6.4 B" )
for i in range (9, 0, -1):
    a[i] = a[i - 1]

for i in range (10):
    print(a[i])
print( "" )

a = [1, 2, 3, 4, 5, 4, 3, 2, 1, 0]

# 6.4 C
print( "6.4 C" )
for i in range (9):
    a[i] = a[i + 1]

for i in range (10):
    print(a[i])
print( "" )

a = [1, 2, 3, 4, 5, 4, 3, 2, 1, 0]

# 6.4 E
print( "6.4 E" )
for i in range (1, 10):
    a[i] = a[i] + a[i - 1]
    
for i in range (10):
    print(a[i])
print( "" )

a = [1, 2, 3, 4, 5, 4, 3, 2, 1, 0]

# 6.4 F
print( "6.4 F" )
for i in range (1, 10, 2):
    a[i] = 0

for i in range (10):
    print(a[i])
print( "" )
