# N과 M (2)
N, M = map(int, input().split())

ans = []
visited = [False] * (N+1)

idx = 0
def DFS():
    if len(ans) == M:
        print(' '.join(map(str, ans)))
        return
    for i in range(1, N+1):
        if visited[i] == True or (ans and ans[-1] > i):
            continue
        visited[i] = True
        ans.append(i)
        DFS()
        ans.pop()
        visited[i] = False

DFS()