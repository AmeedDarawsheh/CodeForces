num_forces = int(input())

total_x = total_y = total_z = 0

for _ in range(num_forces):
    force_x, force_y, force_z = map(int, input().split())
    total_x += force_x
    total_y += force_y
    total_z += force_z

if total_x == 0 and total_y == 0 and total_z == 0:
    print("YES")
else:
    print("NO")