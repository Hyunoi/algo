# 숨바꼭질
from collections import deque

start, end = map(int, input().split())
visited = [0] * 100001

Q = deque()
Q.append(start)

while Q:
    idx = Q.popleft()
    if idx == end:
        print(visited[idx])
        break
    for move in idx-1, idx+1, idx*2:
        # 맵 안에 있고, 방문한 적 없으면
        if 0 <= move < 100001 and not visited[move]:
            visited[move] = visited[idx] + 1
            Q.append(move)