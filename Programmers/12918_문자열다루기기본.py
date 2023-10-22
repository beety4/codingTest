# 23.07.26
# https://school.programmers.co.kr/learn/courses/30/lessons/12918

def solution(s):
    answer = False
    try:
        # 문자열 길이 조건 4 or 6 후 int 형변환
        if (len(s) == 4) or (len(s) == 6):
            int(s)
            answer = True
        # 형변환 성공시 True 반환
        return answer
    except:
        # 중간에 오류 발생 시 False 반환
        return answer


print(solution(input()))