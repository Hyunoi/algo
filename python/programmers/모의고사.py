def solution(answers):
    firstPerson = [1,2,3,4,5]
    secondPerson = [2,1,2,3,2,4,2,5]
    thridPerson = [3,3,1,1,2,2,4,4,5,5]

    scoreBoard = [0, 0, 0]
    for i in range(len(answers)):
        if (answers[i] == firstPerson[i]):
            scoreBoard[0] += 1
        if (answers[i] == secondPerson[i]):
            scoreBoard[1] += 1
        if (answers[i] == thridPerson[i]):
            scoreBoard[2] += 1
        
    maxScore = max(scoreBoard)
    
    if scoreBoard.count(maxScore) > 1:
        print(sorted(scoreBoard))
    else:
        print(f"[{maxScore}]")

list = [1,3,2,4,2]
solution(list)