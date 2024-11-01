import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        //answer=가로*세로
        int[] answer = new int[2];
        
        //카펫 수=brown + yellow
        int total=brown+yellow;
        
        //가로, 세로 최소값 구하기
        //가로: 노랑 1개면 갈색은 양 옆 2 필요 -> (1+2=3)
        //세로: 노랑 1개면 갈색은 위아래 2 필요 -> (1+2=3)
        int start=3;
        
        //가로, 세로 최대값 구하기
        //가로, 세로가 최소값 3부터 시작해서 
        // total/3하면 가로, 세로 최대값 나옴
        int end=total/3;
        
        //완전 탐색
        for(int w=start;w<=end;w++){
            for(int h=start;h<=end;h++){
                //1. 카펫수 total==갈색*노랑
                //2. 노랑 수==위아래, 양 옆 가장자리 뺀 개수
                //3. 가로>=세로
                if((total==w*h)&&(yellow==(w-2)*(h-2))&&(w>=h)){
                    answer[0]=w;
                    answer[1]=h;
                    return answer;
                }
            }
        }
        
        return answer;
    }
}