import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        List<Integer> list=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            // 리스트가 비어있으면 넣기
            if(list.isEmpty()){
                list.add(arr[i]);
            }
            // 리스트가 비어있지 않으면
            else{
                // 리스트의 마지막 값과 현재 숫자와 비교해서 다르면 리스트에 추가
                if(list.get(list.size()-1)!=arr[i]){
                    list.add(arr[i]);
                }
            }
        }

        // ArrayList를 array로 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}