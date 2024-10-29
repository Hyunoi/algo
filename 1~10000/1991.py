import sys

num = int(input())
tree = {}

for _ in range(num):
    node, left, right = sys.stdin.readline().split()
    tree[node] = [left, right]

def PreOrder(root):
    print("root: " , root)
    if root != ".":
        print(root, end="")     # print
        PreOrder(tree[root][0]) # left
        PreOrder(tree[root][1]) # right

def InOrder(root):
    if root != ".":
        InOrder(tree[root][0]) # left
        print(root, end="")     # print
        InOrder(tree[root][1]) # right

def PostOrder(root):
    if root != ".":
        PostOrder(tree[root][0]) # left
        PostOrder(tree[root][1]) # right
        print(root, end="")     # print

PreOrder("A")
# print()
# InOrder("A")
# print()
# PostOrder("A")