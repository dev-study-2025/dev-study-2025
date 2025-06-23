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
        


