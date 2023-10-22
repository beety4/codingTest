# 23.07.30
# https://school.programmers.co.kr/learn/courses/30/lessons/68644

def solution(numbers):
    # 입력 받은 숫자 길이
    loo = len(numbers)
    arr = []
    
    # 두 수의 합을 구하는 for문
    for i in range(loo):
        for j in range(loo):
            # 같은 인덱스의 값은 더하지 않도록 설정
            if i is not j:
                arr.append(int(numbers[i]) + int(numbers[j]))

    # set 집합에 넣어서 중복 제거 및 정렬 후 리스트로 반환
    answer = list(set(arr))
    return sorted(answer)


print(solution(list(input().split())))
