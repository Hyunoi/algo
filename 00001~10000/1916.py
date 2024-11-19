import sys
import heapq
import math

INF = math.inf

n = int(input())  # 노드의 개수
m = int(input())  # 간선의 개수

graph = [[] for _ in range(n + 1)]
distance = [INF] * (n + 1)  # 출발점에서 각 노드까지의 최소 거리

for _ in range(m):
    start, end, cost = map(int, sys.stdin.readline().split())
    graph[start].append((end, cost))

startCity, endCity = map(int, input().split())

# 우선순위 큐 사용 다익스트라
def dijkstra(start):
    q = []
    heapq.heappush(q, (0, start))  # 시작 노드를 큐에 삽입 (거리, 노드)
    distance[start] = 0

    while q:
        dist, now = heapq.heappop(q)

        # 이미 방문한 노드라면 무시
        if distance[now] < dist:
            continue

        for nextNode, cost in graph[now]:
            nextDist = dist + cost

            if nextDist < distance[nextNode]:
                distance[nextNode] = nextDist
                heapq.heappush(q, (nextDist, nextNode))

print(distance[endCity])
