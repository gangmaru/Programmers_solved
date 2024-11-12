class Solution {
    public long[] solution(int x, int n) {
        // 크기가 n인 정답 리스트
        long[] answer = new long[n];
        
        for(int i=1;i<=n;i++){
            answer[i-1]=(long)x*i;
        }
        
        return answer;
    }
}