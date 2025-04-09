# 25.04.09
# https://www.acmicpc.net/problem/1100

cnt = 0
for i in range(8):
    n = input()

    for j in range(i%2, i%2+8, 2):
        if n[j] == 'F':
            cnt += 1

print(cnt)
