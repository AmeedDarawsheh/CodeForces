
n, k, l, c, d, p, nl, np = map(int, input().split())


total_drink = k * l
total_lime_slices = c * d
total_salt = p


toasts_by_drink = total_drink // (n * nl)
toasts_by_limes = total_lime_slices // n
toasts_by_salt = total_salt // (n * np)


print(min(toasts_by_drink, toasts_by_limes, toasts_by_salt))
