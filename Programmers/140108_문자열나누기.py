# 23.07.26
# https://school.programmers.co.kr/learn/courses/30/lessons/140108

def solution(s):
    # 초기값 x를 맨 앞 문자로 지정
    x = s[0]
    answer = 0

    comp = 0
    other = 0

    for i in range(len(s)):
        # 현재 문자열이 x와 같다면 1 증가 다르면 other 1 증가
        if x == s[i]:
            comp += 1
        else:
            other += 1

        # 만약 현재가 문자열의 마지막이라면 1 증가 후 종료
        if len(s)-1 == i:
            answer += 1
            break

        # x의 문자열과 다른 문자열의 값이 같아졌다면
        if comp == other:
            # 결과값 1 증가 후 초기화 시킨 뒤, x값을 다음 문자로 지정
            answer += 1
            comp = 0
            other = 0
            x = s[i+1]

    return answer


print(solution(input()))