# 23.07.30
# https://school.programmers.co.kr/learn/courses/30/lessons/81301

def solution(s):
    answer = ""
    tmp = ""
    key = ["zero", "one", "two", "three", "four",
           "five", "six", "seven", "eight", "nine"]

    for i in range(len(s)):
        # 만약 숫자라면 숫자를 answer에 추가
        if s[i].isdigit():
            answer += s[i]
            continue

        # 숫자가 아닌 현재 문자를 tmp에 저장
        tmp += s[i]

        # tmp에 쌓인 문자열이 key리스트 안에 있다면
        if tmp in key:
            # 결과값에 해당 문자열의 인덱스번호(숫자값)을 저장 후 tmp 초기화
            answer += str(key.index(tmp))
            tmp = ""
            continue

    # 저장된 문자열 값을 int형으로 반환
    return int(answer)


print(solution(input()))

