import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> list= new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    int add=nums[i]+nums[j]+nums[k];
                    if(add%2!=0){ //짝수면 소수가 아니니까
                        list.add(nums[i]+nums[j]+nums[k]);
                    }
                }
            }
        }
        for(int l:list){
            boolean flag=false;
            for(int i=2;i<l;i++){
                if(l%i==0){
                    flag=true;
                    break;
                }
            }
            if(flag==false)
                answer++;
        }

        return answer;
    }
}