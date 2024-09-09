n = int(input())

lists = []
for i in range(n):
    x, y = map(int, input().split())
    lists.append([y, x])

lists.sort()

for i in range(len(lists)):
    print(lists[i][1], lists[i][0])