import java.util.*;
class Solution {
    public int solution(int[] nums) {
        
        // 폰켓몬 set(중복 방지)
        HashSet<Integer> pocket=new HashSet<>();
        
        // set에 폰켓몬을 넣는다
        for(int i=0;i<nums.length;i++){
            pocket.add(nums[i]);
        }
        
        if(pocket.size()>nums.length/2)
            return nums.length/2;
        
        return pocket.size();
    }
}