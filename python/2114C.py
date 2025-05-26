t = int(input())

for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))
    if n == 1:
        print(1)
        continue
    count = 1
    last = a[0] 
    
    for i in range(1, n):
        if a[i] > last + 1:
            count += 1
            last = a[i]
    
    print(count)