t = int(input())
for _ in range(t):
    n, s = map(int, input().split())
    x = list(map(int, input().split()))
    min_x = min(x)
    max_x = max(x)
    steps = max_x - min_x + min(abs(s - min_x), abs(s - max_x))
    print(steps)