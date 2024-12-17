# 149p

def DFS(x, y):
    visited[x][y] = True
    
    for i in range(4):
        moveX = x + dx[i]
        moveY = y + dy[i]

        if 0 <= moveX < n and 0 <= moveY < m and not visited[moveX][moveY] and iceMaker[moveX][moveY] == "0":
            DFS(moveX, moveY)
    return True
        

n, m = map(int, input().split())

iceMaker = []

for i in range(n):
    iceMaker.append(input())

# 동 서 북 남
dx = [ 0, 0, 1, -1 ]
dy = [ 1, -1, 0, 0 ]

count = 0
visited = [[ False for _ in range(m) ] for _ in range(n)]

for i in range(n):
    for j in range(m):
        if not visited[i][j] and iceMaker[i][j] == '0':
            DFS(i, j)
            count += 1
    
print(count)