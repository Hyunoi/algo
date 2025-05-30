# 경로 찾기
import sys

def DFS(node):
    for i in range(num):
        if graph[node][i] == 1 and visited[i] == 0:   # 방향이 있고, 방문한 적 없는
            visited[i] = 1
            DFS(i)
            
num = int(input())
graph = []

for i in range(num):
    graph.append(list(map(int, sys.stdin.readline().split())))

for i in range(num):
    visited = [0 for _ in range(num)]
    DFS(i)
    print(str(visited)[1:-1].replace(",", ""))
    