# 25.04.09
# https://www.acmicpc.net/problem/1264

while True:
    n = input()
    if n == '#':
        break

    cnt = 0
    for s in n:
        if s in ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']:
            cnt += 1

    print(cnt)
