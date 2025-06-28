# 풀이

n = int(input())


count = 0

for h in range(n+1):
    for m in range(60):
        for s in range(60):
            if '3' in f"{h}{m}{s}":
                count+=1

print(count)


# 또 다른 풀이

def has_three(h, m, s):
    return '3' in str(h) or '3' in str(m) or '3' in str(s)

for h in range(n + 1):
    for m in range(60):
        for s in range(60):
            if has_three(h, m, s):
                count += 1
