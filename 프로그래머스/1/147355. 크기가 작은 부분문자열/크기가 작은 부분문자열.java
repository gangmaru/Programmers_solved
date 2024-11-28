class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int plen=p.length();
        long plong=Long.parseLong(p);
        
        for(int i=0;i<=t.length()-plen;i++){
            String substring=t.substring(i,i+plen);
            long substringValue=Long.parseLong(substring);
            
            if(substringValue<=plong){
                answer++;
            }
        }
        
        return answer;
    }
}