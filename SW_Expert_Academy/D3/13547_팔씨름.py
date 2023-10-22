# 23.06.30
# https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AX6PP9G6p1sDFAS9&

T = int(input())
for test_case in range(1, T+1):
    game = list(input())

    # 입력받은 게임에 15칸까지 나머지를 다 이긴걸로 간주하고 채움
    for i in range(15-len(game)):
        game.append("o")

    # 이긴 횟수가 8 이상이면 YES 아니면 NO 출력
    print(f"#{test_case} ", end="")
    print("YES" if game.count("o") >= 8 else "NO")
