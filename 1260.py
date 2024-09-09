def DFS(V):
    VistedDFS[V] = 1    # 방문 정점 리스트에 1로 기록
    print(V, end=' ')
    
    for i in range(N+1):
        if graph[V][i] == 1 and VistedDFS[i] == 0:
            DFS(i)

def BFS(V):
    vistedQueue = [V]
    VistedBFS[V] = 1

    while vistedQueue:
        V = vistedQueue.pop(0)
        print(V, end=' ')
        for i in range(N+1):
            if graph[V][i] == 1 and VistedBFS[i] == 0:
                vistedQueue.append(i)
                VistedBFS[i] = 1
                
N, M, V = map(int, input().split())

graph = []
for _ in range(N+1):
    row = []
    for _ in range(N+1):
        row.append(0)
    graph.append(row)

for _ in range(M):
    a, b = map(int, input().split())
    graph[a][b] = graph[b][a] = 1

# 방문 기록이 담길 리스트
VistedDFS = [0] * (N+1)
DFS(V)

print()

# 방문 기록이 담길 리스트
VistedBFS = [0] * (N+1)
BFS(V)