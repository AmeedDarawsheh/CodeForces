n = int(input())
coins = list(map(int, input().split()))
coins.sort(reverse=True)
total = sum(coins)
current_sum = 0
count = 0
for coin in coins:
    current_sum += coin
    count += 1
    if current_sum > total - current_sum:
        break
print(count)
