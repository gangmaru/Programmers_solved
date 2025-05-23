class Solution {
    public String solution(String s, int n) {
        StringBuilder answer=new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch>='a'&&ch<='z'){
                char shift=(char)((ch - 'a' + n) % 26 + 'a');
                answer.append(shift);
            }else if(ch>='A'&&ch<='Z'){
                char shift=(char)((ch - 'A' + n) % 26 + 'A');
                answer.append(shift);
            }else{
                answer.append(ch);
            }
        }
        return answer.toString();
    }
}