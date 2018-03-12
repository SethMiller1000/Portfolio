# Lab 15 The Number Patterns Problem
# Justin and Seth

counter = 1
endPoint = 1

while counter <= 6:
    string = ""
    number = 1
    
    while number <= endPoint:
        string = string + str(number) + " "
        number = number + 1
        
    print(string)
    endPoint = endPoint + 1
    counter = counter + 1
    
print()

counter = 1
endPoint = 6

while counter <= 6:
    string = ""
    number = 1
    
    while number <= endPoint:
        string = string + str(number) + " "
        number = number + 1
        
    print(string)
    endPoint = endPoint - 1
    counter = counter + 1
    
    
        
    
