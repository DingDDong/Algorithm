class Solution {
    public long solution(int balls, int share) {
        long answer = 1;
        int den = 1;
        int dif = balls - share;
        while(balls > dif){
            answer = (answer*balls)/den;
            balls--;
            den++;
        }
        return answer;
    }
}