def solution(n, lost, reserve):
    # 도난도 당하고 여벌도 있는 학생은 제외 (자기 것만 있음)
    lost_set = set(lost) - set(reserve)
    reserve_set = set(reserve) - set(lost)

    # 여벌 있는 학생이 앞 번호 → 뒷 번호 순서로 체육복 빌려주기
    for r in sorted(reserve_set):
        if r - 1 in lost_set:
            lost_set.remove(r - 1)
        elif r + 1 in lost_set:
            lost_set.remove(r + 1)

    # 수업 들을 수 있는 학생 수 = 전체 - 아직도 체육복 없는 사람 수
    return n - len(lost_set)