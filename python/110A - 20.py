n = input()
count = 0
for ch in n:
    if ch in "47":
        count += 1

if all(c in "47" for c in str(count)):
    print("YES")
else:
    print("NO")