class Solution {
    public String solution(int age) {
        String answer = "";
        char[] mapping = {'a','b','c','d','e','f','g','h','i','j'};

        String str = String.valueOf(age); //숫자 > 문자열

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0'; //문자 > 숫자
            answer += mapping[num];
        }

        return answer;
    }
}