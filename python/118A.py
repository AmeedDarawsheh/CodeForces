string = input()
string = string.lower()
target = "aoyeui"
result = ""
for char in string:
    if char not in target:
        result += "." + char
print(result)