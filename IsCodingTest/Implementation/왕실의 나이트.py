# 115p

point = input()

column = int(ord(point[0]) - ord('a')) + 1
row = int(point[1])

commands = [[1, 2], [2, 1], [-1, 2], [-2, 1], [-1, -2], [-2, -1], [1, -2], [2, -1]]

count = 0
for x, y in commands:
    moveC = column + x
    moveR = row + y

    if 1 <= moveC <= 8 and 1 <= moveR <= 8:
        print(moveC,moveR)
        count += 1

print(count)