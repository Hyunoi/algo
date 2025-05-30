N, K = map(int, input().split())

cnt = 0
coins = []
for i in range(N):
    coin = int(input())
    coins.append(coin)

coins.reverse()

i = 0
while K > 0:
    if coins[i] <= K:
        cnt += K // coins[i]
        K = K % coins[i]
    i += 1

print(cnt)