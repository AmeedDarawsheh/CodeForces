n = int(input())
count = 0
pairs = []


for i in range(n):
    h, a = map(int, input().split())
    pairs.append((h, a))


for i in range(n):
    for j in range(n):
        if i != j and pairs[i][0] == pairs[j][1]:
            count += 1

print(count)
