import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        //정답 리스트
        List<Integer> list=new ArrayList<>();
        
        //
        for(int i=0;i<commands.length;i++){
            //실제 인덱스 기준과 문제 인덱스가 달라서 -1을 해서 실제 인덱스에 맞춘다.
            int start=commands[i][0]-1; //시작 인덱스
            int end=commands[i][1]-1; //끝 인덱스
            int search=commands[i][2]-1; //찾는 인덱스
            
            //슬라이싱 할 배열의 인덱스
            int index=0;
            
            //슬라이싱 배열 생성
            int[] arr=new int[end-start+1];
            
            // 1. commands에 맞춰 배열을 슬라이싱한다
            for(int j=0;j<array.length;j++){
                if(j>=start && j<=end){
                    arr[index++]=array[j];
                }
            }
            
            // 2. 슬라이싱한 배열을 정렬
            Arrays.sort(arr);
            
            // 3. 검색 인덱스(k) 값을 list에 저장
            for(int j=0;j<arr.length;j++){
                if(j==search)
                    list.add(arr[j]);
            }
        }
        
        // 4. list를 배열로 반환
        return list.stream().mapToInt(Integer::intValue).toArray();
        
    }
}