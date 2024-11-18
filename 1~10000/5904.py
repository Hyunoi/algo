# moo

def moo(n, s, mooLength):
    middle = (mooLength - (s+3)) // 2 
    if n <= middle:             # 왼쪽
        return moo(n, s-1, middle)
    elif n > middle + (s+3):    # 오른쪽
        return moo(n - middle - (s+3), s-1, middle)
    else:                       # 가운데
        if n == middle + 1:
            return "m"
        else:
            return "o"

n = int(input())
s = 0           # S(k) <- k
mooLength = 3   # "moo"의 길이

while mooLength < n:
    s += 1
    mooLength = 2 * mooLength + (s + 3)

print(moo(n, s, mooLength))