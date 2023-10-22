# 23.07.31
# https://school.programmers.co.kr/learn/courses/30/lessons/147355

def solution(t, p):
    answer = 0

    # 한칸씩 이동하면서 조회
    for i in range(len(t)):
        # 만약 끝에서 len(p)만큼의 숫자가 남았다면 out of index 방지를
        # 위해 종료
        if len(t) - i == len(p)-1:
            break

        # 현재 위치로부터 len(p)만큼의 숫자가 p보다 작다면 answer 증가
        if int(t[i:i+len(p)]) <= int(p):
            answer += 1

    return answer


print(solution(input(), input()))