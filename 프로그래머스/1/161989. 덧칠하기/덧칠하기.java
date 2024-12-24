class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int check=0;
        
        for(int sec:section){
            if(check>=sec){
                continue;
            }else{
                check=sec+(m-1);
                answer+=1;
            }
            if(check>=n)
                break;
        }
        return answer;
    }
}