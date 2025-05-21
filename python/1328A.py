t = int(input())

for _ in range(t):
    a, b = map(int, input().split())
    result = (b - a % b) % b
    print(result)
