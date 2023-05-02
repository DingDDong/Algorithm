import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] index = new int[1000];
        int max = -1;
        int temp = 0;
        for(int i = 0; i < array.length; i++){
            index[array[i]]++;
        }
        for(int i = 0; i < index.length; i++){
            if(max < index[i]){
                max = index[i];
                answer = i;
            }
        }
        for(int i = 0; i < index.length; i++){
            if(max == index[i]){
                temp++;
            }
        }
        if(temp > 1){
            return -1;
        }
        return answer;
    }
}