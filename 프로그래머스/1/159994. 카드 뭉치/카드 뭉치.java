class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int j=0; 
        int k=0;
        
        for(String g : goal) {
            if(j < cards1.length && cards1[j].equals(g)) {
                j++;
            } else if(k < cards2.length && cards2[k].equals(g)) {
                k++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}