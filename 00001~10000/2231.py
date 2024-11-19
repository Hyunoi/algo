n = int(input())

ans = 0
for i in range(n+1):
    ilist = list(map(int, str(i)))
    isum = i + sum(ilist)
    if isum == n:
        ans = i
        break

print(ans)
