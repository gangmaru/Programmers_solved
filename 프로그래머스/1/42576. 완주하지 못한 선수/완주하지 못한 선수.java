import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        
        // 정답
        String answer = "";
        
        // 선수 기록 map
        Map<String, Integer> map=new HashMap<>();
        
        // 1. 참가자 > 완주자 -> 완주자만큼 반복
        for(int i=0;i<completion.length;i++){
            String p=participant[i];
            String c=completion[i];
            map.put(p,map.getOrDefault(p,0)+1); //참가자는 +1
            map.put(c,map.getOrDefault(c,0)-1); //완주자는 -1
        }
        
        // 2. 마지막 참가를 더한다
        map.put(participant[participant.length-1], 
                map.getOrDefault(participant[participant.length-1],0)+1);
        
        // 3. value가 1인 참가자가 완주를 못한 참가자
        for(String key : map.keySet()){
            if(map.get(key)==1){
                answer=key;
                break;
            }
        }
        
        // 4. 정답 리턴
        return answer;
    }
}