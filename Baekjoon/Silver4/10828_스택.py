# 24.10.11
# https://www.acmicpc.net/problem/10989

n = int(input())

stick = []
for _ in range(n):
    command = input()
    classification = command[:2]

    if classification == "pu":
        num = int(command.split()[1])
        stick.append(num)
    elif classification == "po":
        if len(stick) == 0:
            print(-1)
        else:
            print(stick.pop())
    elif classification == "si":
        print(len(stick))
    elif classification == "em":
        if len(stick) == 0:
            print(1)
        else:
            print(0)
    elif classification == "to":
        if len(stick) == 0:
            print(-1)
        else:
            print(stick[len(stick)-1])
