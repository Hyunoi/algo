# 풍선 떠뜨리기
# 덱
from collections import deque

n = int(input())
b = enumerate(map(int, input().split()))

balloons = deque(b)
ans = []

while balloons:
    index, paper = balloons.popleft()
    ans.append(index+1)

    if paper > 0:

        balloons.rotate(-(paper-1))
    else:
        balloons.rotate(-paper)

for i in ans:
    print(i, end = ' ')