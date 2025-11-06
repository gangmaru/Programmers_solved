def solution(s):
    answer = []
    dict={}
    for i, char in enumerate(s):
        if char in dict:
            answer.append(i-dict[char])
        else:
            answer.append(-1)
        dict[char]=i
    return answer