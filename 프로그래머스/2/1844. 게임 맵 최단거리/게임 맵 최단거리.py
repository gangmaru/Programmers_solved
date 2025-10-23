# from collections import deque

# def bfs(maps,start):
#     row=len(maps)
#     col=len(maps[0])
#     queue=deque([start]) #큐
#     visited=set([start]) #세트
#     dist={start:1} #딕셔너리
    
#     while queue:
#         x,y=queue.popleft()
        
#         if (x,y)==(row-1, col-1):
#             return dist[(x,y)]
        
#         for nx,ny in [(x+1,y), (x-1,y), (x,y+1), (x,y-1)]:
#             if 0<=nx<row and 0<=ny<col and maps[nx][ny]==1:
#                 if (nx,ny) not in visited:
#                     queue.append((nx,ny))
#                     visited.add((nx,ny))
#                     dist[(nx,ny)]=dist[(x,y)]+1
#     return -1
    
# def solution(maps):    
#     return bfs(maps,(0,0))
from collections import deque
def bfs(maps,start):
    queue=deque([start])
    visited=set([start])
    row=len(maps)
    col=len(maps[0])
    dist={start:1}
    
    while queue:
        x,y=queue.popleft()
        if (x,y)==(row-1,col-1):
            return dist[(x,y)]
        
        for nx,ny in [(x+1,y), (x-1,y), (x,y+1), (x,y-1)]:
            if 0<=nx<row and 0<=ny<col and maps[nx][ny]==1:
                if (nx,ny) not in visited:
                    visited.add((nx,ny))
                    queue.append((nx,ny))
                    dist[(nx,ny)]=dist[(x,y)]+1
    return -1

def solution(maps):
    return bfs(maps,(0,0))