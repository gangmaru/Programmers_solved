def solution(sizes):
    answer = 0
    for size in sizes:
        size.sort(reverse=True)
        print(size)
    w,h=map(list,zip(*sizes))
    return max(w)*max(h)

# def solution(sizes):
#     # size들의 크기 정렬
#     for size in sizes:
#         size.sort(reverse=True)
#     # 가로 길이 리스트와 세로길이 리스트로 sizes들 언팩!!
#     w,h = map(list,zip(*sizes))
#     # 그중 최대끼리의 곱
#     return max(w) * max(h)