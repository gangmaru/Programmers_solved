# def solution(array, commands):
#     answer = []
    
#     for i,j,k in commands:
#         slice=array[i-1:j]
#         slice=sorted(slice)
#         answer.append(slice[k-1])
#     return answer

def solution(array, commands):
    answer=[]
    for i,j,k in commands:
        arr=array[i-1:j]
        arr=sorted(arr)
        arr=arr[k-1]
        answer.append(arr)
    return answer