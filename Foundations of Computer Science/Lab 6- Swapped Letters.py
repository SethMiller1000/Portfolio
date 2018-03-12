# Lab 6- Swapped Letters Program (CIS 1033)
# Swaps letters in a word
# Author: Seth Miller

# Input: enter the word and the letters that will be swapped
myString = "marmalade"
l1 = "a"
l2 = "e"

# Process: swap the letters l1 and l2
myStringSwap1 = myString.replace( l1, "*" )
myStringSwap2 = myStringSwap1.replace( l2, l1 )
myStringSwap3 = myStringSwap2.replace( "*", l2 )

# Output: display the result 
print ( myStringSwap3 )
