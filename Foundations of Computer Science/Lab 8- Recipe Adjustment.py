# Lab 8: Recipe Adjustment Problem- adjusts recipe for different
# numbers of cookies
# Author: Seth Miller

# Input: assigns value to variables for sugar, butter, and flour
# needed to make 48 cookies
cupsSugar = 1.5
cupsButter = 1
cupsFlour = 2.75

# Input: assigns value of 48 to cookies made with
# previously stated ingredient amounts
cookiesMadeInRecipe = 48

# Input: asks user for number of cookies that need to be made
# and assigns it to new variable
cookiesNeeded = int(input("How many cookies need to be made?: "))

# Process: caculates ratio of cookies needed
# to cookies made in original recipe
recipeRatio = cookiesNeeded / cookiesMadeInRecipe

# Process: Adjusts recipe ingredients' values
# for amount of cookiesNeeded
newCupsSugar = cupsSugar * recipeRatio
newCupsButter = cupsButter * recipeRatio
newCupsFlour = cupsFlour * recipeRatio

# Output: Displays number of cups of sugar, butter, and flour needed
# with blank line before lines
print("")
print("Cups of sugar needed: %6.2f" % newCupsSugar)
print("Cups of butter needed: %5.2f" % newCupsButter)
print("Cups of flour needed: %6.2f" % newCupsFlour)
