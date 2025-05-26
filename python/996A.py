n = int(input())

const = [100, 20, 10, 5, 1]
count = 0

for bill in const:
    count += n // bill
    n %= bill

print(count)

# OR : 

# n = int(input())

# const = [1, 5, 10, 20, 100]
# count = 0

# while n > 0:
#     if n >= const[-1]:  
#         n -= const[-1]
#         count += 1
#     else:
#         const.pop()  

# print(count)
