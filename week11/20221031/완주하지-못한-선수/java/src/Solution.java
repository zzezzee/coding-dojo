import java.util.Arrays;

public class Solution {
    public String compare(String[] participant, String[] completion) {
        Arrays.sort(completion);

        for (int i = 0; i < participant.length; i++) {
            boolean isFound = false;

            for (int j = 0; j < completion.length; j++) {
                if(participant[i].equals(completion[j])){
                    completion[j] = "0";
                    isFound = true;
                    System.out.println(isFound);
                    break;
                }
            }

            if(!isFound) {
                return participant[i];
            }
        }

        return "dd";
    }
}
