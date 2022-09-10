class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String lowerCase = s.toLowerCase();

        int pCount = 0;
        int yCount = 0;

        for (int i = 0; i < lowerCase.length(); i += 1) {
            char charAt1 = lowerCase.charAt(i);

            if (charAt1 == 'p') {
                pCount += 1;
            }

            if (charAt1 == 'y') {
                yCount += 1;
            }
        }

        if (pCount == yCount) {
            return true;
        }

        return false;
    }
}