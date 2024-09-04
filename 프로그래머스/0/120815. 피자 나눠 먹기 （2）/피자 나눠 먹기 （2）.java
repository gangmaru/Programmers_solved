class Solution {
    public int solution(int n) {
        
        int pizza=0;
        int piece=0;
        
        for(int i=1;i<=n;i++){
            if(n%i==0 && 6%i==0){
                piece=i*(n/i)*(6/i);
            }
            
        }
        pizza=piece/6;
        return pizza;
        
    }
}