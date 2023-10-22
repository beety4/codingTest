# 23.07.31
# https://school.programmers.co.kr/learn/courses/30/lessons/120880

def solution(numlist, n):
    answer = []
    distance = []

    # 기준 n 과의 거리를 새로운 배열로 만든다
    for i in range(len(numlist)):
        distance.append(abs(n - numlist[i]))

    # 오름차순 정렬
    distance = sorted(distance)

    for i in range(len(numlist)):
        # 맨앞 인덱스 제외 동일한 절댓값이 있다면 반대 연산을 통해 원래값 삽입
        if distance[i] == distance[i-1] and i != 0:
            answer.pop()
            answer.append(distance[i] + n)
            answer.append(-(distance[i]) + n)
        else:
            # 절댓값 역계산 시 +- 결과를 numlist의 존재 유무를 통해 확인 후 삽입
            if distance[i]+n in numlist:
                answer.append(distance[i] + n)
            else:
                answer.append(n-distance[i])

    return answer


#a = list(map(int, input().split()))
#b = int(input())
a = [1,2,3,4,5,6]
b = 4
#a = [10000,20,36,47,40,6,10,7000]
#b = 30
print(solution(a, b))