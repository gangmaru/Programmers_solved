# def dfs(graph, start):
#     stack = [start]
#     path = []  # 여행 경로

#     while stack:
#         cur = stack[-1]
#         # 현재 공항에서 출발할 항공권이 남아 있으면
#         if graph[cur]:
#             # 알파벳 순으로 가장 앞서는 곳으로 이동
#             next_dest = graph[cur].pop(0)
#             stack.append(next_dest)
#         else:
#             # 더 이상 갈 곳이 없으면 경로에 추가
#             path.append(stack.pop())

#     # 역순으로 완성됨 (스택의 후입선출 때문)
#     return path[::-1]


# def solution(tickets):
#     graph = {}

#     # 그래프 구성
#     for a, b in tickets:
#         if a in graph:
#             graph[a].append(b)
#         else:
#             graph[a] = [b]

#     # 목적지 알파벳순 정렬
#     for key in graph:
#         graph[key].sort()

#     # DFS 수행
#     return dfs(graph, "ICN")
def dfs(graph, start):
    stack = [start]
    path = []

    while stack:
        cur = stack[-1]
        # graph[cur]가 항상 존재하도록 만든 상태이므로 안전하게 사용 가능
        if graph[cur]:
            # 알파벳 순으로 앞서는 목적지를 먼저 사용하기 위해 리스트에서 pop(0)
            next_dest = graph[cur].pop(0)
            stack.append(next_dest)
        else:
            path.append(stack.pop())

    return path[::-1]

def solution(tickets):
    graph = {}

    # 모든 공항을 키로 초기화 (출발지와 도착지 모두)
    for a, b in tickets:
        if a not in graph:
            graph[a] = []
        if b not in graph:
            graph[b] = []
        graph[a].append(b)

    # 목적지 리스트를 알파벳 오름차순으로 정렬
    for key in graph:
        graph[key].sort()

    return dfs(graph, "ICN")