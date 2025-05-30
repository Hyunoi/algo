# 네트워크 연결
import sys

n = int(sys.stdin.readline())
m = int(sys.stdin.readline())
edges = []
parent = [ i for i in range(n+1)]

for _ in range(m):
    a, b, cost = map(int, sys.stdin.readline().split())
    edges.append([cost, a, b])

edges.sort()

def find(parent, node):
    # node가 루트 노드가 아니라면
    if parent[node] != node:
        parent[node] = find(parent, parent[node])
    return parent[node]


def union(parent, a, b):
    rootA = find(parent, a)
    rootB = find(parent, b)
    parent[rootB] = rootA

score = 0
for cost, a, b in edges:
    if find(parent, a) != find(parent, b):
        union(parent, a, b)
        score += cost

print(score)