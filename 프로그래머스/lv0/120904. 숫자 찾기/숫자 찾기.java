import java.util.stream.*;
class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        int[] digits = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        for(int i = 0; i < digits.length;i++){
            if(digits[i] == k){
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}