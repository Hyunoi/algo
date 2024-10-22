# 카펫
def solution(brown, yellow):
    answer = []

    yellowX = 0
    yellowY = 0
    for i in range(1, yellow+1):
        if yellow%i==0:
            yellowX = yellow // i
            yellowY = i
            
            if brown == (yellowX+2) * (yellowY+2) - yellow:
                answer.append([yellowX+2, yellowY+2])
                break
            
    answer.sort(reverse=True)
    return answer[0]

solution(24,24)