class Solution {
    public int solution(int[] array, int n) {
        int dif = 0;
        int min = 100;
        int answer = 0;
        for(int i = 0; i < array.length; i++){
            dif = array[i] - n;
            if(dif < 0){
                dif *= -1;
            }
            if(min > dif){
                min = dif;
                answer = array[i];
            }
            if(min == dif){
                if(answer > array[i]){
                    answer = array[i];
                }
            }
        }
        return answer;
    }
}