string = input()
count = 0

for i in range(len(string)):
    if string[i].isupper():
        count += 1

if count > len(string) - count :
    print(string.upper())
else:
    print(string.lower())