n = int(input())
names = {}
for _ in range(n):
    name = input()
    if name not in names:
        names[name] = 1
        print("OK")
    else:
        new_name = name + str(names[name])
        while new_name in names:
            names[name] += 1
            new_name = name + str(names[name])
        names[new_name] = 1
        names[name] += 1
        print(new_name)
