# 암호 만들기

L, C = map(int, input().split())
alphabetList = sorted(list(input().split()))

def DFS(word):
    ### 종료조건
    # 1. 길이가 맞는지 확인
    if len(word) == L:
        # 2. 자음, 모음 개수 맞는지 확인
        vowel, consonant = 0, 0
        for w in word:
            if w in "aeiou":
                vowel += 1
            else:
                consonant += 1
        # 3. 맞으면 출력, 아니면 그냥 리턴
        if vowel >= 1 and consonant >= 2:
            print("".join(word))
        return
    
    ### 트리 뻗어나가기
    for a in alphabetList:
        # word가 있고, word의 마지막 문자가 a보다 크다면 넘기기
        if word and word[-1] >= a:
            continue
        word.append(a)
        DFS(word)
        word.pop()

ans = []
DFS(ans)