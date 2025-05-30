import sys

N, M = map(int, input().split())

password_Dict= {}
for i in range(N):
    site, password = map(str, sys.stdin.readline().strip().split())
    password_Dict[site] = password

for i in range(M):
    print(password_Dict[input()])
    