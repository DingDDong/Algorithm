class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer;
        int denom;
        numer = (numer1 * denom2) + (numer2 * denom1);
        denom = denom1 * denom2;
        int i = 2;
        if(denom < numer){
            while(i <= denom){
                if(numer % i == 0 && denom % i == 0){
                    numer = numer / i;
                    denom = denom / i;
                    i = 1;
                }
                i++;
            }
        }
        else if(denom == numer){
            numer = 1;
            denom = 1;
        }
        else{
            while(i <= numer){
                if(numer % i == 0 && denom % i == 0){
                    numer = numer / i;
                    denom = denom / i;
                    i = 1;
                }
                i++;
            }
        }
        int[] answer = {numer, denom};
        return answer;
    }
}