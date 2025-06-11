n = int(input())
events = list(map(int, input().split()))

free_officers = 0
untreated_crimes = 0

for event in events:
    if event == -1:
        if free_officers > 0:
            free_officers -= 1
        else:
            untreated_crimes += 1
    else:
        free_officers += event

print(untreated_crimes)
