from queue import PriorityQueue
import sys
input=sys.stdin.readline
n=int(input())
print=sys.stdout.write
myq=PriorityQueue()

for i in range(n):
    request=int(input())
    if request==0:
        if myq.empty():
            print('0\n')
        else:
            temp=myq.get()
            print(str((temp[1]))+'\n')
    else:
        myq.put((abs(request),request))