class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        for (int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i); //현재 문자 하나 추출
            for (int j=0; j<n; j++) {
                answer += ch; //해당 문자 n번 반복
            }
        }
        return answer;
    }
}
