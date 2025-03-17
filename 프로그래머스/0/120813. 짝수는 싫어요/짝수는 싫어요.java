import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { //홀수 검사
                list.add(i);
            }
        }
        
        //ArrayList를 배열로 변환하여 반환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
