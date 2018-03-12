# The Alien Bacteria Spores Problem- Lab 12: CIS 1033
# Calculates how many hours it takes 2000 spores at a 15% growth rate
# to grow to over 1,000,000 spores
# Author: Seth Miller

# Initializes spore count, growth rate, and hours variables
sporeCount = 2000
GROWTH_RATE = 0.15
hours = 0

# While loop that updates spore count and hours variables
# until spore count is over 1,000,000
while (sporeCount <= 1000000):
    additionalSpores = sporeCount * GROWTH_RATE
    sporeCount = sporeCount + additionalSpores
    hours = hours + 1

# Displays hours
print("Hours elapsed:", hours)
