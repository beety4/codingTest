# 23.07.03
# https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AYGtoa3qARcDFARC

T = int(input())
for test_case in range(1, T+1):
    ground = list(input())

    tmp = []
    cnt = 0

    for i in range(len(ground)-1):
        if ground[i] == "(" and ground[i+1] == "|":
            cnt += 1

        if (ground[i] == "|") and (ground[i+1] == ")"):
            cnt += 1

        if ground[i] == "(" and ground[i+1] == ")":
            cnt += 1

    print(f"#{test_case} {cnt}")
