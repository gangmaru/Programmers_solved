def solution(arr):
    answer = 0
    for i in arr:
        answer+=i
    size=len(arr)
    answer=answer/size
    return answer