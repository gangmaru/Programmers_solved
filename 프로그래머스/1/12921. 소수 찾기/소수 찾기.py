import math
def solution(n):
    test=[True]*(n+1)
    test[0], test[1]=False, False
    
    for i in range(2, int(math.sqrt(n))+1):
        if test[i]:
            for j in range(i*i,n+1,i):
                test[j]=False
    return sum(test)