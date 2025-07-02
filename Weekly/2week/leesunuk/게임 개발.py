# 1. 맵 크기 입력
N, M = map(int, input().split())

# 2. 캐릭터 시작 위치(A, B)와 방향(D) 입력
A, B, D = map(int, input().split())

# 3. 맵 정보 입력 (0: 육지, 1: 바다)
game_map = [list(map(int, input().split())) for _ in range(N)]

# 4. 방문 체크용 맵 만들기 (0으로 시작)
visited = [[0]*M for _ in range(N)]
visited[A][B] = 1  # 시작 위치는 방문했다고 표시

# 5. 방향: 북(0), 동(1), 남(2), 서(3)
dx = [-1, 0, 1, 0]  # 행 이동
dy = [0, 1, 0, -1]  # 열 이동

# 6. 왼쪽으로 회전하는 함수
def turn_left():
    global D
    D = (D - 1) % 4  # 0 -> 3 -> 2 -> 1 -> 0 ...

# 7. 시작 세팅
x, y = A, B
count = 1  # 시작 위치는 방문했으니 1
turn_time = 0  # 회전 횟수

# 8. 시뮬레이션 시작
while True:
    turn_left()
    nx = x + dx[D]
    ny = y + dy[D]

    # 아직 안 가본 육지면 이동
    if visited[nx][ny] == 0 and game_map[nx][ny] == 0:
        visited[nx][ny] = 1
        x, y = nx, ny
        count += 1
        turn_time = 0
        continue
    else:
        turn_time += 1

    # 4번 다 돌아봤는데 못 가면
    if turn_time == 4:
        nx = x - dx[D]
        ny = y - dy[D]
        # 뒤가 육지면 뒤로 이동
        if game_map[nx][ny] == 0:
            x, y = nx, ny
            turn_time = 0
        else:
            break  # 뒤가 바다면 끝

# 9. 결과 출력
print(count)
