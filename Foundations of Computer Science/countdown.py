n = int(input("Enter a positive integer: "))
message = ""
for n in range(n, -1, -1):
    value = ((str(n)) + "...")
    message = message + value
print(message + "Liftoff")