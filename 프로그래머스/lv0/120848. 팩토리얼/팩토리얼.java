class Solution {
    public int solution(int n) {
        int answer = 0;
        int j = 2;
        while(true){
            int sum = 1;
            for(int i = 1; i < j;i++){
                sum *= i;
                answer = i;
            }
            if(sum > n)
                break;
            j++;
        }
        
        return answer - 1;
    }
}