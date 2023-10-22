# 23.07.04
# https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWAe7XSKfUUDFAUw

T = int(input())
for test_case in range(1, T+1):
    ea = int(input())
    weight = list(map(int, input().split()))

    a = (2 ** ea) * ea * (ea-1)

    for i in range(ea):
        print()
