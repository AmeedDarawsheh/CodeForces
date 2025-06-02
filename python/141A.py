from collections import Counter

guest = input().strip()
host = input().strip()
pile = input().strip()

combined = guest + host

if Counter(combined) == Counter(pile):
    print("YES")
else:
    print("NO")
