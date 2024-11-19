# 사분면
# https://www.acmicpc.net/problem/1891

def findPiece(n, pieceNum):
    x, y = 0, 0
    for i in range(n):
        n -= 1

        # 2 사분면
        if pieceNum[i] == "2":
            pass
        # 1 사분면
        elif pieceNum[i] == "1":
            x += (2**n)
        # 3 사분면
        elif pieceNum[i] == "3":
            y += (2**n)
        # 4 사분면
        elif pieceNum[i] == "4":
            x += (2**n)
            y += (2**n)

    return x, y

def makePiece(n, x, y):
    piece = ""
    for i in range(n):
        n -= 1

        # 2 사분면
        if x < (2**n) and y < (2**n):
            piece += "2"
        # 1 사분면
        elif x >= (2**n) and y < (2**n):
            piece += "1"
            x -= (2**n)
        # 3 사분면
        elif x < (2**n) and y >= (2**n):
            piece += "3"
            y -= (2**n)
        # 4 사분면
        elif x >= (2**n) and y >= (2**n):
            piece += "4"
            x -= (2**n)
            y -= (2**n)
            
    return piece
        
d, pieceNum = map(int, input().split())
moveX, moveY = map(int, input().split())

x, y = findPiece(d, str(pieceNum))

x += moveX
y -= moveY

# x, y 좌표가 사분면 안에 있는 경우
if 0 <= x < (2**d) and 0 <= y < (2**d):
    print(makePiece(d, x, y))
# 없는 경우
else:
    print("-1")
