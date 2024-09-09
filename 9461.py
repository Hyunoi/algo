num = int(input())

triangleLength = [0]*101
triangleLength[1] = 1
triangleLength[2] = 1
triangleLength[3] = 1
triangleLength[4] = 2
triangleLength[5] = 2
triangleLength[6] = 3
triangleLength[7] = 4
triangleLength[8] = 5
triangleLength[9] = 7
triangleLength[10] = 9

for i in range(num):
    n = int(input())
    if n <= 10:
        print(triangleLength[n])
    else:
        for j in range(11, n+1):
            triangleLength[j] = triangleLength[j-1] + triangleLength[j-5]
        print(triangleLength[n])
        