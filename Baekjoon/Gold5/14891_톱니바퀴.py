# 24.10.04
# https://www.acmicpc.net/problem/14891


# 톱니 정보 입력
lst = []
for _ in range(4):
    line = list(map(int, input()))
    lst.append(line)


# 테스트 케이스 반복
test_case = int(input())
sum = 0
for _ in range(test_case):
    num, loc = map(int, input().split())

    if loc == 1:
        lst[num-1].insert(0, lst[num-1].pop())
    else:
        lst[num-1].append(lst[num-1].pop(0))



    # 3번 기어 돌렸으면
    # 1,2,3,4 전부 검사
    # 3개 검사해서
    # 저 기어랑 가장 가까운 순서대로 돌려줘
    #


    for i in range(0, 4):
        nearby = num - i
        if lst[0][2] == lst[1][6]:
            # num 과 가까운 기어 변경

        if lst[1][6] == lst[2][2]:
            # num 과 가까운 기어 변경

        if lst[2][6] == lst[3][2]:
            # pass





    for i in range(0, 3):
        lst[seq[i]-1]

        print(seq[i]-1)
        if lst[seq[i]-1][2] != lst[seq[i+1]-1][6]:
            if loc == 1:
                lst[seq[i+1]-1].insert(0, lst[seq[i+1]-1].pop())
            else:
                lst[seq[i+1]-1].append(lst[seq[i+1]-1].pop(0))


    # 점수 구하기
    for i in range(0,4):
        if lst[i][0] == 1:
            sum += 2**i


for fef in lst:
    print(fef)
print(sum)

    # if num == 1:
    #     if loc == 1:
    #         if lst[0][2] == lst[1][6]:
    #             left(lst[1])
    #         right(lst[0])
    #     else:
    #         if lst[0][2] == lst[1][6]:
    #             right(lst[1])
    #         left(lst[0])
    # elif num == 2:
    #
    # elif num == 3:
    #
    #
    # elif num == 4:
    #
    #
    # if lst[0][2] == lst[1][6]:
    #     print("test")
    # elif lst[1][2] == lst[2][6]:
    #     print("test")
    # elif lst[2][2] == lst[3][6]:
    #     print("test")
    #
    # print(right(lst[0]))
    #




