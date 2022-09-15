public class Solution {
    public String solution(String s) {
        return middleWord(s);
    }

    public int inputStringSize(String s) {
        return s.length();
    }

    public boolean odd(String s) {
        if (inputStringSize(s) % 2 == 1) {
            return true;
        }

        return false;
    }

    public String middleWord(String s) {
        if (odd(s)) {
            char a = s.charAt(inputStringSize(s) / 2);

            String answer = String.valueOf(a);

            return answer;
        }

        char a = s.charAt(inputStringSize(s) / 2 -1);
        char b = s.charAt(inputStringSize(s) / 2);

        String x = String.valueOf(a);
        String y = String.valueOf(b);

        String answer = x + y;

        return answer;
    }
}
