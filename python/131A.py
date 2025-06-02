word = input()

if word.isupper() or (len(word) > 1 and word[1:].isupper()):
    print(word.swapcase())
elif len(word) == 1 and word.islower():
    print(word.upper())
else:
    print(word)
