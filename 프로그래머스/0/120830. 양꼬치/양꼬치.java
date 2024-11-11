class Solution {
    public int solution(int n, int k) {
        // 서비스 포함 총 금액
        int answer = 0;
        
        int N=n/10;
        int yang=12000;
        int cola=2000;
        
        if(N!=0){
            answer=(n*yang)+(k*cola)-(N*cola);
        }
        else{
            answer=(n*yang)+(k*cola);
        }
        return answer;
    }
}