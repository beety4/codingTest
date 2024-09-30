# 24.06.25
# https://www.acmicpc.net/problem/1009

tc = int(input())
for _ in range(tc):
    a, b = map(int, input().split())
    comp = a % 10

    if comp==0:
        print(10)
    elif comp==1 or comp==5 or comp==6:
        print(comp)
    elif comp==4 or comp==9:
        if b%2 == 0:
            print((comp**2)%10)
        else:
            print(comp)
    else:
        if b%4 == 0:
            print(comp**4 % 10)
        else:
            print(comp ** (b%4)%10)

