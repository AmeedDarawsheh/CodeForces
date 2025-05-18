k, n, w = map(int, input().split())
cost = 0
for item in range(1, w + 1):
    cost += k * item
total = cost - n
print(max(0, total))