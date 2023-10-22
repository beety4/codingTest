# 23.07.31
# https://school.programmers.co.kr/learn/courses/30/lessons/12910

def solution(arr, divisor):
    answer = []

    # 나눠지는 수 answer 배열에 추가
    for num in arr:
        if num % divisor == 0:
            answer.append(num)

    # 나눠지는 수 가 없다면 -1 저장
    if len(answer) == 0:
        answer.append(-1)

    return sorted(answer)


a = list(map(int, input().split()))
b = int(input())
print(solution(a,b))
