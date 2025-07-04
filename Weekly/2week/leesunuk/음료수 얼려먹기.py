#풀이

N, M = map(int, input().split())

# 파이썬의 재귀 깊이를 늘리기 위해 추가
import sys
sys.setrecursionlimit(10000)

# 입력 받기
n, m = map(int, input().split())

# 얼음 틀 입력 받기 (문자열로 받은 후 리스트로 변환)
graph = []
for _ in range(n):
    graph.append(list(map(int, input().strip())))

# DFS로 특정 노드를 방문하고 연결된 모든 노드들도 방문 처리
def dfs(x, y):
    # 주어진 범위를 벗어나면 즉시 종료
    if x < 0 or x >= n or y < 0 or y >= m:
        return False
    
    # 현재 노드를 아직 방문하지 않았다면
    if graph[x][y] == 0:
        graph[x][y] = 1  # 방문 처리
        # 상하좌우 재귀적으로 호출
        dfs(x-1, y)  # 위
        dfs(x+1, y)  # 아래
        dfs(x, y-1)  # 왼쪽
        dfs(x, y+1)  # 오른쪽
        return True  # 이 구역은 하나의 아이스크림
    
    return False  # 이미 방문했거나 칸막이인 경우

# 전체 맵을 확인하며 아이스크림 개수 세기
result = 0
for i in range(n):
    for j in range(m):
        if dfs(i, j):  # 0을 만나면 DFS 시작
            result += 1

print(result)
