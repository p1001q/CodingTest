class Solution {
    public double solution(int[] numbers) {
        int n=0;
        
        for(int i=0; i<numbers.length; i++){
            n += numbers[i];
        }
        
        return (double) n/numbers.length;
    }
}