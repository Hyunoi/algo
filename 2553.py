num = int(input())

ans = 1
for i in range(1, num+1):
    ans *= i

stringAns = str(ans)

while (stringAns[-1] == "0"):
    stringAns = stringAns[:-1]

print(stringAns[-1])

