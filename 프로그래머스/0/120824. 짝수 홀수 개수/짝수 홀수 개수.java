class Solution {
    public int[] solution(int[] num_list) {
        int e =0, o=0;
        for (int i=0; i<num_list.length; i++){
            if (num_list[i]%2==0){
                e++;
            }else{
                o++;
            }
        }
        
        int[] answer = {e,o};
        return answer;
    }
}