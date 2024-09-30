# 쉬운 최단거리
# BFS

import sys
from collections import deque

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

def BFS(i, j):
    Q = deque()
    Q.append([i, j])

    visited[i][j] = 0

    while Q:
        x, y = Q.popleft()

        for i in range(4):
            moveX = x + dx[i]
            moveY = y + dy[i]

            # 인덱스가 벗어나지 않고, 방문한 적 없을 때
            if 0 <= moveX < n and 0 <= moveY < m and visited[moveX][moveY] == -1:
                if graph[moveX][moveY] == 0:    # 벽에 가로막힘
                    visited[moveX][moveY] = 0
                elif graph[moveX][moveY] == 1:
                    visited[moveX][moveY] = visited[x][y] + 1   # 이전 방문 횟수에 1 더해주기
                    Q.append([moveX, moveY])

n, m = map(int, sys.stdin.readline().split())

graph = []
for i in range(n):
    graph.append(list(map(int, sys.stdin.readline().split())))

visited = [[-1 for _ in range(m)] for _ in range(n)]

for i in range(n):
    for j in range(m):
        if graph[i][j] == 2 and visited[i][j] == -1:    # 시작점과 방문한 적 없던 인덱스
            BFS(i, j)

# 원래 갈 수 있는 땅과 갈 수 없는 땅 구분해서 출력하기
for i in range(n):
    for j in range(m):
        if graph[i][j] == 0: 
            print("0", end=" ")
        else:
            print(visited[i][j], end=" ")
    print()