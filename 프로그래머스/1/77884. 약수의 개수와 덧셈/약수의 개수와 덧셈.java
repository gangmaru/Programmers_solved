class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left;i<=right;i++){
            int divisor_number=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    divisor_number++;
                }
            }
            if(divisor_number%2==0){
                answer=answer+i;
            }
            else{
                answer=answer-i;
            }
        }
        
        return answer;
    }
}