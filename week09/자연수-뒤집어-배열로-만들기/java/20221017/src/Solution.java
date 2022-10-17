public class Solution {
    public int[] solution(long n) {
        return flip(longToString(n));
    }

    public String longToString(long n) {
        String s = Long.toString(n);
        return s;
    }

    public int[] flip(String s) {
        int[] result = new int[s.length()];

        for (int i = s.length() - 1; i >= 0; i -= 1) {
            result[s.length() - i - 1] = s.charAt(i) - '0';
        }

        return result;
    }
}
