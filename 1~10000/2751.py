import sys

num = int(sys.stdin.readline().strip())

nlist = []
for i in range(num):
    nlist.append(int(sys.stdin.readline().strip()))

nlist.sort()
for i in range(num):
    print(nlist[i])