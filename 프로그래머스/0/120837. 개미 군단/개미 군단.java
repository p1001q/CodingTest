class Solution { //그리디 알고리즘
    public int solution(int hp) {
        int count = 0;
        
        count += hp / 5;  //장군개미
        hp %= 5;
        
        count += hp / 3;  //병정개미
        hp %= 3;
        
        count += hp;      //일개미
        
        return count;
    }
}