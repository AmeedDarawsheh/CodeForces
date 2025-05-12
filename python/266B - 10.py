a, b = map(int, input().split())
string = list(input())

for _ in range(b):
    i = 0
    while i < a - 1:
        if string[i] == 'B' and string[i + 1] == 'G':
            string[i], string[i + 1] = string[i + 1], string[i]
            i += 1  # skip the next index to avoid double swapping
        i += 1
print("".join(string))