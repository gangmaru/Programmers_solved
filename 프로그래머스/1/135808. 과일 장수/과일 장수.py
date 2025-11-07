def solution(k, m, score):
    answer = 0
    box=len(score)//m
    if len(score)<m:
        return 0
    score.sort(reverse=True)
    # for box_start in range(0, len(score) - m + 1, m):
    #     box_min = score[box_start + m - 1]  # 해당 상자에서 가장 낮은 점수
    #     answer += box_min * m
    
    for i in range(box):
        box_min=score[(i+1)*m-1]
        answer+=box_min*m
    # print(score)
    # for i in range(box):
    #     s=score[-m*(i+1):]
    #     # print(s)
    #     answer+=min(s)*m
    
    return answer