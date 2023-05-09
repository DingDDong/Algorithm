class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int n = i; n <= j; n++){
            String s = String.valueOf(n);
            String c = String.valueOf(k);
            if(s.contains(c))
                for(int q = 0; q < s.length(); q++){
                    if(s.charAt(q) == (c.charAt(0)))
                        answer += 1;
                }
        }
        return answer;
    }
}