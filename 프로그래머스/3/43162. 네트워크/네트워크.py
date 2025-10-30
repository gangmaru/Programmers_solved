def dfs(v,computers,visited):
    stack=[v]
    visited[v]=True
    
    while stack:
        node=stack.pop()
        for i in range(len(computers)):
            if computers[node][i]==1 and not visited[i]:
                visited[i]=True
                stack.append(i)
    
def solution(n, computers):
    visited=[False]*n
    count=0
    
    for i in range(n):
        if not visited[i]:
            dfs(i,computers,visited)
            count+=1
    return count

# def dfs(start):
#     stack=[start]
#     visited=[False]*(n+1)
#     result=[]
    
#     while stack:
#         cur=stack.pop()
#         if visited[cur]:
#             continue
#         visited[cur]=True
#         result.append(cur)
        
#         for nxt in sorted(graph[cur],reverse=True):
#             if not visited[nxt]:
#                 stack.append(nxt)
#     return result