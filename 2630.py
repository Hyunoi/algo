# 색종이 만들기
import sys

def DivideConquer(x, y, num):
    global white, blue
    color = papers[x][y]

    for i in range(x, x+num):
        for j in range(y, y+num):
            if color != papers[i][j]:
                DivideConquer(x, y, num//2)
                DivideConquer(x, y+(num//2), num//2)
                DivideConquer(x+(num//2), y, num//2)
                DivideConquer(x+(num//2), y+(num//2), num//2)
                return
            
    if color == 0:
        white += 1
    else:
        blue += 1


num = int(input())

papers = []

for i in range(num):
    papers.append(list(map(int, sys.stdin.readline().split())))

white = 0
blue = 0

DivideConquer(0, 0, num)
print(white)
print(blue)