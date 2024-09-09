num = int(input())
12
for i in range(num):
    h, w, n = map(int, input().split())
    xx = (n // h) + 1
    yy = n % h
    if n % h == 0:
        xx = (n // h)
        yy = h
    if xx < 10 :
        xx = '0' + str(xx)
    yyxx =str(yy) + str(xx) 
    print(yyxx)
