class Solution {
    public String solution(String s) {
        
        String[] arr=s.split(" ");
        
        int[] num=new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            num[i]=Integer.parseInt(arr[i]);
        }
        
        int max=num[0];
        int min=max;
        
        for(int i=1;i<num.length;i++){
            if(max<num[i])
                max=num[i];
            if(min>num[i])
                min=num[i];
        }
        
        return min+" "+max;
    }
}