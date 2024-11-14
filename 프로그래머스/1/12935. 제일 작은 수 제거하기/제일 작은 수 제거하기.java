class Solution {
    public int[] solution(int[] arr) {
        // 배열 크기가 1일 때
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        
        // 최소 숫자의 인덱스
        int minIndex=0;
        
        // 최소 숫자 위치 찾기
        for (int i = 0; i < arr.length; i++) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }
        
        int[] result = new int[arr.length - 1];
        
        // 인덱스 변수 초기화
        int index = 0;
        
        // 원래 배열을 순회하면서 최소 숫자 인덱스를 제외하고 결과 배열에 값 복사
        for (int i = 0; i < arr.length; i++) {
            if (i != minIndex) {
                result[index++] = arr[i]; // 최소 숫자가 아닌 경우 결과 배열에 추가
            }
        }

        return result;
    }
}