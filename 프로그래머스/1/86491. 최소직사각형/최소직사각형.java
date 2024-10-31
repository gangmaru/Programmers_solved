class Solution {
    public int solution(int[][] sizes) {
        
        // 1. 가로와 세로를 정렬
        for(int i=0;i<sizes.length;i++){
            for(int j=0;j<sizes[0].length;j++){
                if(sizes[i][0]>sizes[i][1]){
                    int tmp=sizes[i][0];
                    sizes[i][0]=sizes[i][1];
                    sizes[i][1]=tmp;
                }
            }
        }
        
        // 2. 가로와 세로의 최대값 구하기
        int wMax=0;
        int hMax=0;
        for(int[] n:sizes){
            wMax=Math.max(wMax,n[0]);
            hMax=Math.max(hMax,n[1]);
        }
        
        return wMax*hMax;
        
        
    }
}