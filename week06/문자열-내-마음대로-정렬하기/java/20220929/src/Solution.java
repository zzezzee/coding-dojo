import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        return answer;
    }

    public boolean sameWord(String[] strings, int n) {
        for (int i = 0; i < strings.length; i += 1) {
            for (int j = i + 1; j < strings.length; j += 1) {
                char c = strings[i].charAt(n);
                char comparingChar = strings[j].charAt(n);

                if (c == comparingChar) {
                    return true;
                }
            }
        }

        return false;
    }

    public String[] switchDifferentWord(String[] strings, int n) {

        for (int i = 0; i < strings.length; i += 1) {
            for (int j = i + 1; j < strings.length; j += 1) {
                char c = strings[i].charAt(n);
                char comparingChar = strings[j].charAt(n);

                if (c > comparingChar) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }

        return strings;
    }

    public String[] switchSameWord(String[] strings, int n) {
        for (int i = 0; i < strings.length; i += 1) {
            for (int j = i + 1; j < strings.length; j += 1) {
                char c = strings[i].charAt(n);
                char comparingChar = strings[j].charAt(n);

                if (c == comparingChar) {
                    for (int k = 0; k < strings.length; k += 1) {
                        if (strings[i].charAt(k) > strings[j].charAt(k)) {
                            String temp = strings[i];
                            strings[i] = strings[j];
                            strings[j] = temp;
                        }
                    }
                }

                if (c > comparingChar) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }

        return strings;
    }
}
