public class Solution {
    public String waterMelon(int number) {
        String answer = "";

        for (int i = 1; i < number + 1; i += 1) {
            if (i % 2 == 1) {
                answer = answer + "수";
            }
            if (i % 2 == 0) {
                answer = answer + "박";
            }
        }

        return answer;
    }
}
