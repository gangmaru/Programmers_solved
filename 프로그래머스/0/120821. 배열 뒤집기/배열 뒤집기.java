import java.util.*;
class Solution {
    public int[] solution(int[] numlist) {
        int size=numlist.length;
        
        int[] answer = new int[size];
        int index=0;
        
        for(int i=size-1;i>=0;i--){
            answer[index]=numlist[i];
            index++;
        }
        
        return answer;
    }
}