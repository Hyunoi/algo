N = int(input())
enemyList = list(map(int, input().split()))

cnt = 1
idx = 0
while True:
    damege = ((cnt-1) % 4) + 1
    enemyList[idx] -= damege

    if enemyList[idx] <= 0:
        idx += 1

    if enemyList[N-1] <= 0:
        break
    cnt += 1

print(cnt)