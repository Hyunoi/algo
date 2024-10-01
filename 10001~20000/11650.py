import sys

num = int(sys.stdin.readline())
nlist = []

for i in range(num):
    x, y = map(int, sys.stdin.readline().split())
    nlist.append([x, y])

nlist.sort()

for i in range(num):
    print(nlist[i][0], nlist[i][1])