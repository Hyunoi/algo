import sys

def Check(arr):
    temp = False
    while temp == False:
        if "()" in arr:
            arr = arr.replace("()", "")
        else:
            temp = True
    if len(arr.strip()) != 0:
        print('NO')
    else:
        print('YES')


num = int(input())
for i in range(num):
    arr = sys.stdin.readline()
    Check(arr)