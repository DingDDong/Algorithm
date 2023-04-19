class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String d1 : s1)
            for(String d2 : s2)
                if(d1.equals(d2))
                    answer += 1;
        return answer;
    }
}