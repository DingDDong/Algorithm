class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] arr = new int[numbers.length];
        for(int i = 0; i < numbers.length - 1; i++){
            if(direction.equals("right")){
                arr[i+1] = numbers[i];
                arr[0] = numbers[numbers.length-1];
            }
            if(direction.equals("left")){
                arr[i] = numbers[i+1];
                arr[numbers.length-1] = numbers[0];
            }
        }
        return arr;
    }
}