# RGB 거리 2
import copy
import sys

n = int(input())

initGraph = []
for i in range(n):
    initGraph.append(list(map(int, sys.stdin.readline().split())))

INF = float('inf')
result = INF
for first in range(3):  # r, g, b 하나씩 골라서 칠해보기
    graph = copy.deepcopy(initGraph)
    
    # 선택된 색 나머지 색은 inf 설정
    for j in range(3):
        if j != first:
            graph[0][j] = INF

    for i in range(1, n):
        graph[i][0] = min(graph[i-1][1], graph[i-1][2]) + graph[i][0] # red <- green, blue
        graph[i][1] = min(graph[i-1][0], graph[i-1][2]) + graph[i][1] # green <- red, blue
        graph[i][2] = min(graph[i-1][0], graph[i-1][1]) + graph[i][2] # blue <- red, green

    # 맨 위에서 선택했던 색 제외하고 최소 고르기
    for last in range(3):
        if last != first:
            result = min(result, graph[n-1][last])
    
print(result)