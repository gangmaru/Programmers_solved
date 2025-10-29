def solution(nums):
    answer = 0
    poket={}
    check=set()
    for i in nums:
        poket[i]=poket.get(i,0)+1
    for num,cnt in poket.items():
        if num not in check and answer<len(nums)/2:
            check.add(num)
            answer+=1
    return answer