# 152p
from collections import deque

n,m = map(int, input().split())

miro = []

for i in range(n):
    miro.append(list(map(int, input())))

visited = [[False for _ in range(m)] for _ in range(n)]

dx = [ 0, 0, 1, -1 ]
dy = [ 1, -1, 0, 0 ]

def BFS(x, y):
    Q = deque()
    Q.append([x, y])
    visited[x][y] = True

    while Q:
        i, j = Q.popleft()

        for k in range(4):
            moveX = i + dx[k]
            moveY = j + dy[k]

            if 0 <= moveX < n and 0 <= moveY < m and not visited[moveX][moveY] and miro[moveX][moveY] == 1:
                visited[moveX][moveY] = True
                miro[moveX][moveY] = miro[i][j] + 1
                Q.append([moveX, moveY])

    return miro[n-1][m-1]

print(BFS(0, 0))