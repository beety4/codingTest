# 24.10.04
# https://www.acmicpc.net/problem/1193

n = int(input())
cnt = 1

while cnt < n:
    n -= cnt
    cnt +=1

if cnt%2 == 0:
    print(f"{n}/{cnt-n+1}")
else:
    print(f"{cnt-n+1}/{n}")


