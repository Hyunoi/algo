import sys

def choiceLook(n):
    # 딕셔너리 만들기
    itemDict = {}

    for i in range(n):
        item, category = input().split()
        if category not in itemDict:        # 기존에 없던 항목이면 키 밸류 하나 만들어 놓기
            itemDict[category] = []
        itemDict[category].append(item)     # 밸류 채우기

    countList = []
    for category, item in itemDict.items(): # .items() -> 키 밸류 반환하는 메소드
        countList.append(len(item)+1)       # 밸류의 개수+1 추가
    
    ans = 1
    for i in countList:
        ans *= i            # 다 곱해서 -1 하기
                            # 다 안 입는 경우가 하나 포함되기 때문
    print(ans-1)


num = int(input())
for i in range(num):
    n = int(sys.stdin.readline().strip())
    choiceLook(n)

