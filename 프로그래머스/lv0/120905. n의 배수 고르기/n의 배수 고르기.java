import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> temp = new ArrayList<Integer>();
        int j = 0;
        for(int i = 0; i < numlist.length;i++){
            if(numlist[i] % n == 0){
                temp.add(numlist[i]);
            }
        }
        int[] answer = temp.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}