a, b = map(int, input().split())
fashion_days = min(a, b)
remaining_socks = abs(a - b)
same_days = remaining_socks // 2
print(fashion_days, same_days)

