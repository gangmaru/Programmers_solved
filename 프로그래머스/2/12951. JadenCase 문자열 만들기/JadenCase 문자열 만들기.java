class Solution {
    public String solution(String s) {
        String answer = "";
        String bs = " " + s;

        for (int i=1;i<bs.length();i++){
            if (bs.charAt(i-1)==' '){
                answer+=Character.toUpperCase(bs.charAt(i));
            }else{
                answer+=Character.toLowerCase(bs.charAt(i));
            }
        }

        return answer;
    }
}