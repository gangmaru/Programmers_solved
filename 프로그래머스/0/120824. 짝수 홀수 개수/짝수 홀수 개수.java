class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0, 0}; //[짝수, 홀수]
        
        for(int n:num_list){
            if(n%2==0){
                answer[0]++;
            }
            if(n%2==1){
                answer[1]++;
            }
        }
        
        return answer;
    }
}