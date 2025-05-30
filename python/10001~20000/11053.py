# 가장 긴 증가하는 부분 수열
# DP

N = int(input())
aList = list(map(int, input().split()))

DP = [1] * (N+1)

for i in range(N):
    for j in range(i):
        # 이전 인덱스보다 이후 인덱스가 더 큰 경우
        if aList[i] > aList[j]:
            DP[i] = max(DP[i], DP[j]+1) 

print(max(DP))