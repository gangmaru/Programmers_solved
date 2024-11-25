class Solution {
    public String solution(int n) {
        String answer = "";
        
        String subak="수박";
        int loop=0;
        
        if(n%2==0){
            loop=n/2;
            answer=subak.repeat(loop);
        }
        else{
            loop=n/2;
            answer=subak.repeat(loop)+"수";
        }
        
        return answer;
    }
}