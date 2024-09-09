x, y, p, q= map(int, input().split())

lists = [q-y, p-x, y, x]
print(min(lists))