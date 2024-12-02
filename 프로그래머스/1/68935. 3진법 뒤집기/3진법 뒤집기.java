import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> n3=new ArrayList<>();
        int mok=n;
        
        while(mok!=0){
            n3.add(mok%3);
            mok=mok/3;
        }
        
        int cnt=n3.size()-1;
        for(int i:n3){
            answer=answer+(int)(i*Math.pow(3,cnt--));
        }
        
        return answer;
    }
}