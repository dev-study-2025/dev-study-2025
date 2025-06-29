# 풀이

n = int(input())
count = 0

while n > 0:
    if n >= 500:
        count += n // 500
        n %= 500
    elif n >= 100:
        count += n // 100
        n %= 100
    elif n >= 50:
        count += n // 50
        n %= 50
    elif n >= 10:
        count += n // 10
        n %= 10
    else:
        break

print(count)


# 또 다른 풀이

n = int(input())

count = 0

for coin in [500, 100, 50, 10]:
    count += n // coin   # 해당 동전 몇 개 쓸 수 있는지
    n %= coin            # 남은 금액으로 넘어감

print(count)


#CS 제출 - https://leesunuk.tistory.com/181