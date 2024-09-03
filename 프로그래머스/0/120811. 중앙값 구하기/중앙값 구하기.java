class Solution {
    public int solution(int[] array) {
        int center = 0;
        int size=array.length;
        int addr=(size+1)/2;
        int tmp;
        
        for (int i = 0; i < size - 1; i++) {
        for (int j = 0; j < size - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                tmp=array[j];
                array[j]=array[j+1];
                array[j+1]=tmp;
            }
        }
    }
               
        center=array[addr-1];
        return center;
    }
}