import java.util.*;
class Solution {
    public int solution(String before, String after) {
        String[] befArr = before.split("");
        String[] aftArr = after.split("");
        Arrays.sort(befArr);
        Arrays.sort(aftArr);
        int answer = 1;
        for(int i = 0; i < before.length();i++){
            if(!befArr[i].equals(aftArr[i]))
                answer = 0;
        }
        return answer;
    }
}