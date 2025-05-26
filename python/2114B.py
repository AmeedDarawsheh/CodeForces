t = int(input())

for _ in range(t):
    n, k = map(int, input().split())
    s = input().strip()
    
    c0 = s.count('0')
    c1 = n - c0
    
    non_matching = n // 2 - k
    if non_matching < 0:
        print("NO")
        continue
    
    z = c0 + k - n // 2
    lower = (z + 1) // 2
    upper = z // 2
    
    if 0 <= lower <= k and 0 <= upper and lower <= upper:
        print("YES")
    else:
        print("NO")