# 블랙잭
# https://www.acmicpc.net/problem/2798
# 브루트포스 알고리즘
# 모든 경우의 수를 다 구해보는 완전탐색 알고리즘이다 (force = 강제적인,,,)
# O(n^3)

n, m = map(int, input().split())
cardList = list(map(int, input().split()))

blackJack = 0

for i in range(n):
    for j in range(i+1, m):
        for k in range(j+1, n):
            total = cardList[i] + cardList[j] + cardList[k]
            
            if total <= m:
                blackJack = max(blackJack, total)

print(blackJack)