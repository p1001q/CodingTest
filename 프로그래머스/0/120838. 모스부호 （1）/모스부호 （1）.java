class Solution {
    public String solution(String letter) {
        String answer = "";
        
        // 모스부호 배열 (a부터 z까지 순서대로)
        String[] morseArray = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",
            ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-","-.--","--.."
        };
        
        // 모스부호를 문자로 매핑할 Map 만들기
        java.util.Map<String, String> morseMap = new java.util.HashMap<>();
        for (int i = 0; i < morseArray.length; i++) {
            morseMap.put(morseArray[i], String.valueOf((char)('a' + i)));
        }
        
        // 입력된 모스 문자열을 공백 기준으로 분리
        String[] morseLetters = letter.split(" ");
        
        // 각 모스 부호를 알파벳으로 바꿔서 answer에 추가
        for (String morse : morseLetters) {
            answer += morseMap.get(morse);
        }
        
        return answer;
    }
}
