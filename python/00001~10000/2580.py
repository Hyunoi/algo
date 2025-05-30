# 스도쿠
# 백트래킹

import sys

def rowCheck(x, num):       # 가로 체크
    for i in range(9):
        # 존재하는 경우
        if num == sudoku[x][i]:
            return False
    return True

def columnCheck(y, num):    # 세로 체크
    for i in range(9):
        if num == sudoku[i][y]:
            return False
    return True

def squareCheck(y, x, num): # 정사각형 체크
    for i in range(3):
        for j in range(3):
            if num == sudoku[(y//3)*3+i][(x//3)*3+j]:
                return False
    return True

# def Valid(y, x, num):
#     # 가로, 세로, 정사각형 모두 True인 경우 -> 빈 칸 채울 수 있음
#     if rowCheck(y, num) and columnCheck(x, num) and squareCheck(y, x, num):
#         return True
#     return False
    

def solveSudoku(blank):
    if blank == len(zero):
        for i in range(9):
            print(" ".join(map(str, sudoku[i])))
        exit(0)
        # return - exit
        # 81칸을 다 돌았다면 강제적으로 종료시켜줘야 함
        # return 하면 다시 0으로 초기화 하게 됨

    for num in range(1, 10):
        y = zero[blank][0]  # 세로
        x = zero[blank][1]  # 가로
        
        # 빈 칸 채우기 가능
        # 조건문을 함수 하나로 뺏었는데 이게 시간이 굉장히 오래 걸림
        # if Valid(y, x, num):
        if rowCheck(y, num) and columnCheck(x, num) and squareCheck(y, x, num):
            sudoku[y][x] = num
            solveSudoku(blank+1)
            # 앞선 숫자가 잘못 들어갔다면 0으로 초기화 시킨 후 다시 진행
            sudoku[y][x] = 0
        
sudoku = [list(map(int, sys.stdin.readline().split())) for _ in range(9)]
zero = []

for i in range(9):
    for j in range(9):
        if sudoku[i][j] == 0:
            zero.append([i, j])

solveSudoku(0)