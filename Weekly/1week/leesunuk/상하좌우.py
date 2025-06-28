# 풀이
n = int(input())
plans = input().split()

result = [1, 1]

for i in range(len(plans)) :
    if plans[i] == 'U'  and result[0] > 1:
        result[0] -= 1

    elif plans[i] == 'D' and result[0] < n:
        result[0] += 1

    elif plans[i] == 'R' and result[1] < n:
        result[1] += 1

    elif plans[i] == 'L' and result[1] > 1:
        result[1] -= 1
    
    else : continue

print(result[0], result[1])


# 또다른 답

n = int(input())
plans = input().split()

# 시작 좌표
x, y = 1, 1

# 이동 방향 정의
moves = {
    'U': (-1, 0),
    'D': (1, 0),
    'L': (0, -1),
    'R': (0, 1)
}

# 명령어 하나씩 처리
for plan in plans:
    dx, dy = moves[plan]
    nx, ny = x + dx, y + dy
    if 1 <= nx <= n and 1 <= ny <= n:
        x, y = nx, ny

print(x, y)


# CS 제출 - https://leesunuk.tistory.com/179