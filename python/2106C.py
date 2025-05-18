def count_complementary_ways(t, test_cases):
    results = []

    for case in test_cases:
        n, k = case['n'], case['k']
        a, b = case['a'], case['b']

        expected_sum = None
        consistent = True

        for i in range(n):
            if b[i] != -1:
                current_sum = a[i] + b[i]
                if expected_sum is None:
                    expected_sum = current_sum
                elif expected_sum != current_sum:
                    consistent = False
                    break

        if not consistent:
            results.append(0)
            continue

        min_possible_x = 0
        max_possible_x = float('inf')

        for i in range(n):
            if b[i] == -1:
                min_possible_x = max(min_possible_x, a[i])
                max_possible_x = min(max_possible_x, a[i] + k)

        if expected_sum is not None:
            if min_possible_x <= expected_sum <= max_possible_x:
                results.append(1)
            else:
                results.append(0)
        else:
            count = max(0, max_possible_x - min_possible_x + 1)
            results.append(count)

    return results


if __name__ == "__main__":
    t = int(input())
    test_cases = []

    for _ in range(t):
        n, k = map(int, input().split())
        a = list(map(int, input().split()))
        b = list(map(int, input().split()))
        test_cases.append({'n': n, 'k': k, 'a': a, 'b': b})

    results = count_complementary_ways(t, test_cases)
    for res in results:
        print(res)