n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
c = set(a[1:]).union(set(b[1:]))
for i in range(1, n + 1):
    if i not in c:
        print("Oh, my keyboard!")
        break
else:
    print("I become the guy.")