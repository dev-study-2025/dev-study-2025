# 풀이

N, M = map(int, input().split())

result = 0

for _ in range(N) :
    cards = list(map(int, input().split()))
    min_value =  min(cards)
    result = max(result, min_value)
    
print(result)

# 또 다른 답안 (이중 for문 활용)

N, M = map(int, input().split())

result = 0

for i in range(N):
    data = list(map(int, input().split()))
    min_value = 99999
    for a in data:
        min_value = min(min_value, a)
    result = max(result, min_value)

print(result) 




# CS 제출 https://leesunuk.tistory.com/177