# 23.06.30
# https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5LrsUaDxcDFAXc

T = int(input())
for test_case in range(1, T+1):
    # 입력받을 배열의 크기 day, 입력받은 배열 숫자로 original
    day = int(input())
    original = list(map(int, input().split()))

    # test_case 실행할때 마다 관련 변수 초기화
    current = compare = day - 1
    obj = []
    results = []

    # 입력받은 배열의 마지막을 current로 두고 한칸씩 뒤로 이동
    while current != -1:
        current -= 1
        # 만약 현재 숫자가 앞에 숫자보다 크다면 판매가 이득이니
        # 임시 배열 obj에 값 추가
        if original[compare] > original[current] and current >= 0:
            obj.append(original[current])
        # 그렇게 쭉 저장하다가 현재 값보다 더 큰값이 나온다면
        # 중지하고 여태까지 저장한 obj로 계산
        else:
            # 구매가 판매가를 구하고 순수익 계산 후 results에 저장
            sale = original[compare] * len(obj)
            buy = sum(obj)
            results.append(sale-buy)
            
            # 임시 배열을 다시 초기화 후 비교할 수를 현재로 지정
            obj = []
            compare = current

    # 저장된 results의 결과들을 모두 합하면 총 순수익임
    print(f"#{test_case} {sum(results)}")



