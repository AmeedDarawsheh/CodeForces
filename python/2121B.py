t = int(input())
for _ in range(t):
    n = int(input())
    s = input()
    found = False
    for i in range(1, n - 1):
        b = s[i]
        if b in s[:i] or b in s[i+1:]:
            found = True
            break
    print("Yes" if found else "No")
