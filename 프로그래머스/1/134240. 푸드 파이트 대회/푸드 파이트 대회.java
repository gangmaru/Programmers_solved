import java.util.*;
class Solution {
    public String solution(int[] food) {
        StringBuilder answer=new StringBuilder();
        int loop=0;
        
        for(int i=1;i<food.length;i++){
            loop=food[i]/2;
            for(int j=0;j<loop;j++){
                answer.append(i);
            }
        }
        answer.append(0);
        for(int i=food.length-1;i>0;i--){
            loop=food[i]/2;
            for(int j=0;j<loop;j++){
                answer.append(i);
            }
        }
        
    
        return answer.toString();
    }
}