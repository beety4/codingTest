# 23.07.03
# https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWVl47b6DGMDFAXm

T = int(input())
for test_case in range(1, T+1):
    original = list(input())

    cnt = 0
    loc = []

    # 막대기와 레이저의 위치를 특정하기 위한 for문
    for i in range(len(original)):
        # '('기호이면 인덱스 번호를 loc에 삽입
        if original[i] in '(':
            loc.append(i)
        # 그외 loc 리스트에서 제일 마지막에 삽입한 '('인덱스 불러오기
        else:
            out = loc.pop()

            # 가져온 인덱스 +1이 i 라면 () 으로 레이저
            if (out+1) == i:
                # 현재 레이저 i 뒤에 막대기가 있다면 잘라지기에
                # 존재하는 막대기 개수 len(loc)을 cnt에 추가
                cnt += len(loc)
            # 인덱스가 서로 떨어져 있다면 잘라지지 않은 막대기
            else:
                cnt += 1

    print(f"#{test_case} {cnt}")


