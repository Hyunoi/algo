import sys

num = int(input())

person = []
for i in range(num):
    a, b = sys.stdin.readline().split()
    person.append([int(a), b])
    
person.sort(key = lambda x:x[0])

for i in person:
    for j in i:
        print(j, end=' ')
    print()
