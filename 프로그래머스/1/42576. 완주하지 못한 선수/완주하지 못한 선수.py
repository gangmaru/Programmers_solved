# def solution(participant, completion):
#     answer={}
#     for p in participant:
#         if p in answer:
#             answer[p]+=1
#         else:
#             answer[p]=1
#     for c in completion:
#         answer[c]-=1
#     return ''.join(name for name in answer if answer[name]==1)

def solution(participant, completion):
    answer={}
    for p in participant:
        if p in answer:
            answer[p]+=1
        else:
            answer[p]=1
    for c in completion:
        if c in answer:
            answer[c]-=1
    return ''.join(a for a in answer if answer[a]==1)

