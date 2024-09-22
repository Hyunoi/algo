# 단지 번호 붙이기 DFS
from collections import deque

def DFS(x, y):
    visited[x][y] = 1
    global count
    count += 1
    
    for i in range(4):
        moveX = x + dx[i]
        moveY = y + dy[i]

        if moveX < 0 or moveY < 0 or moveX > num-1 or moveY > num-1: 
            continue
        
        if graph[moveX][moveY] == "1" and visited[moveX][moveY] != 1:
            DFS(moveX, moveY)

num = int(input())

dx = [-1, 1, 0, 0]  # 상하좌우
dy = [0, 0, -1, 1]

graph = []
visited = [[0 for _ in range(num)] for _ in  range(num)]    # 방문 리스트
houseCounts = []    # 집의 개수를 넣을 리스트

for i in range(num):
    graph.append(list(map(str, input())))

for i in range(num):
    for j in range(num):
        if graph[i][j] == "1" and not visited[i][j] != 0:   # 집이 존재하고, 방문하지 않은 리스트
            count = 0   # 집 개수 초기화
            DFS(i, j)
            houseCounts.append(count)   # 집 개수 넣기

houseCounts = sorted(houseCounts)   # 단지 내
print(len(houseCounts))
for i in houseCounts:
    print(i)