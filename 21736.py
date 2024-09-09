N, M = map(int, input().split())

campus = []
for i in range(N):
    line = input()
    campusx2 = list(line)
    campus.append(campusx2)

print(campus)

# for i in range(N):
    # if campus[i].index('P') != 0:  # i행에 사람이 있음
