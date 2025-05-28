string = input().strip()
words = string.split('WUB')
original_song = ' '.join(word for word in words if word)
print(original_song)