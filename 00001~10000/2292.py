num = int(input())

num = num - 1
cnt = 1
i = 1

while num > 0:
    num = num - (6 * i)
    i += 1
    cnt += 1

print(cnt)