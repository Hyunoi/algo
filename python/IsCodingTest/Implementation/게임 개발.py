# 118p

n, m = map(int, input().split())
x, y, look = map(int, input().split())

# 바다, 육지 맵
landSea = []
for _ in range(n):
    landSea.append(list(map(int, input().split())))

# 방문 리스트와 현재 위치 방문 처리
visited = [[0] * m for _ in range(n)]
visited[x][y] = 1

# 북, 동, 남, 서 방향 정의
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]