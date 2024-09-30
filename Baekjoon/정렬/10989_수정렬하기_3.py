# 24.06.30
# https://www.acmicpc.net/problem/10989

n = int(input())

lst = []
for _ in range(n):
    lst.append(int(input()))


for i, num in enumerate(lst):
    tmp = 0
    if i == len(lst)-1:
        break

    if num > lst[i+1]:
        tmp = lst[i+1]
        lst[i] = tmp
        lst[i+1] = num


for num in lst:
    print(num)

