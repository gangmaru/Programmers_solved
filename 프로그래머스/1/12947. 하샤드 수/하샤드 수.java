class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        // 합 구하기
        String sum = Integer.toString(x);
        int sum_n = 0;
        
        for(int i = 0; i<sum.length() ; i++){
            sum_n += sum.charAt(i)-48;
        }

        if(x%sum_n==0){
            answer = true;
        } else {
            answer = false;
        }
        return answer;
        
    }
}