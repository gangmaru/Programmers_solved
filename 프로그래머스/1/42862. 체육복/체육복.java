import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        // 1. 도난 학생과 여벌 학생 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 2. 중복 set
        Set<Integer> set=new HashSet<>();
        
        // 3. 도난 queue
        Queue<Integer> que=new LinkedList<>();
        for(int l:lost){
            for(int r:reserve){
                if(l==r){
                    set.add(l); //중복된 경우만 추가(빌려줄수없음)
                    break;
                }
            }
            que.offer(l);
        }
        
        //빌려준 개수 카운트
        int count=0;
        //여벌 학생 반복문
        for(int r:reserve){
            //여벌 학생 중복이면 pass
            if(set.contains(r)) continue;
            //도난que가 여벌 학생(r-1)보다 작거나 중복이면 데이터 삭제
            while(!que.isEmpty()&&(que.peek()<r-1||set.contains(que.peek()))){
                que.poll();
            }
            //도난 que가 여벌 학생(r-1 ~ r+1) 범위면 체육복 빌려줌
            if(!que.isEmpty() && que.peek()<=r+1){
                que.poll();
                count++;
            }
        }
        // 전체 학생 - 도난학생 + 중복set + 빌려준 개수 반환
        return n-lost.length+set.size()+count;
    }
}