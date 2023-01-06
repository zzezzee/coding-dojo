import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] solution(String msg) {
        List<String> dictionary = makeDictionary();

        List<Integer> output = new ArrayList<>();

        int[] answer = compression(dictionary, msg, output);

        return answer;
    }

    public List<String> makeDictionary() {
        List<String> dictionary = new ArrayList<>();

        char word = 'A';

        for (int i = 0; i < 26; i += 1) {
            dictionary.add(String.valueOf(word));
            word += 1;
        }

        return dictionary;
    }

    public int[] compression(List<String> dictionary, String msg, List<Integer> result) {
        for (int i = 0; i < msg.length(); i += 1) {
            for (int j = dictionary.size() - 1; j >= 0; j -= 1) {
                if (msg.substring(i).startsWith(dictionary.get(j))) {
                    i += dictionary.get(j).length() - 1;
                    result.add(j + 1);

                    if (i + 1 < msg.length()){
                        dictionary.add(dictionary.get(j) + msg.charAt(i + 1));
                    }

                    break;
                }
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
