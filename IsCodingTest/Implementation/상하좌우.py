# 110p

n = int(input())
commands = list(input().split())

travelMap = [[ 0 for _ in range(n)] for _ in range(n)]

x, y = 1, 1
for c in commands:
    if c == "R" and y != n:
        y += 1
    elif c == "L" and y != 1:
        y -= 1
    elif c == "U" and x != 1:
        x -= 1
    elif c == "D" and x != n:
        x += 1
    else:
        pass
print(x, y)
