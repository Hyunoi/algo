# 연결 요소의 개수
from collections import deque
import sys

def DFS(num):
    Q = deque()
    Q.append(num)
    visited[num] = 1
    
    while Q:
        node = Q.popleft()
        for i in range(N+1):
            if graph[node][i] == 1 and visited[i] != 1:
                visited[i] = 1
                Q.append(i)

N, M = map(int, sys.stdin.readline().split())

graph = [[0 for _ in range(N+1)] for _ in range(N+1)]

for _ in range(M):
    u, v = map(int, sys.stdin.readline().split())
    graph[u][v] = graph[v][u] = 1

count = 0
visited = [0] * (N+1)
for i in range(1, N+1):
    if visited[i] != 1:
        DFS(i)
        count += 1

print(count)