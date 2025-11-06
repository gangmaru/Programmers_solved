def solution(arr):
    # answer = []
    # for num in arr:
    #     if not answer or answer[-1] != num:  # 첫 원소거나 직전 값과 다르면 추가
    #         answer.append(num)
    # return answer
    
    answer=[arr[0]]
    # print(answer)
    for i in arr[1:]:
        if i != answer[-1]:
            answer.append(i)
    # print(answer)
    return answer