class Solution {
    public int solution(int slice, int n) {
        
        int pizza=0;
        if (n%slice!=0){
            pizza=n/slice+1;
        }
        if (n%slice==0){
            pizza=n/slice;
        }
        
        return pizza;
    }
}