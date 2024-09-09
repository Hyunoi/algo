a, b = map(int, input().split())

up = 1
down = 1

for i in range(b):
    up *= a-i
    down *= i+1

print(up // down)