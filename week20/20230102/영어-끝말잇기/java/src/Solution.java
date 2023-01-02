import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, String[] words) {
        int wrongPosition = validate(words);

        if (wrongPosition == 0) {
            return new int[]{0, 0};
        }

        int wrongPersonNumber = findWrongPersonNumber(n, wrongPosition);

        int wrongCycle = findWrongCycle(n, wrongPosition);

        return new int[]{wrongPersonNumber, wrongCycle};
    }

    public int validate(String[] words) {
        List<String> usedWords = new ArrayList<>();

        usedWords.add(words[0]);

        for (int i = 0; i < words.length - 1; i += 1) {
            if (words[i].charAt(words[i].length() - 1)
                    == words[i + 1].charAt(0)) {
                if (!usedWords.contains(words[i + 1])) {
                    usedWords.add(words[i + 1]);
                    continue;
                }
                    return i + 1;
            }

            if (words[i].charAt(words[i].length() - 1)
                    != words[i + 1].charAt(0)) {
                return i + 1;
            }
        }

        return 0;
    }

    public int findWrongPersonNumber(int n, int wrongPosition) {
        return wrongPosition % n + 1;
    }

    public int findWrongCycle(int n, int wrongPosition) {
        return wrongPosition / n + 1;
    }
}
