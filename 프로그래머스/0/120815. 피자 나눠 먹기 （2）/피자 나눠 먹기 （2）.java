class Solution {
    public int solution(int n) {
        int answer = 0;
        //6과 n의 최소공배수/6의 값 구하기?
        for(int i=1; ; i++){
            if ((n*i)%6==0){ //i = 1인당 먹는 피자 조각 수
                answer = n*i/6; //총 피자조각 수/한판 = n판
                break;
            }
        }
        return answer;
    }
}