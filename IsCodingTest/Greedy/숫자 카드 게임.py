# 96p

n, m = map(int, input().split())
cardMap = []

ans = []
for i in range(n):
    cardMap.append(list(map(int, input().split())))
    ans.append(min(cardMap[i]))

print(max(ans))