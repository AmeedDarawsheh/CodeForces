s = input()
numbers = [int(ch) for ch in s if ch.isdigit()]
numbers.sort()
print('+'.join(map(str, numbers)))
