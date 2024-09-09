import sys

num = int(input())

word = []
for i in range(num):
    word.append(sys.stdin.readline().strip())

word= list(set(word))
word.sort(key=len)

i = 0
answer = []
arr = []    
while i <= len(word):
    if i == len(word)-1:
        break
    if len(word[i]) == len(word[i+1]):
        arr.append(word[i])
    else:
        arr.append(word[i])
        arr.sort()
        answer.append(arr)
        arr=[]
    i += 1

arr.append(word[i])
arr.sort()
answer.append(arr)

for i in answer:
    for j in i:
        print(j)
