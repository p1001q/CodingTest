class Solution {
    public int[] solution(int money) {
        int coffee=0;
        if (money>=5500) {
            for (int i=0; money>=5500; i++){
                money-=5500;
                coffee++;
            }
        }
        int[] answer = {coffee, money};
        return answer;
    }
}