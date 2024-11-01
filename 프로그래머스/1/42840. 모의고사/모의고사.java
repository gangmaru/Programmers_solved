import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        //수포자들 점수
        int[]score={0,0,0};
        
        //수포자들 찍는 방법
        int[]A={1, 2, 3, 4, 5};
        int[]B={2, 1, 2, 3, 2, 4, 2, 5};
        int[]C={3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        //수포자들 점수 계산
        for(int i=0;i<answers.length;i++){
            if(answers[i]==A[i%5])
                score[0]++;
            if(answers[i]==B[i%8])
                score[1]++;
            if(answers[i]==C[i%10])
                score[2]++;
        }
        
        //최대 점수 구하기
        int Max=Math.max(score[0], Math.max(score[1],score[2]));
        
        //최대 점수를 가진 수포자 리스트 생성
        List<Integer> answ = new ArrayList<Integer>(); //가변길이 배열
        for(int i=0;i<score.length;i++){
            if(Max==score[i])
                answ.add(i+1);
        }
        
        int[] answer=new int[answ.size()]; //고정길이 배열
        for(int i=0;i<answ.size();i++){
            answer[i]=answ.get(i);
        }
        
        return answer;
    }
}