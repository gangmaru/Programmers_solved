def solution(n, lost, reserve):
    answer = 0
    con_lost=list(set(lost)-set(reserve))
    con_reserve=list(set(reserve)-set(lost))
    
    for i in range(n):
        if not i+1 in con_lost:
            answer+=1
    
    for i in range(len(con_reserve)):
        if con_reserve[i]-1 in con_lost:
            con_lost.remove(con_reserve[i]-1)
            answer+=1
        elif con_reserve[i]+1 in con_lost:
            con_lost.remove(con_reserve[i]+1)
            answer+=1
                
    
    return answer