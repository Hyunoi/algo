answer = []

while True:
    x, y, z = map(int, input().split())
    lists = [x, y, z]
    if x == 0:
        del lists[-1]
        break
    lists = sorted(lists)
    answer.append(lists)

for i in answer:
    if i[0]**2 + i[1]**2 == i[2]**2:
        print('right')
    else:
        print('wrong')