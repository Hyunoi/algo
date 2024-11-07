import heapq

t, n = map(int, input().split())

work = sorted((list(map(int, input().split()))))

worker = [0] * n

for w in work:
    minTimeWorker = heapq.heappop(worker)
    heapq.heappush(worker, minTimeWorker+w)

print(max(worker))