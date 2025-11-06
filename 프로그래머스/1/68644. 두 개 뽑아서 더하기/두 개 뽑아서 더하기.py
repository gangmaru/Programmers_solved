from itertools import combinations
def solution(numbers):
    answer = []
    for c in combinations(numbers,2):
        if sum(c) in answer:
            continue
        else:
            answer.append(sum(c))
    answer.sort()
    return answer