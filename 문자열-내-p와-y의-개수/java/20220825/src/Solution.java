class Solution {
    boolean solution(String s) {
        String lowerCase = s.toLowerCase();

        int pCount = 0;
        int yCount = 0;

        for (int i = 0; i < lowerCase.length(); i += 1) {
            char charAt = lowerCase.charAt(i);

            if (charAt == 'p') {
                pCount += 1;
            }

            if (charAt == 'y') {
                yCount += 1;
            }
        }

        if (pCount == yCount) {
            return true;
        }

        return false;
    }
}