def solution(array, commands):
    a = []
    for i in commands:
        a.append(sorted(array[i[0]-1:i[1]])[i[2]-1])
    return a