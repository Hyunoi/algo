from collections import deque

N, M = map(int, input().split())

dx = [-1, 1, 0, 0]  # 상하좌우
dy = [0, 0, -1, 1]

campus = []     # 맵
visited = [[0 for _ in range(M)] for _ in range(N)]  # 방문 표시 리스트
Q = deque()     # 방문 위치 넣는 큐
ans = 0         # 도연이가 만날 수 있는 사람의 수

for i in range(N):
    campus.append(list(map(str, input())))
    
    # 도연이가 방문한 위치를 큐에 넣고, 방문 표시 하기
    for j in range(M):
        if "I" == campus[i][j]:
            Q.append([i, j])
            visited[i][j] = 1

# BFS
# 큐가 빌 때까지 실행
while Q:
    for _ in range(len(Q)):
        x, y = Q.popleft()     # 큐에서 가장 왼쪽 값 꺼내기

        for i in range(0, 4):
            moveX = x + dx[i]
            moveY = y + dy[i]

            # 리스트가 상하좌우 벗어나지 않음
            # 벽이 아님
            # 방문하지 않음
            if  0 <= moveX < N and 0 <= moveY < M and campus[moveX][moveY] != "X" and visited[moveX][moveY] == 0:
                Q.append([moveX, moveY])
                visited[moveX][moveY] = 1
                if campus[moveX][moveY] == "P":
                    ans += 1
                
if ans > 0:
    print(ans)
else:
    print("TT")