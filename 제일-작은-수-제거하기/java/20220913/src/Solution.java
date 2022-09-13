class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];

        if(arr.length == 1){
            int[] one = new int[]{-1};
            return one;
        }

        int min = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i += 1){
            if(arr[i]< min){
                min = arr[i];
                minIndex = i;
            }
        }

        for(int i = minIndex + 1; i < arr.length; i += 1){
            arr[i - 1] = arr[i];
        }


        for(int i = 0; i < answer.length; i += 1){
            answer[i] = arr[i];
        }

        return answer;
    }
}