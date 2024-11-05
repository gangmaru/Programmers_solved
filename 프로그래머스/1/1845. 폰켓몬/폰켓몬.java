import java.util.*;
class Solution {
    public int solution(int[] nums) {
        
        // 최대 폰켓몬 수
        int max=nums.length/2;
        
        // 폰켓몬 set(중복 방지)
        Set<Integer> pocket=new HashSet<>();
        
        // set에 폰켓몬을 넣는다
        for(int n:nums){
            pocket.add(n);
        }
        
        // 폰켓몬 최대 수와 set 사이즈 중 큰 값 반환
        return max<pocket.size()? max:pocket.size();
        
    }
}