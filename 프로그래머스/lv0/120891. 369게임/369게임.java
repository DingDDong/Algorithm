class Solution {
    public int solution(int order) {
        int answer = 0;
        String s = Integer.toString(order);
        String[] arrNum = s.split("");
        for(int i = 0; i < arrNum.length; i++){
            if(arrNum[i].equals("3") || arrNum[i].equals("6") || arrNum[i].equals("9"))
                answer++;
        }
        return answer;
    }
}