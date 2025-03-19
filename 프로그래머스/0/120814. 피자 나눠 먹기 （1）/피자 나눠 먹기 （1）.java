class Solution {
    public int solution(int n) {
        int answer=0;
        
        for (int i=0; i<=15; i++){
            if (n <= 7*i) {
                answer = i;
                break;   
            }
        }
        return answer;
    }
}