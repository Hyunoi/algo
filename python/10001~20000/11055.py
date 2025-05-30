# # 가장 긴 증가하는 부분 수열
# # DP

N = int(input())
aList = list(map(int, input().split()))
DP = [1] * (N)
DP[0] = aList[0]

for i in range(1, N):
    for j in range(i):
        if aList[j] < aList[i]:
            DP[i] = max(DP[i], DP[j]+aList[i])
        else:
            DP[i] = aList[i]

print(max(DP))
