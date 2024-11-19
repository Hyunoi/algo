# 최소 힙
import heapq
import sys

num = int(sys.stdin.readline().rstrip())
heap = []

for i in range(num):
    x = int(sys.stdin.readline().rstrip())
    if (x == 0):
        if (len(heap) == 0):
            print(0)
        else:
            minX = heapq.heappop(heap)
            print(minX)
    else:
        heapq.heappush(heap, x)

