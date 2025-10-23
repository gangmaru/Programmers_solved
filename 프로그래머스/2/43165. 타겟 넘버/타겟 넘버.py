# def solution(numbers, target):
#     def dfs(cnt, current_sum):
#         if cnt == len(numbers):
#             if current_sum == target:
#                 return 1
#             else:
#                 return 0
#         return dfs(cnt + 1, current_sum + numbers[cnt]) + dfs(cnt + 1, current_sum - numbers[cnt])
#     return dfs(0, 0)


def solution(numbers, target):
    def dfs(idx, total):
        if idx==len(numbers):
            if total==target:
                return 1
            else:
                return 0
        return dfs(idx+1, total+numbers[idx])+dfs(idx+1, total-numbers[idx])
    return dfs(0,0)