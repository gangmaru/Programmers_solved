import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> hallofFame = new PriorityQueue<>();
        List<Integer> dailyMinScores = new ArrayList<>();
        
        for(int s:score){
            hallofFame.offer(s);
            
            if(hallofFame.size()>k){
                hallofFame.poll();
            }
            
            dailyMinScores.add(hallofFame.peek());
        }
        
        return dailyMinScores.stream().mapToInt(Integer::intValue).toArray();
    }
}