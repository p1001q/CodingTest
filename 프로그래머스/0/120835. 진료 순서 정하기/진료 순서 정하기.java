import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Integer[] big = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(big, Collections.reverseOrder()); //내림차순 정렬

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] == big[j]) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        return answer;
    }
}