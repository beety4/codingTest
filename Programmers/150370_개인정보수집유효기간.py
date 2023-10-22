# 23.08.01
# https://school.programmers.co.kr/learn/courses/30/lessons/150370


def solution(today, terms, privacies):
    answer = []
    dic = {}

    # "A" : 3 이런식으로 딕셔너리에 만료일 데이터 저장
    for term in terms:
        dic[term[0:1]] = int(term[2:])

    # 개인정보 수집 일자 별로 반복
    for i in range(len(privacies)):
        # 년월일, 만료월 인덱싱
        year = int(privacies[i][:4])
        month = int(privacies[i][5:7])
        day = privacies[i][8:10]
        after = month + dic[privacies[i][11:]]

        print(after)

        # 13월이되면 년도를 +1 해주는 함수
        if after > 12:
            year += int(after / 13)
            month = after % 12
            if after % 12 == 0:
                month = 12
        else:
            month = after


        # todya와 같은 형식으로 변환
        afterdate = f"{year}.{str(month).zfill(2)}.{day}"

        print(afterdate)

        # 날짜 비교 후 만료 시 answer에 삽입
        if afterdate <= today:
            answer.append(i+1)

    return answer


#a = "2022.05.19"
#b = ["A 6", "B 12", "C 3"]
#c = ["2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"]
#a = "2020.01.01"
#b = ["Z 3", "D 5"]
#c = ["2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"]
a = "2020.12.17"
b = ["A 12"]
c = ["2019.12.17 A"]
print(solution(a, b, c))