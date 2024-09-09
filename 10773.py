k = int(input())
lists = []

for i in range(k):
    a = int(input())
    if a == 0:
        del lists[-1]
    else:
        lists.append(a)

print(sum(lists))