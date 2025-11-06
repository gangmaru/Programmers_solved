def solution(strings, n):
    keys=[(x[n], x) for x in strings]
    sorted_keys=sorted(keys)
    result=[i[1] for i in sorted_keys]
    return result