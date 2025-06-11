n = int(input())

for _ in range(n):
    num = list(map(int, input().split()))
    intg = max(num)
    num.remove(intg)
    if intg == sum(num):
        print("YES")
    else:
        print("NO")
