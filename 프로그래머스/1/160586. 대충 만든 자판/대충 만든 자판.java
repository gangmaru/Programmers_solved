import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        // 최소 횟수를 저장할 맵 생성
        Map<Character, Integer> charMinPress = new HashMap<>();
        
        // 각 키맵에서 문자와 최소 누름 횟수를 저장
        for (int i = 0; i < keymap.length; i++) {
            String keys = keymap[i];
            for (int j = 0; j < keys.length(); j++) {
                char c = keys.charAt(j);
                charMinPress.put(c, Math.min(charMinPress.getOrDefault(c, Integer.MAX_VALUE), j + 1));
            }
        }
        
        int[] result = new int[targets.length];

        // 각 target 문자열에 대해 최소 횟수를 계산
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int pressCount = 0;
            boolean canType = true;

            for (char c : target.toCharArray()) {
                if (!charMinPress.containsKey(c)) {
                    canType = false;
                    break;
                }
                pressCount += charMinPress.get(c);
            }

            result[i] = canType ? pressCount : -1;
        }

        return result;
        
        
    }
}