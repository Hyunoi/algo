import itertools

def solution(numbers):
    strList = sorted(itertools.permutations(numbers, len(numbers)))
    intList = []

    for s in strList:
        intList.append(int(str(s[0])+str(s[1])+str(s[2])))

    return (max(sorted(intList)))

n = [6, 10, 2]
solution(n)