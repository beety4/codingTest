# 23.07.31
# https://school.programmers.co.kr/learn/courses/30/lessons/42748

def solution(array, commands):
    answer = []

    # commands의 1열 개수 만큼 반복
    for i in range(len(commands)):
        # i,j 만큼 자른 새로운 배열 생성 및 정렬
        new = sorted(array[commands[i][0]-1:commands[i][1]])
        # k 번째 숫자 answer에 삽입
        answer.append(new[commands[i][2]-1])

    return answer


#a = list(map(int, input().split()))
#b = int(input())
a = [1, 5, 2, 6, 3, 7, 4]
b = [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
print(solution(a, b))
