# 한 줄로 서기
# https://www.acmicpc.net/problem/1138

n = int(input())

nList = list(map(int, input().split()))

ans = [ 0 for _ in range(n)]

for idx, left in enumerate(nList):
    cnt = 0
    for i in range(n):
        if ans[i] == 0:
            if cnt == left:
                ans[i] = idx + 1
                break
            cnt += 1

print(*ans) 