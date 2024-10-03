# 24.09.30
# https://www.acmicpc.net/problem/2441

n = int(input())

for i in range(0, n+1):
    print(" " * i, end='')
    print("*" * (n-i))
