import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] arr = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(arr);
        for(int i = 0; i < emergency.length; i++){
            for(int j = 0; j < emergency.length; j++){
                if(arr[i] == emergency[j]){
                    answer[j] = emergency.length - i;
                }
            }
        }
        return answer;
    }
}