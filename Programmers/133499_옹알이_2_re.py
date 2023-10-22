# 23.08.02
# https://school.programmers.co.kr/learn/courses/30/lessons/133499

def solution(babbling):
    answer = 0

    # 반복되는 문자열은 제외
    for i in range(len(babbling)):
        if "ayaaya" in babbling[i] or "yeye" in babbling[i] or "mama" in babbling[i] or "woowoo" in babbling[i]:
            continue

        # 각 문자열에 포함되있는 갯수 카운팅
        a = babbling[i].count("aya")
        b = babbling[i].count("ye")
        c = babbling[i].count("ma")
        d = babbling[i].count("woo")

        # 총 글자 수에서 각 문자의 갯수 제외
        result = len(babbling[i]) - a * 3 - b * 2 - c * 2 - d * 3

        # 0이면 다른 문자는 없는걸로 answer 증가
        if result == 0:
            answer += 1

    return answer


rein = ["ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"]
print(solution(rein))