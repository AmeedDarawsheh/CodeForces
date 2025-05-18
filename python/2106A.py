def solve_test_case():
    n = int(input())
    s = input()
    ones_in_s = s.count('1')
    total_ones = 0
    for i in range(n):
        if s[i] == '0':
            total_ones += ones_in_s + 1
        else:
            total_ones += ones_in_s - 1
    return total_ones

t = int(input())
for _ in range(t):
    print(solve_test_case())