# 최대 힙
import heapq
import sys

num = int(sys.stdin.readline().rstrip())
heap = []

for i in range(num):
    x = int(sys.stdin.readline().rstrip())
    minusX = -x

    if (x == 0):
        if (len(heap) == 0):
            print(0)
        else:
            maxX = heapq.heappop(heap)
            print(-maxX)

    else:
        heapq.heappush(heap, minusX)
    
