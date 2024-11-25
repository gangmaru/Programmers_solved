import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr=s.toCharArray();
        
        Arrays.sort(arr);
        
        for(int i = 1; i <= arr.length; i++) {
            answer=answer+arr[arr.length-i];
        }
                
        return answer;
    }
}