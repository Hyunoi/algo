import sys

N = int(sys.stdin.readline().strip())
Nlist = sorted(list(map(int, sys.stdin.readline().strip().split())))

M = int(sys.stdin.readline().strip())
Mlist = list(map(int, sys.stdin.readline().strip().split()))

ans = {}

for i in Nlist:
    if i in ans:
        ans[i] += 1
    else:
        ans[i] = 1

for i in Mlist:
    if i in ans:
        print(ans[i], end=" ")
    else:
        print("0", end=" ")