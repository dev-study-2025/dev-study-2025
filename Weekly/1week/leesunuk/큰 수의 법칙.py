# 풀이

N, M, K = map(int, input().split())
a = list(map(int, input().split()))

a.sort()
print(a)
b = a[N-1]
c = a[N-2]

result = 0
count = 0

for i in range(M) :
    if count >= K :
        result += c
        count = 0
    else :
        result += b
        count += 1

print(result)
        

# 답안

n, m, k = map(int, input().split())

data = list(map(int, input().split()))

data.sort()

first = data[n-1]
second = data[n-2]

#가장 큰 수가 더해지는 횟수 계산
count = int (m / (k+1)) * k
count += m % (k+1)

result = 0
result += (count) * first # 가장 큰 수 더하기
result += (m - count) * second # 두 번쨰로 큰 수 더하기 

print(result) # 최종 답안 출력
