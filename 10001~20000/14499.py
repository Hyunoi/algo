import sys

# 동서북남
# 이것만 x축, y축 반대로 됨
dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]
dice = [ 0, 0, 0, 0, 0, 0 ]

N, M, x, y, K = map(int, sys.stdin.readline().split())

gameMap = []
for i in range(N):
    gameMap.append(list(map(int, sys.stdin.readline().split())))

commands = list(map(int, sys.stdin.readline().split()))

def turnDice(command):
#   0  1  2  3  4  5
    a, b, c, d, e, f = dice
    # 동쪽 굴리기
    if command == 1:
        dice[0] = d
        dice[1] = b
        dice[2] = a
        dice[3] = f
        dice[4] = e
        dice[5] = c
    # 서쪽 굴리기
    elif command == 2:
        dice[0] = c
        dice[1] = b
        dice[2] = f
        dice[3] = a
        dice[4] = e
        dice[5] = d
    # 북쪽 굴리기
    elif command == 3:
        dice[0] = e
        dice[1] = a
        dice[2] = c
        dice[3] = d
        dice[4] = f
        dice[5] = b
    # 남쪽 굴리기
    elif command == 4:
        dice[0] = b
        dice[1] = f
        dice[2] = c
        dice[3] = d
        dice[4] = a
        dice[5] = e

moveX, moveY = x, y
for c in commands:
    moveX = x + dx[c-1]
    moveY = y + dy[c-1]

    if  0 <= moveX < N and 0 <= moveY < M:
        turnDice(c)
        if gameMap[moveX][moveY] == 0:
            gameMap[moveX][moveY] = dice[5]
        else:
            dice[5] = gameMap[moveX][moveY]
            gameMap[moveX][moveY] = 0
        x, y = moveX, moveY

        print(dice[0])