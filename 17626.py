# Four Squares
import sys

num = int(sys.stdin.readline().rstrip())
DP = [0] * (num+1)

# 제곱수인 인덱스에만 1을 채운다 -> 제곱수는 무조건 1이 채워진다.
for i in range(1, int(num**0.5)+1):
    DP[i*i] = 1

for i in range(1, num+1):
    if DP[i] != 1:
        minNum = 4      # 최소가 될 값
        for j in range(1, int(i**0.5)+1):
            minNum = min(minNum, DP[i-(j*j)]+1)
        DP[i] = minNum

print(DP[num])