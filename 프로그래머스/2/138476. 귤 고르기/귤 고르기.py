from collections import Counter

def solution(k, tangerine):
    answer = 0
    size = Counter(tangerine)
    size = sorted(size.values(), reverse=True)

    sumN = 0

    for i in size:
        sumN += i
        answer += 1
        if sumN >= k:
            return answer

    return answer