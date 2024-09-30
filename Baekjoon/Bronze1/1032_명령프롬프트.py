# 24.06.25
# https://www.acmicpc.net/problem/1032

lst = []

tc = int(input())
if tc == 1:
    print(input())
    exit(0)


for _ in range(tc):
    lst.append(input())


original = lst[0]
for i in range(tc):
    for j in range(len(lst[0])):
        if lst[i][j] == lst[i][j]:
            


