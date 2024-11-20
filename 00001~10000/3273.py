# 두 수의 합
# https://www.acmicpc.net/problem/3273

n = int(input())
aList = sorted(list(map(int, input().split())))
x = int(input())

firstPointer = 0
endPointer = n-1

count = 0
while firstPointer < endPointer:
    if aList[firstPointer] + aList[endPointer] == x:
        count += 1
        firstPointer += 1
        endPointer -= 1
    else:
        if aList[firstPointer] + aList[endPointer] < x:
            firstPointer += 1
        else:
            endPointer -= 1

print(count)