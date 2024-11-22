import java.util.*;
class Solution {
    public String solution(String phone_number) {
        String answer="";
        
        answer= "*".repeat(phone_number.length() - 4) + 
            phone_number.substring(phone_number.length() - 4);
        // substring : 지정 위치에서 문자열 끝까지 가져온다
        // phone_number.length() - 4 : 전화번호에서 뒤의 4자리만 잘라서 가져온다
        
        return answer;
    }
}