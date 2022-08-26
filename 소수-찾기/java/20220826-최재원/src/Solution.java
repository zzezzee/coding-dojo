public class Solution {
    public int solution(int n) {
        int answer = 0;

        int range = 1000001;

        int[] numbers = new int[range];

        for(int i = 0; i<range; i += 1){
            numbers[i] = i;
        }

        for(int i = 2; i<range; i+=1){
            if(numbers[i] == 0){
                continue;
            }

            for(int j = 2; j<range/i; j+=1)
                numbers[i*j] = 0;
        }

        for(int i = 2; i<= n; i+=1){
            if(numbers[i] != 0){
                answer += 1;
            }
        }

        return answer;
    }
}
