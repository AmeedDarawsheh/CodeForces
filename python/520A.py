def is_pangram(s: str) -> bool:
    s = s.lower()
    letters = set(s)
    return set('abcdefghijklmnopqrstuvwxyz').issubset(letters)

# Main
n = int(input())
s = input()

print("YES" if is_pangram(s) else "NO")
