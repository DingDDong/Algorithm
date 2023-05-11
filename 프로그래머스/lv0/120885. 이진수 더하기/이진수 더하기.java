import java.util.*;
class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int str1 = Integer.parseInt(bin1,2);
        int str2 = Integer.parseInt(bin2,2);
        int sum = str1 + str2;
        answer = Integer.toBinaryString(sum);
        return answer;
    }
}