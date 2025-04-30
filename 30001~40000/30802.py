# 웰컴 키트
# https://www.acmicpc.net/problem/30802

n = int(input())
sizeList = list(map(int, input().split()))
t, p = map(int, input().split())

tBundle = 0
for i in range(len(sizeList)):
    if (sizeList[i] % t != 0):
        tBundle += (sizeList[i] // t) + 1
    else:
        tBundle += (sizeList[i] // t)

pBundle = n // p
pNonBundle = n % p

print(tBundle)
print(pBundle, pNonBundle)
