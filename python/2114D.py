import sys
input = sys.stdin.readline

t = int(input())
for _ in range(t):
    n = int(input())
    monsters = [tuple(map(int, input().split())) for __ in range(n)]
    
    if n == 1:
        print(1)
        continue
    
    xs = sorted(monsters, key=lambda p: p[0])
    ys = sorted(monsters, key=lambda p: p[1])
    
    def area(xmin, xmax, ymin, ymax):
        return (xmax - xmin + 1) * (ymax - ymin + 1)
    
    x_min, x_max = xs[0][0], xs[-1][0]
    y_min, y_max = ys[0][1], ys[-1][1]
    
    best = area(x_min, x_max, y_min, y_max)
    
    extreme_monsters = set()
    for p in monsters:
        if p[0] == x_min or p[0] == x_max or p[1] == y_min or p[1] == y_max:
            extreme_monsters.add(p)
    
    pos_x = {p: i for i, p in enumerate(xs)}
    pos_y = {p: i for i, p in enumerate(ys)}
    
    for monster in extreme_monsters:
        ix = pos_x[monster]
        iy = pos_y[monster]
        
        new_x_min = xs[1][0] if ix == 0 else xs[0][0]
        new_x_max = xs[-2][0] if ix == n - 1 else xs[-1][0]
        new_y_min = ys[1][1] if iy == 0 else ys[0][1]
        new_y_max = ys[-2][1] if iy == n - 1 else ys[-1][1]
        
        new_area = area(new_x_min, new_x_max, new_y_min, new_y_max)
        if new_area < best:
            best = new_area
    
    print(best)
