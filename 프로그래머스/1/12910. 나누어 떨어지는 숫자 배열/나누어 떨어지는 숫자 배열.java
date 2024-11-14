import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        // 가변 길이 정답 리스트
        List<Integer> answer=new ArrayList<Integer>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0)
                answer.add(arr[i]);
        }
        
        if(answer.isEmpty()){
            answer.add(-1);
        }
        
        int[] list=answer.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(list);
        return list;
    }
}