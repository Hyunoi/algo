from collections import deque

def BFS(graph, v, visited):
    visited[v] = True


    Q = deque()
    Q.append(v)

    while Q:
        num = Q.popleft()
        print(num, end=" ")

        for i in graph[num]:
            if not visited[i]:
                Q.append(i)
                visited[i] = True

graph = [
    [],
    [2, 3, 8],
    [1, 7],
    [1, 4, 5],
    [3, 5],
    [3, 4],
    [7],
    [2, 6, 8],
    [1, 7] 
]
 
visited = [False] * len(graph)

BFS(graph, 1, visited)