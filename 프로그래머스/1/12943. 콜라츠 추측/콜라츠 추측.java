class Solution {
    public int solution(long num) {
        int count=0;
        
        while(true){
            if(num==1||count>=500)
                break;
            
            count++;
            
            if(num%2==0)
                num=num/2;
            else
                num=num*3+1;
        }
        
        if(num==1)
            return count;
        else
            return -1;
    }
}