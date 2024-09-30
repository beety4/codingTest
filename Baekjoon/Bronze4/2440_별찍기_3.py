# 24.06.30
# https://www.acmicpc.net/problem/2440

n = int(input())

for i in range(n, 0, -1):
    for j in range(i):
        print("*", end="")
    print()
