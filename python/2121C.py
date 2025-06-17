import sys
input = sys.stdin.read

def solve():
    data = input().split()
    idx = 0
    t = int(data[idx])
    idx += 1
    res = []
    
    for _ in range(t):
        n = int(data[idx])
        m = int(data[idx+1])
        idx += 2
        
        mat = []
        row_max = []
        col_max = [0] * m
        
        for i in range(n):
            row = list(map(int, data[idx:idx + m]))
            idx += m
            mat.append(row)
            row_max.append(max(row))
            for j in range(m):
                col_max[j] = max(col_max[j], row[j])
        
        min_after_op = float('inf')
        
        for i in range(n):
            for j in range(m):
                curr_max = 0
                for r in range(n):
                    for c in range(m):
                        val = mat[r][c]
                        if r == i or c == j:
                            val -= 1
                        curr_max = max(curr_max, val)
                min_after_op = min(min_after_op, curr_max)
        
        res.append(str(min_after_op))
    
    print("\n".join(res))

solve()
