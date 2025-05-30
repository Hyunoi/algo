import sys

city = int(input())
bus = int(input())
INF = float('inf')

graph = [[INF] * (city+1) for _ in range(city+1)]

for _ in range(bus):
    a, b, cost = map(int, sys.stdin.readline().split())
    if graph[a][b] > cost:
        graph[a][b] = cost
    
for mid in range(1, city+1):   # 거쳐서 갈 노드
    graph[mid][mid] = 0
    for i in range(1, city+1):      # 시작 노드
        for j in range(1, city+1):  # 도착 노드
            graph[i][j] = min(graph[i][j], graph[i][mid] + graph[mid][j])

for i in range(1, city+1):
    for j in range(1, city+1):
        if graph[i][j] == INF:
            graph[i][j] = 0
        print(graph[i][j], end= ' ')
    print()