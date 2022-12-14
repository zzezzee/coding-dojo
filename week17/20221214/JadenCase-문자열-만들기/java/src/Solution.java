class Solution {
    public String solution(String s) {
        return toUppercase(split(s));
    }

    public String toUppercase(String[] words) {
        String answer = "";

        boolean space = true;

        for (String word : words) {
            space = !word.equals("");

            if (space) {
                answer += word.substring(0, 1).toUpperCase()
                 + word.substring(1) + " ";
            }
        }

        return answer.trim();
    }

    public String[] split(String s) {
        String[] words = s.toLowerCase().split(" ");

        return words;
    }
}
