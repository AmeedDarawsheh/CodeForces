username = input().strip()
distinct_characters = set(username)
distinct_count = len(distinct_characters)

if distinct_count % 2 == 0:
    print("CHAT WITH HER!")
else:
    print("IGNORE HIM!")
    