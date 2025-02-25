class Solution {
    int[] arr;
    int targetNumber, answer=0;
    
    public void findTargetNum(int num, int cnt){
        if(num==targetNumber&&cnt==arr.length){
            answer++;
            return;
        }
        if(cnt>=arr.length) return;
        
        findTargetNum(num-arr[cnt],cnt+1);
        findTargetNum(num+arr[cnt],cnt+1);
    }    
    public int solution(int[] numbers, int target) {
        int n=numbers.length;
        arr=new int[n];
        targetNumber=target;
        
        for(int i=0;i<n;i++){
            arr[i]=numbers[i];
        }
        
        findTargetNum(-1*arr[0],1);
        findTargetNum(arr[0],1);
        return answer;
    }
}