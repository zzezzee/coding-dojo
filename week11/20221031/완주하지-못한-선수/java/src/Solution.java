import java.util.Arrays;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        return compare(participant, completion);
    }

    public String compare(String[] participant, String[] completion) {
        Arrays.sort(completion);
        Arrays.sort(participant);

        for (int i = 0; i < completion.length; i += 1) {
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }

        return participant[participant.length-1];
    }
}
