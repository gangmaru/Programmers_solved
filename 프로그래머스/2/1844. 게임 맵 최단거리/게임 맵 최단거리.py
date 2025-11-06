# from collections import deque
# def bfs(maps, start):
#     row=len(maps)
#     col=len(maps[0])
#     queue=deque([start])
#     visited=set([start])
#     dist={start:1}
    
#     while queue:
#         x,y=queue.popleft()
#         if (x,y)==(row-1,col-1):
#             return dist[(x,y)]
        
#         for (nx,ny) in [(x+1, y), (x-1,y), (x,y+1), (x,y-1)]:
#             if 0<=nx<row and 0<=ny<col and maps[nx][ny]==1:
#                 if (nx,ny) not in visited:
#                     visited.add((nx,ny))
#                     queue.append((nx,ny))
#                     dist[(nx,ny)]=dist[(x,y)]+1
#     return -1

# def solution(maps):
#     return bfs(maps,(0,0))
# ------------------------------------------------
# from collections import deque
# dx=[0,0,1,-1]
# dy=[1,-1,0,0]
# def bfs(start, end, maps):
#     q=deque([start])
#     visited=[[False]*len(maps) for _ in range(len(maps[0]))]
#     while q:
#         cur_y, cur_x=q.popleft()
#         if visited[cur_y][cur_x]:
#             continue
#         visited[cur_y][cur_x]=True
#         for i in range(4):
#             nx=dx[i]+cur_x
#             ny=dy[i]+cur_y
#             if nx<0 or nx>=len(maps) or ny<0 or ny>=len(maps[0]):
#                 continue
#             if visited[ny][nx] or maps[ny][nx]==0:
#                 continue
#             q.append((ny,nx))
            
# def solution(maps):
#     return bfs(0,0, maps)

from collections import deque
dx = [0, 0, 1, -1]  # 동서남북
dy = [1, -1, 0, 0]

def bfs(start, maps):
    n = len(maps)        # 세로 길이
    m = len(maps[0])     # 가로 길이

    q = deque([start])
    visited = [[0]*m for _ in range(n)]  # 방문 + 거리 기록용
    visited[start[0]][start[1]] = 1      # 시작점 거리 1

    while q:
        cur_y, cur_x = q.popleft()

        # 상대팀 진영 도착 시 거리 반환
        if cur_y == n-1 and cur_x == m-1:
            return visited[cur_y][cur_x]

        for i in range(4):
            ny = cur_y + dy[i]
            nx = cur_x + dx[i]

            # 범위 벗어나면 무시
            if nx < 0 or nx >= m or ny < 0 or ny >= n:
                continue
            # 벽(0)이거나 이미 방문했다면 무시
            if maps[ny][nx] == 0 or visited[ny][nx] != 0:
                continue

            # 다음 칸 방문, 거리 +1
            visited[ny][nx] = visited[cur_y][cur_x] + 1
            q.append((ny, nx))

    # 끝까지 도달 못하면 -1
    return -1

def solution(maps):
    return bfs((0, 0), maps)
