import sys
# 재귀 깊이 제한 풀어주기
# 파이썬은 기본적으로 1000 -> 재귀 깊이 제한을 높여준다 
sys.setrecursionlimit(10**6)

t = []

while True:
    node = sys.stdin.readline().strip()
    if node == "":
        break
    t.append(int(node))

def PreToPost(tree):
    if len(tree) == 0:
        return

    mid = tree[0]
    leftTree, rightTree = [], []

    for i in range(1, len(tree)):
        if tree[i] > mid:
            leftTree = tree[1:i]
            rightTree = tree[i:]
            break
    
    # 위의 for문에서 break로 중단되지 않는 경우 실행된다
    # for-else문
    else:
        leftTree = tree[1:]

    PreToPost(leftTree)
    PreToPost(rightTree)
    print(mid)

PreToPost(t)