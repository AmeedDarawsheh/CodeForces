n = int(input())
groups = list(map(int, input().split()))

count = [0] * 5
for g in groups:
    count[g] += 1

cars = count[4]               
cars += count[3]              
count[1] = max(0, count[1] - count[3])  

cars += count[2] // 2         
if count[2] % 2:              
    cars += 1
    count[1] = max(0, count[1] - 2)  

cars += (count[1] + 3) // 4   

print(cars)
