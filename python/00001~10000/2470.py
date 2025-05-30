# 두 용액
# https://www.acmicpc.net/problem/2470

n = int(input())
nList = sorted(list(map(int, input().split())))

answer = []

firstPointer = 0
endPointer = n-1

max = abs(nList[firstPointer] + nList[endPointer])
answer = [nList[firstPointer], nList[endPointer]]

while firstPointer < endPointer:
    sum = nList[firstPointer] + nList[endPointer]

    # 왼쪽 오른쪽의 차이가 max 보다 작으면?
    # max, answer 갱신
    if abs(sum) < max:
        max = abs(sum)
        answer = [nList[firstPointer], nList[endPointer]]
        # 차이가 0이면?
        # 바로 break
        if max == 0:
            break

    if sum < 0:
        firstPointer += 1
    else:
        endPointer -= 1

print(" ".join(map(str, answer)))