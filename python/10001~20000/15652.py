# N과 M (4)
N, M = map(int, input().split())

ans = []
visited = [False] * (N+1)

def DFS():
    if len(ans) == M:
        print(' '.join(map(str, ans)))
        return
    for i in range(1, N+1):
        if ans and ans[-1] > i:
            continue
        visited[i] = True
        ans.append(i)
        DFS()
        ans.pop()
        visited[i] = False

DFS()