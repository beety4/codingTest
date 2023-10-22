# 23.07.29
# https://school.programmers.co.kr/learn/courses/30/lessons/70129

def solution(s):
    tmp = 0
    i = 0

    while True:
        # 만약 값이 1이고, 0이 더이상 없다면 종료
        if int(s) == 1:
            break
    
        # 1의 개수를 count에 저장, 0의 개수는 tmp에 증가저장
        count = s.count("1")
        tmp += s.count("0")

        # 1의 개수를 2진수로 변환 후 s 에 저장
        s = str(format(count, 'b'))
        i += 1

    # 반복 횟수 및 제거했던 0의 개수 반환
    answer = [i, tmp]
    return answer


print(solution(input()))

