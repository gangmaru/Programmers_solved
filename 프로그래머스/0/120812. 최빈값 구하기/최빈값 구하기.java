class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int size=array.length;
        int tmp;

        // 배열 정렬하기
        // Arrays.sort(array);
        for (int a=0;a<size-1;a++){
            for (int b=0;b<size-a-1;b++){
                if (array[b]>array[b+1]){
                    tmp=array[b];
                    array[b]=array[b+1];
                    array[b+1]=tmp;
                }
            }
        }

        // 배열의 길이 결정하기
        int max = array[array.length - 1]; // 배열속 최대값을
        int[] count = new int[max + 1]; // count 배열의 길이로 보겠다

        // 반복
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++; // count 배열에 하나하나 누적해 쌓기, array[1], [2]... [4]... , array의 길이반큼 반복해서
        }

        int freqValue = count[0];// freqValue에 count 배열 속의 첫번째 값을 일단 넣어둔다

        for (int i = 1; i < count.length; i++) {
            if (freqValue < count[i]) {
                freqValue = count[i];
                answer = i;
            } else if (freqValue == count[i]) {
                answer = -1;
            }
        }

        return answer;
        
        
    }
}