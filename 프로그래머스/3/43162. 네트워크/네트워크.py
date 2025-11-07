# def dfs(v,computers,visited):
#     stack=[v]
#     visited[v]=True
    
#     while stack:
#         node=stack.pop()
#         for i in range(len(computers)):
#             if computers[node][i]==1 and not visited[i]:
#                 visited[i]=True
#                 stack.append(i)
    
# def solution(n, computers):
#     visited=[False]*n
#     count=0
    
#     for i in range(n):
#         if not visited[i]:
#             dfs(i,computers,visited)
#             count+=1
#     return count

# def dfs(start,computers,visited):
#     stack=[start]
#     visited[start]=True
#     while stack:
#         cur=stack.pop()
#         for i in range(len(computers)):
#             if not visited[i] and computers[cur][i]==1:
#                 visited[i]=True
#                 stack.append(i)
# def solution(n, computers):
#     visited=[False]*n
#     count=0
#     for i in range(n):
#         if not visited[i]:
#             dfs(i,computers,visited)
#             count+=1
#     return count
    
def dfs(start, computers, visited):
    stack=[start]
    visited[start]=True
    
    while stack:
        cur=stack.pop()
        for i in range(len(computers)):
            if not visited[i] and computers[cur][i]==1:
                visited[i]=True
                stack.append(i)

def solution(n, computers):
    visited=[False]*(n)
    count=0
    for i in range(n):
            if not visited[i]:
                dfs(i, computers, visited)
                count+=1
    return count