import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int score(String s) {
        int score = 0;
        List<Integer> scores = new ArrayList<>();
        int listIndex = 0;
        boolean option = false;

        for (int i = 0; i < s.length(); i += 1) {
            score = 0;

            int number = Integer.parseInt(String.valueOf(s.charAt(i)));

            if(number == 1){
                if(s.charAt(i + 1) == "0".charAt(0)){
                    number = 10;
                    i += 1;
                }
            }

            i += 1;

            if("S".charAt(0) == s.charAt(i)){
                score += number;
            }

            if("D".charAt(0) == s.charAt(i)){
                score += Math.pow(number, 2);
            }

            if("T".charAt(0) == s.charAt(i)){
                score += Math.pow(number, 3);
            }

            scores.add(score);

            if(i == s.length() - 1){
                break;
            }

            if("*".charAt(0) == s.charAt(i+1)){
                scores.set(listIndex, scores.get(listIndex) * 2);
                if(listIndex > 0){
                    scores.set(listIndex - 1 , scores.get(listIndex - 1) * 2);
                }
                option = true;
            }

            if("#".charAt(0) == s.charAt(i+1)){
                scores.set(listIndex, scores.get(listIndex) * -1);

                option = true;
            }

            if(option){
                i += 1;
                option = false;
            }

            listIndex += 1;
        }

        score = 0;

        for(Integer score1 : scores){
            score += score1;
        }

        return score;
    }
}
