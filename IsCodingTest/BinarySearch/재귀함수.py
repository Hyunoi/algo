import sys

n, target = map(int, sys.stdin.readline().split())
nums = list(map(int, sys.stdin.readline().split()))

def 이진탐색(nums, target, start, end):
    if start > end:
        return None
    
    middle = (start + end) // 2

    if nums[middle] == target:
        return middle
    elif nums[middle] > target:
        return 이진탐색(nums, target, start, middle-1)
    else:
        return 이진탐색(nums, target, middle + 1, end)

print(이진탐색(nums, target, 0, n-1))
