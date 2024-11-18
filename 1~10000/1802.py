# 종이 접기

def origami(numbers):
    # 길이 1이면 그냥 성공
    if len(numbers) == 1:
        return "YES"
    
    # 종이를 절반으로 나누기
    middle = len(numbers) // 2
    right = numbers[0:middle]

    # 왼쪽을 뒤집어줌
    left = numbers[middle+1:]
    reverseLeft = left[::-1]

    # 오른쪽과 반전된 왼쪽의 수가 같으면 NO
    for i in range(len(right)):
        if right[i] == reverseLeft[i]:
            return "NO"
    
    # 종이 접기가 되는 경우 오른쪽 다시 실행
    return origami(right)

test = int(input())
for i in range(test):
    numbers = input()
    print(origami(numbers))