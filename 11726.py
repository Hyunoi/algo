# from itertools import combinations

# num = int(input())

# if (num % 2 == 1):  # 홀수일 때 1부터 시작
#     x = 1
# else:               # 짝수일 때 0부터 시작
#     x = 0

# sum = 0
# for _ in range(0, (num // 2) + 1):
#     y = (num - x) // 2
#     comList = ['a'] * x + ['b'] * y
#     sum += len(list(combinations(comList, x)))
#     comList = []
#     x += 2

# print(sum % 10007)


num = int(input())
Block = [0] * 1001
Block[1] = 1
Block[2] = 2

for i in range(3, num+1):
    Block[i] = (Block[i-1] + Block[i-2])

print(Block[num]%10007)