num = int(input())
word = list(map(str, input()))

sum = 0
for i in range(len(word)):
    xx = (ord(word[i])-96) * (31**i)
    sum += xx

print(sum % 1234567891)