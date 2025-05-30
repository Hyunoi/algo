from itertools import permutations
import math

def is_Prime(num):
    if num < 2:
        return False
    for i in range(2, int(math.sqrt(num))+1):
        if num % i == 0:
            return False
    return True

def solution(numbers):
    numList = []

    for i in range(1, len(numbers)+1):
        num = permutations(numbers, i)

        for n in num:
            numList.append(int(''.join(n)))

    numList = sorted(set(numList))
    primeCount = 0

    for n in numList:
        if is_Prime(n):
            primeCount += 1

    return primeCount

solution("011")