# 시험 감독
# https://www.acmicpc.net/problem/13458
import sys

placeNum = int(sys.stdin.readline())
placeList = list(map(int, sys.stdin.readline().split()))
mainT, subT = map(int, sys.stdin.readline().split())

count = 0
for num in placeList:
    # 총감독관 계산
    num = num - mainT
    count += 1

    # 남은 응시자 수가 0보다 클 경우 부감독관 계산
    if num > 0:
        count += (num // subT)
        if num % subT != 0:
            count += 1

print(count)
