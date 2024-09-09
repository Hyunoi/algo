temp = int(input())

zeroList = [0] * 41
oneList = [0] * 41

zeroList[0] = 1
zeroList[1] = 0
oneList[0] = 0
oneList[1] = 1

for i in range(temp):
    num = int(input())
    for j in range(2, num+1):
        zeroList[j] = zeroList[j-1] + zeroList[j-2]
        oneList[j] = oneList[j-1] + oneList[j-2]
    print(zeroList[num], oneList[num])