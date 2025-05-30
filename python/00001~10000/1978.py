import sys

n = int(input())

arr = list(map(int, sys.stdin.readline().split()))

ans = 0
for num in arr:
  temp = 0 
  if num > 1:
    for i in range(2, num):
      if num % i == 0:
        temp += 1
        break
    if temp == 0:
      ans+=1
    
print(ans)