import sys

num = int(sys.stdin.readline())

DP = [0] * 1000001
for i in range(2, num+1):
    DP[i] = DP[i-1] + 1
    if (i % 2 == 0):
        DP[i] = min(DP[i], DP[i//2]+1)
    if (i % 3 == 0):
        DP[i] = min(DP[i], DP[i//3]+1)
    
print(DP[num])