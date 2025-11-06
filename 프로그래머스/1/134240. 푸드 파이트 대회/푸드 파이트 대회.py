def solution(food):
    answer = ''
    for i,cnt in enumerate(food):
        answer+=str(i)*(cnt//2)
    return answer+"0"+answer[::-1]