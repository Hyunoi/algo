# 적록색약
# BFS
import sys
from collections import deque 

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

n = int(input())
graph = []

for _ in range(n):
    graph.append(sys.stdin.readline().strip())

def blindType(type):
    visited = [[0 for _ in range(n)] for _ in range(n)]
    count = 0
    for i in range(n):
        for j in range(n):
            if visited[i][j] == 0:
                BFS(i, j, visited, type)
                count += 1
    print(count)

def BFS(i, j, visited, colorBlind):
    Q = deque()
    Q.append([i, j])
    visited[i][j] = 1

    while Q:
        x, y = Q.popleft()

        for k in range(4):
            moveX = x + dx[k]
            moveY = y + dy[k]

            if 0 <= moveX < n and 0 <= moveY < n and visited[moveX][moveY] == 0:
                # 적록색약 X
                if colorBlind == False:
                    if graph[moveX][moveY] == graph[x][y]:
                        Q.append([moveX, moveY])
                        visited[moveX][moveY] = 1
                # 적록색약 O
                else:
                    if (graph[moveX][moveY] == 'R' and graph[x][y] == 'G') or (graph[moveX][moveY] == 'G' and graph[x][y] == 'R') or (graph[moveX][moveY] == graph[x][y]):
                        Q.append([moveX, moveY])
                        visited[moveX][moveY] = 1
                    
# 적록색약 X
blindType(False)

# 적록색약 O
blindType(True)