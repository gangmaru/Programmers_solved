from collections import deque
n=int(input())
myq=deque()

for i in range(1,n+1):
    myq.append(i)
    
while len(myq)>1:
    myq.popleft()
    myq.append(myq.popleft())
    
print(myq[0])