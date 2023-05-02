class Solution {
    public int solution(int n) {
        int answer = 2;
        for(int i = 0; i < 10000; i++){
            if(n == i * i)
                answer = 1;
        }
        return answer;
    }
}