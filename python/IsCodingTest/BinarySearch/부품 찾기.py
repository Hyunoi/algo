import sys

# 이진 탐색
n = int(input())
nList = list(map(int, sys.stdin.readline().rstrip().split()))
nList.sort()

m = int(input())
mList = list(map(int, sys.stdin.readline().rstrip().split()))

def binarySearch(numList, target, start, end):
    if start > end:
        return False
    
    mid = (start + end) // 2

    if numList[mid] == target:
        return True
    elif numList[mid] > target:
        return binarySearch(numList, target, start, mid - 1)
    else:
        return binarySearch(numList, target, mid + 1, end)
    
for i in range(m):
    result = binarySearch(nList, mList[i], 0, n-1)
    if result == False:
        print("no", end = " ")
    else:
        print("yes", end = " ")
