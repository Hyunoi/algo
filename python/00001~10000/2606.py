def DFS(node):
    global count
    vistedList[node] = 1
    
    for i in range(1, num+1):
        if virusMap[node][i] == virusMap[i][node] == 1 and vistedList[i] == 0:
            count += 1
            DFS(i)

num = int(input())
network = int(input())

virusMap = [[0 for _ in range(num+1)] for _ in range(num+1)] # 양방향 그래프 생성

for _ in range(network):  
    a, b = map(int, input().split())
    virusMap[a][b] = virusMap[b][a] = 1

count = 0       # 바이러스에 걸리게 되는 컴퓨터의 수
vistedList = [0] * (num+1)  # 방문 리스트
DFS(1)

print(count)