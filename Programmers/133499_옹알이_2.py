# 23.07.30
# https://school.programmers.co.kr/learn/courses/30/lessons/133499

def solution(babbling):
    answer = 0
    keyword = ["aya", "ye", "woo", "ma"]

    for bab in babbling:
        tmp = ""
        pre = ""

        # 만약 옹알이 소리가 온전하게 있다면 +1 시키고 반복
        if bab in keyword:
            answer += 1
            continue

        # 문자열 길이를 기준으로 단어 구분
        loo = len(bab)
        for i in range(loo):
            # 한글자씩 tmp에 추가
            tmp += bab[i]

            # 만약 키워드 안에 글자가 있다면
            if tmp in keyword:
                # 이전 값과 똑같으면 중도중지
                if pre == tmp:
                    break
                # 문자열 총길이 - 같은 문자열의 길이
                # 연산 후 pre 할당 및 tmp 초기화
                loo -= len(tmp)
                pre = tmp
                tmp = ""

        # 위 for문이 실행된 뒤 길이가 0이라면 +1
        if loo == 0:
            answer += 1

    return answer


print(solution(list(input().split())))
