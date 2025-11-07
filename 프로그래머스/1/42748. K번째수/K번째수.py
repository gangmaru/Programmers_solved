def solution(array, commands):
    answer=[]
    for i,j,k in commands:
        arr=array[i-1:j]
        arr=sorted(arr)
        arr=arr[k-1]
        answer.append(arr)
    return answer