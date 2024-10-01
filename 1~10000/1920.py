import sys

# 1
nnum = int(input())
nlist = set(map(int, sys.stdin.readline().split()))

mnum = int(input())
mlist = list(map(int, sys.stdin.readline().split()))
 
for i in mlist:
    if i in nlist:
        print(1)
    else:
        print(0)

#2
nnum = int(input())
nlist = list(map(int, sys.stdin.readline().split()))
nlist.sort()
mnum = int(input())
mlist = list(map(int, sys.stdin.readline().split()))

for num in mlist:
    lo, hi = 0, nnum-1
    temp = False
    while lo <= hi:
        mid = (lo+hi) // 2
        if num == nlist[mid]:   # 찾은 경우
            temp = True
            print(1)
            break
        elif num > nlist[mid]:  # num 값이 mid 인덱스 값보다 큰 경우
            lo = mid + 1        # 리스트의 오른쪽만 사용
        else:                   # num 값이 mid 인덱스 값보다 작은 경우
            hi = mid-1          # 리스트의 왼쪽만 사용
          
    if temp == False:
        print(0)