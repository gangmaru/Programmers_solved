import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        
        Double[][] failRate = new Double[N][2];
        int totalPlayers = stages.length; 
        
        for(int stage = 1; stage <= N ; stage++){
            int challengers = 0; //해당 스테이지의 이용자 수
            for(int s : stages){
                if(s == stage){
                    challengers += 1;
                }
            }
            failRate[stage-1][0] = (double) stage;
            //실패율 = challengers / totalPlayers;
            if(totalPlayers == 0){
                failRate[stage-1][1] = 0.0;
            }else{
                failRate[stage-1][1] = (double)challengers / (double)totalPlayers;
            }        
            
            //다음 단계로 못 간 이용자 제외
            totalPlayers -= challengers;
        }
        
        Double[][] sortedArray = Arrays.stream(failRate)
                                .sorted(Comparator.comparingDouble((Double[] a) -> a[1]).reversed())
                                .toArray(Double[][]::new);

        
        int[] answer = new int[N];
        for(int i=0; i<sortedArray.length; i++){
            answer[i] = sortedArray[i][0].intValue();
        }

        return answer;
    }
}