class Solution {
    public int solution(int[] array, int height) {
        // 머쓱이보다 키 작은 사람 수
        int answer = 0;
        
        for(int i=0;i<array.length;i++){
            if(array[i]>height)
                answer++;
        }
        
        return answer;
    }
}