class Solution {
    public int solution(String my_string) {
        if(!my_string.matches(".*[0-9].*"))
            return 0;
        String[] arr = my_string.replaceAll("[^0-9]+"," ").trim().split(" ");
        int answer = 0;
        for(int i = 0; i < arr.length;i++){
            answer += Integer.parseInt(arr[i]);
            System.out.println(arr[i]);
        }
        return answer;
    }
}