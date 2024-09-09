from collections import deque

n = int(input())
card = deque()

for i in range(n):
    card.append(i+1)

while (1):
    if len(card) == 1:
        break
    card.popleft()      # 왼쪽 끝 값 가져오면서 삭제
    s = card.popleft()  # s에 할당
    card.append(s)      # deque에 s 추가
    
print(card.pop())
