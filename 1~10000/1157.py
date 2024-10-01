word = list(input().upper())

count = {i:word.count(i) for i in set(word)}
max = dict(sorted(count.items(), key=lambda x: x[1], reverse=True))
max = list(max.values())

if len(word) == 1:
    print(word[0].upper())
elif max[0] == max[1]:
        print('?')
else:
    for k, v in count.items():
        if v == max[0]:
            print(k)
