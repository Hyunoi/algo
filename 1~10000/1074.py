# Z -> 미완성

def Z(length, x, y):
    global r, c, count
    for i in range(x, x+length):
        for j in range(y, y+length):
            if length != 1:
                Z(length//2, x, y)
                Z(length//2, x, y+(length//2))
                Z(length//2, x+(length//2), y)
                Z(length//2, x+(length//2), y+(length//2))
            else:
                return

N, r, c = map(int, input().split())

count = 0
length = 2**(N+N)
graph = [[0 for _ in range(length)] for _ in range(length)]

Z(length, 0, 0)