public class Solution {
    boolean solution(String s) {
        return count(s);
    }

    public boolean count(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i += 1) {
            if (s.charAt(i) == '(') {
                count += 1;
            }
            if (s.charAt(i) == ')') {
                count -= 1;
            }

            if (count <= -1) {
                return false;
            }
        }

        return count == 0;
    }
}
