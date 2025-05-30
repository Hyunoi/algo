# 이분탐색 + 파라메트릭
# 파라메트릭은 조건에 만족하는 경우에 대해 예 아니오로 대답하는 것
# 떡볶이 떡이 m에 부합하는지 예, 아니오로 조건 달기

import sys

n, m = map(int, input().split())
nList = list(map(int, input().split()))
nList.sort()

start, end = 0, max(nList)

while (start <= end):
    total = 0

    mid = (start + end) // 2

    for n in nList:
        if n > mid:
            total += (n - mid)

    # 떡의 양이 원하던 양보다 적은 경우
    # 떡을 더 길게 잘라야 함 !!
    if total < m:
        end = mid - 1
    
    # 떡의 양이 원하던 것보다 많은 경우
    # 떡을 더 작게 잘라야 함 !!
    else:
        # 많다는 것은 제일 근접하다는 것 일단 result에 기록
        result = mid
        # start가 end를 앞지르거나 같아진다면 앞의 result가 정답이 된다
        start = mid + 1

print(result)

    