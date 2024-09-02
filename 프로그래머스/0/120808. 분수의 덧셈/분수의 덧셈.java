class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        
        int numer=numer1*denom2+numer2*denom1;
        int denom=denom1*denom2;
        
        int gcd=GCD(numer,denom);
        
        numer=numer/gcd;
        denom=denom/gcd;
        
        
        int[] answer = {numer,denom};
        
        
        return answer;
    }
    
    public int GCD(int n, int m){
        while(m!=0){
            int tmp=n%m;
            n=m;
            m=tmp;
        }
        return n;
    }
    
}