# A -> B
# https://www.acmicpc.net/problem/16953

from collections import deque

A, B = map(int, input().split())

Q = deque()
Q.append((A, 0))
isAble = False

while Q:
    x, count = Q.popleft()

    if x > B:
        continue
    if x == B:
        isAble = True
        print(count+1)
        break
    Q.append((x*2, count+1))
    Q.append((x*10+1, count+1))

if isAble == False:
    print(-1)