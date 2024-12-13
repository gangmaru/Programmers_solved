class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] canBabble={"aya", "ye", "woo", "ma"};
        
        for(String word:babbling){
            boolean isValid=true;
            
            String prev="";
            
            for(String sound:canBabble){
                if(word.contains(sound+sound)){
                    isValid=false;
                }
                word=word.replace(sound," ");
            }
            if (isValid && word.trim().isEmpty()) {
                answer++;
            }
        }
        
        return answer;
    }
}