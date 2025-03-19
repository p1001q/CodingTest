class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        for (int i=1; ; i++){
            if (n<=slice*i){
                answer=i;
                break;
            }
        }
        return answer;
    }
}