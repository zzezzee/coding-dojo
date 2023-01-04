import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int heavy = people.length - 1;
        int light = 0;

        while (heavy >= light) {
            if (people[heavy] + people[light] <= limit){
                light += 1;
            }

            answer += 1;
            heavy -= 1;
        }

        return answer;
    }
}
