# 24.10.04
# https://www.acmicpc.net/problem/1110

n = int(input())
cnt = 1
value = n

while True:
    a = value
    value = (a%10) * 10 + (value//10 + value)%10

    if value == n:
        print(cnt)
        break

    cnt += 1
