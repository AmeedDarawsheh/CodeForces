n = int(input())
numbers = list(map(int, input().split()))

even_count = sum(num % 2 == 0 for num in numbers)

if even_count > 1:
    # Find the odd number
    for i, num in enumerate(numbers):
        if num % 2 != 0:
            print(i + 1)
            break
else:
    # Find the even number
    for i, num in enumerate(numbers):
        if num % 2 == 0:
            print(i + 1)
            break
