# 문자열 폭발

inputStr = input()
bomb = input()
stack = []
bombLength = len(bomb)

for c in inputStr:
    stack.append(c)

    if bombLength <= len(stack):
        stackTail = ''.join(stack[-bombLength:])
        if stackTail == bomb:
            for i in range(bombLength):
                stack.pop()

if not stack:
    print("FRULA")
else:
    print("".join(stack))


# while bombStr in inputStr:
#         inputStr = inputStr.replace(bombStr, "")

# if not inputStr:
#     print("FRULA")
# else:
#     print(inputStr)