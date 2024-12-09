# 92p

n, m, k = map(int, input().split())
numList = sorted(list(map(int, input().split())))

ans = 0

maxNum = numList[n-1]
maxNum2 = numList[n-2]

while m > 0:
    for _ in range(k):
        ans += maxNum
        m -= 1
    ans += maxNum2
    m -= 1

print(ans)