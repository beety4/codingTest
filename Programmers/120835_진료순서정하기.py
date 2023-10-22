# 23.07.31
# https://school.programmers.co.kr/learn/courses/30/lessons/120835

def solution(emergency):
    dic = {}
    answer = []
    # emermgency를 오름차순 정렬한 new 리스트 생성
    new = sorted(emergency, reverse=True)

    # 딕셔너리에 key=값, value=순서 로 저장
    for i in range(len(emergency)):
        dic[new[i]] = i+1

    # 딕셔너리에 저장된 순서 answer에게 삽입
    for i in range(len(emergency)):
        if emergency[i] in dic:
            answer.append(dic[emergency[i]])

    return answer


print(solution(list(map(int, input().split()))))
