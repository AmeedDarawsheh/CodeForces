n = int(input())

count = 0
string = ""
for i in range(1, n + 1):
    if i % 2 != 0:
      string+= "I hate "
      if i != n:
        string+= "that "
    else:
      string+= "I love "
      if i != n:
        string+= "that "

print(string+"it")
       