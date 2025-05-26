import math

t = int(input())

for _ in range(t):
    s = input().strip()
    year = int(s)
    
   
    sqrt_year = int(math.sqrt(year))
    
    if sqrt_year * sqrt_year != year:
        print(-1)
        continue
    print( 0, sqrt_year)
    print(sqrt_year - int(s[3:4]) , sqrt_year - int(s[1:0]))
