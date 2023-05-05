
class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        String[] s = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : s){
            for(int i = 0; i < morse.length; i++){
                if(word.equals(morse[i])){
                    sb.append(Character.toString(i + 'a'));                    
                }
            }
        }
        
        return sb.toString();
    }
}