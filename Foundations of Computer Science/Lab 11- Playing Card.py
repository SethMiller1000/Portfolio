# Playing Card Problem- Lab 11: CIS 1033
# Seth Miller and Kaitlin Coker
# Utilizing string analysis

# Explains purpose of program and card identification system to user
print("This program will display a playing card when you input it in shorthand notation.")
print()
print("To enter a card, type the letter or number for the value of the card, and then a letter for the type of card.")
print("C = Club, D = Diamonds, H = Hearts, S = Spades, " + 
     "A = Ace, J = Jack, Q = Queen, K = King, and 2-10 = Card Number Values.") 

# Asks user for card identity (value and type) in shorthand notation
cardInput = input("Please enter the card in the shorthand notation shown above:")

# Extracts first and second characters from input
cardValue = cardInput [0]
cardType = cardInput [1]

# Analyzes first character to calculate card value
if cardValue == 'Q':
    value = "Queen" 
elif cardValue == 'K':
    value = "King"
elif cardValue == 'J':
    value = "Jack"
elif cardValue == 'A':
    value = "Ace" 
elif cardValue == '2':
    value = "Two"
elif cardValue == '3':
    value = "Three"
elif cardValue == '4':
    value = "Four"
elif cardValue == '5':
    value = "Five"
elif cardValue == '6':
    value = "Six"
elif cardValue == '7':
    value = "Seven"
elif cardValue == '8':
    value = "Eight"
elif cardValue == '9':
    value = "Nine"

# Tests if user input is 3, and adjusts for calculating card type and value
elif len(cardInput) == 3:
    valueInput = cardInput[0] + cardInput[1]
    if valueInput == "10":
        value = "Ten"
        cardType = cardInput[2]

# Analyzes second charater to calculate card type
if cardType == 'S':
    typeCard = "Spades" 
elif cardType == 'C':
    typeCard = "Clubs"
elif cardType == 'H':
    typeCard = "Hearts"
elif cardType == 'D':
    typeCard = "Diamonds"

# Prints value and type of card
print(value + " of " + typeCard)
