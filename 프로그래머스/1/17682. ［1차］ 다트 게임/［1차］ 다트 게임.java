class Solution {
    public int solution(String dartResult) {
        int[] result=new int[3];
        int score=0;
        int sum=0;
        int k=0;
        String s="";
        
        for(int i=0;i<dartResult.length();i++){
            char ch=dartResult.charAt(i);
            
            switch(ch){
                case 'S':
                    score=Integer.parseInt(s);
                    result[k++]=(int)Math.pow(score,1);
                    s="";
                    break;
                case 'D':
                    score=Integer.parseInt(s);
                    result[k++]=(int)Math.pow(score,2);
                    s="";
                    break;
                case 'T':
                    score=Integer.parseInt(s);
                    result[k++]=(int)Math.pow(score,3);
                    s="";
                    break;
                case '*':
                    result[k-1]*=2;
                    if(k-2>=0)
                        result[k-2]*=2;
                    break;
                case '#':
                    result[k-1]*=-1;
                    break;
                default:
                    s=s+String.valueOf(ch);
                    score=Integer.parseInt(s);
                    break;
            }
            sum=result[0]+result[1]+result[2];
        }
        return sum;
    }
}