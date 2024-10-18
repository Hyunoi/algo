# RGB 거리

import sys

n = int(input())

graph = []

for i in range(n):
    graph.append(list(map(int, sys.stdin.readline().split())))

for i in range(1, n):
    graph[i][0] = min(graph[i-1][1], graph[i-1][2]) + graph[i][0] # red <- green, blue
    graph[i][1] = min(graph[i-1][0], graph[i-1][2]) + graph[i][1] # green <- red, blue
    graph[i][2] = min(graph[i-1][0], graph[i-1][1]) + graph[i][2] # blue <- red, green
    
print(min(graph[n-1]))