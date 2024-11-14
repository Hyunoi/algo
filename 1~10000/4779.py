# 칸토어 집합
# 재귀

def Cantor(num):
    if num == 1:
        return "-"
    divideCantor = Cantor(num // 3)
    printCantor = divideCantor + " " * (num // 3)  + divideCantor

    return printCantor
    
while True:
    try:
        n = int(input())
        print(Cantor(3**n))
    except:
        break