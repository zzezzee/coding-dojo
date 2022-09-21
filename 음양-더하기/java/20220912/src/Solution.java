public class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int size = absolutes.length;

        for (int i = 0; i < size; i += 1) {
            if(signs[i]){
                answer += absolutes[i];

                continue;
            }
            answer -= absolutes[i];
        }

        return answer;
    }
}
