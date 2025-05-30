import sys
from collections import deque

num = int(input())

def menu(qlist, queue):
    if qlist[0] == 'push_front':
        queue.appendleft(qlist[1])
    elif qlist[0] == 'push_back':
        queue.append(qlist[1])
    elif qlist[0] == 'pop_front':
        if not queue:
            print(-1)
        else:
            print(queue[0])
            queue.popleft()
    elif qlist[0] == 'pop_back':
        if not queue:
            print(-1)
        else:
            print(queue[-1])
            queue.pop()
    elif qlist[0] == 'size':
        print(len(queue))
    elif qlist[0] == 'empty':
        if not queue:
            print(1)
        else:
            print(0)
    elif qlist[0] == 'front':
        if not queue:
            print(-1)
        else:
            print(queue[0])
    elif qlist[0] == 'back':
        if not queue:
            print(-1)
        else:
            print(queue[-1])

queue = deque()

for i in range(num):
    qlist = sys.stdin.readline().split()
    menu(qlist, queue)