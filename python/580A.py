n = int(input())
a = list(map(int, input().split()))
count = 1
max_len = 1
for i in range(1,n):
    
    if a[i] >= a[i-1] :
        count += 1
        max_len = max(max_len, count)
    else:
        count = 1
        max_len = max(max_len, count)

print(max_len)