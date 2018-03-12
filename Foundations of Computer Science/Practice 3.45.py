weight = float(input("Enter weight in kg: "))
if weight < 0 :
    print("Error: weight cannot be negative.")
elif weight > 10 :
    print("Error: Weight > 10 kg. ")
else:
    print(weight)
