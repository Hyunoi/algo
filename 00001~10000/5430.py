# AC
from collections import deque

def AC():
    commandQ = deque()
    commands = input()
    listLen = int(input())
    nums = input()[1:-1]

    
    if not nums and "D" in commands:     # numList가 비어 있는 상태에서 커맨드에 D가 있는 경우
        print("error")
        return
    
    elif not nums and "R" in commands:  # numList가 비어 있는 상태에서 커맨드에 R이 있는 경우54
        print("[]")
        return
    
    numList = list(map(int, nums.split(",")))

    for c in commands:
        commandQ.append(c)


    rStatus = True     # t -> 정방향, f -> 역방향 

    while commandQ:
        command = commandQ.popleft()   # 맨 왼쪽 커맨드 빼기

        if command == "R":
            rStatus = not rStatus   # 리버스 상태 바꾸기 (t -> f, f-> r)
        
        elif command == "D" and not numList:    # numList가 비어 있는 상태에서 커맨드에 D가 있는 경우
            print("error")
            return
        elif command == "D":
            if rStatus:         # 정방향
                numList.pop(0)
            else:
                numList.pop()  # 역방향
            
    if rStatus:     # 정방향
        print(str(numList).replace(" ", ""))
    else:           # 역방향
        numList.reverse()
        print(str(numList).replace(" ", ""))

testNum = int(input())
for i in range(testNum):
    AC()
