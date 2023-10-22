# 23.07.29
# https://school.programmers.co.kr/learn/courses/30/lessons/155652

def solution(s, skip, index):
    answer = ''

    for word in s:
        # 현재 단어의 아스키코드를 a 에 저장
        a = ord(word)
        i = index
        while i > 0:
            # a에 1 증가
            a += 1
            # 만약 z까지 갔다면 -26으로 다시 a로 back시킴
            if a > ord('z'):
                a -= 26

            # 스킵 문자에 포함되있다면 i 값을 증가시켜 반복 +1
            if chr(a) in skip:
                i += 1
            # i값을 빼서 index 횟수만큼 이동
            i -= 1

        answer += chr(a)

    return answer


print(solution(input(), input(), int(input())))


