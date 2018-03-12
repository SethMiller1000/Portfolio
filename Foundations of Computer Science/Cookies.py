# The Cookie Calorie Program
# Author: Seth Miller

# Input
COOKIES_PER_BAG = 40
SERVINGS_PER_BAG = 10
CALORIES_PER_SERVING = 300
cookiesEaten = 5

# Process
cookiesPerServing = COOKIES_PER_BAG / SERVINGS_PER_BAG
amountOfServingsEaten =  cookiesEaten / cookiesPerServing
caloriesConsumed = amountOfServingsEaten * CALORIES_PER_SERVING

# Output
print(caloriesConsumed)
