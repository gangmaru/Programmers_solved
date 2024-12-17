class Solution {
    public int solution(int number, int limit, int power) {
        int result = 0;
        int[] division= new int[number];
        
        for(int i=1;i<=number;i++){
            int cnt=0;
            for(int j=1;j*j<=i;j++){
                if(i%j==0){
                    cnt++;
                    if(j!=i/j){
                        cnt++;
                    }
                }
            }
            if(cnt > limit){
                result += power;
            }else{
                result += cnt;
            }
        }        
        return result;
    }
}