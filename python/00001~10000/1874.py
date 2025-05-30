import sys

n = int(sys.stdin.readline())

count = 1
stack = []
answer = []

for i in range(n):
    num = int(input())
    while (count <= num):
        stack.append(count)
        answer.append('+')
        count += 1

    
    if (stack[-1] == num):
        stack.pop()
        answer.append('-')    


if len(stack) != 0:
    print("N")
else:
    for i in answer:
        print(i, end=" ")