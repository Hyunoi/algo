# 쿼드트리
import sys

def quadTree(x, y, num):
    color = graph[x][y]

    for i in range(x, x+num):
        for j in range(y, y+num):
            if graph[i][j] != color:
                print("(", end="")
                quadTree(x, y, num//2)
                quadTree(x, y+(num//2), num//2)
                quadTree(x+(num//2), y, num//2)
                quadTree(x+(num//2), y+(num//2), num//2)
                print(")", end="")
                return
            
    if color == "1":
        print("1", end="")
    else:
        print("0", end="")

num = int(input())
graph = []

for i in range(num):
    graph.append(input())

quadTree(0, 0, num)