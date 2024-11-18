import java.util.*;
class Solution {
    public long solution(long n) {
        
        // 숫자를 문자열로 변환
        String str = Long.toString(n);
        
        // 문자열을 문자 배열로 변환
        char[] digits = str.toCharArray();
        
        // 문자 배열을 정렬
        Arrays.sort(digits);
        
        // 큰 숫자부터 작은 순으로 재배열하기 위해 역순으로 문자열 생성
        StringBuilder sorted = new StringBuilder(new String(digits)).reverse();
        
        // 문자열을 숫자로 변환하여 반환
        return Long.parseLong(sorted.toString());
    }
}