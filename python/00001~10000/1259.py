def solution(a):
    while True:
        if a == str(0):
            break
        qqq = []
        for i in range(len(a)):
            if a[i] == a[len(a)-i-1]:
                qqq.append(1)
            else:
                qqq.append(2)
        if 2 in qqq:
            return 'no'
        elif 1 in qqq and a != 0:
            return 'yes'

while True:
    a = input()
    if a == '0':
        print(solution())

'''
a = input('a: ')

qqq = []
for i in range(len(str(a))):
    if str(a)[i] == str(a)[len(str(a))-i-1]:
        qqq.append(1)
    else:
        qqq.append(2)
if 2 in qqq:
    print('no')
else:
    print('yes')
'''