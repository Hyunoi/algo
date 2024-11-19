dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]  # 하상좌우

def Baechu(x, y):
    queue = [(x, y)]
    bugs[x][y] = 0  # 방문처리

    while queue:
        x, y = queue.pop(0)

        for i in range(4):  # 하상좌우 돌기
            moveX = x + dx[i]
            moveY = y + dy[i]

            # 인덱스 밖으로 벗어나면 해당 방향 넘기기
            if moveX < 0 or moveY < 0 or moveX > M-1 or moveY > N-1: 
                continue
        
            # 배추 있으면 위치 큐에 넣기, 방문처리
            if bugs[moveX][moveY] == 1:
                queue.append((moveX, moveY))
                bugs[moveX][moveY] = 0
    

num = int(input())

for _ in range(num):
    M, N, K = map(int, input().split())
    bugs = [[0 for _ in range(N)] for _ in range(M)]
    cnt = 0

    for _ in range(K):
        x, y = map(int, input().split())
        bugs[x][y] = 1
    
    for i in range(M):
        for j in range(N):
            if bugs[i][j] == 1:
                Baechu(i, j)
                cnt+=1
    
    print(cnt)