# 풀이

n = input()  # 예: "a1"

knight = list(n)
x = ord(knight[0]) - ord('a') + 1  # 열 (a~h → 1~8)
y = int(knight[1])                 # 행 (1~8)

count = 0

# 나이트는 x나 y축으로 2칸 이동, 반대축으로 1칸 이동 (총 8가지 경우)
for dx in [-2, -1, 1, 2]:
    for dy in [-2, -1, 1, 2]:
        if abs(dx) == abs(dy):  # (2,2), (1,1)인 경우는 제외 → L자 형태 아님
            continue
        nx = x + dx
        ny = y + dy
        if 1 <= nx <= 8 and 1 <= ny <= 8:
            count += 1

print(count)

# 다른 풀이

n = input()  # 예: "a1"

# 입력 위치를 숫자로 변환
col = ord(n[0]) - ord('a') + 1  # 열: a~h -> 1~8
row = int(n[1])                 # 행: 1~8

# 나이트가 이동할 수 있는 8가지 방향 정의
steps = [(-2, -1), (-2, 1), (-1, -2), (-1, 2),
         (1, -2), (1, 2), (2, -1), (2, 1)]

count = 0
for dx, dy in steps:
    new_row = row + dx
    new_col = col + dy
    if 1 <= new_row <= 8 and 1 <= new_col <= 8:
        count += 1

print(count)


# CS 제출 - https://leesunuk.tistory.com/182