from collections import deque
import sys

n = int(input())
s = deque()

for i in range(n):
    cmd = deque(sys.stdin.readline().split())
    if cmd[0] == "push":
        s.append(cmd[1])
    elif cmd[0] == "pop":
        if len(s) == 0:
            print(-1)
        else:
            sn = s.pop()
            print(sn)
    elif cmd[0] == "size":
        print(len(s))
    elif cmd[0] == "empty":
        if len(s) != 0:
            print(0)
        else:
            print(1)
    elif cmd[0] == "top":
        if len(s) == 0:
            print(-1)
        else:
            print(s[-1])