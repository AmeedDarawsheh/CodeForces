s = input().strip()
s = s[1:-1] 
if not s:
    print(0)
else:
    letters = s.split(", ")
    distinct_letters = set(letters)
    print(len(distinct_letters))